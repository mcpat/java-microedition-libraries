/*
 * libxjava - utility library for cross-Java-platform development
 *            ${project.name}
 *
 * Copyright (c) 2010-2011 Marcel Patzlaff (marcel.patzlaff@gmail.com)
 *
 * This library is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.libxjava.concurrent;

import com.github.libxjava.util.BasicArrayList;


/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class ScheduledTaskExecutor {
    private static final class TaskQueue {
        private TaskFuture _head;
        private int _count;
        private int _waitingThreads;
        
        TaskQueue() {
            _head= null;
            _waitingThreads= 0;
            _count= 0;
        }
        
        synchronized void addTask(TaskFuture task) {
            if(task.next != null) {
                throw new IllegalArgumentException("task already in queue");
            }
            
            if(_head == null) {
                _head= task;
                this.notify();
            } else if(_head.start > task.start) {
                task.next= _head;
                _head= task;
                this.notify();
            } else {
                TaskFuture previous= _head;
                for(TaskFuture comp= previous.next; comp != null && comp.start <= task.start; previous= comp, comp= comp.next);
                task.next= previous.next;
                previous.next= task;
            }
            
            _count++;
        }
        
        synchronized void removeTask(TaskFuture task) {
            if(_head == task) {
                _head= task.next;
                task.next= null;
                _count--;
                return;
            }
            TaskFuture previous= _head;
            for(; previous != null && previous.next != task; previous= previous.next);
            
            if(previous != null) {
                previous.next= task.next;
                task.next= null;
                _count--;
            }
        }
        
        synchronized TaskFuture waitForTask(final long deadline) throws InterruptedException {
            _waitingThreads++;
            try {
                for(;;) {
                    long currentTime= System.currentTimeMillis();
                    long waitUntil= deadline;
                    if(_head != null) {
                        if(currentTime >= _head.start) {
                            TaskFuture task= _head;
                            _head= _head.next;
                            task.next= null;
                            _count--;
                            return task;
                        } else {
                            waitUntil= _head.start;
                        }
                    }
                    
                    if(currentTime >= deadline) {
                        return null;
                    }
                    
                    long toWait= waitUntil - currentTime;
                    if(toWait > 0) {
                        this.wait(toWait);
                    }
                }
            } finally {
                _waitingThreads--;
            }
        }
        
        synchronized void clear() {
            TaskFuture previous= _head;
            while(previous != null) {
                TaskFuture next= previous.next;
                previous.next= null;
                previous= next;
                _count--;
            }
        }
        
        synchronized boolean hasUnassignedTasks() {
            return _waitingThreads <= 0 && _count > 0;
        }
    }
    
    private final class Worker implements Runnable {
        /*package*/ Thread thread;
        
        protected Worker() {}
        
        public void run() {
            try {
                TaskFuture task= null;
                while((task= getTask()) != null) {
                    executeTask(task);
                    task= null;
                }
            } finally {
                workerDone(this);
            }
        }
        
        private void executeTask(TaskFuture task) {
            beforeExecute(thread, task);
            Throwable t= null;
            try {
                task.doRun();
            } catch (RuntimeException re) {
                t= re;
            }
            afterExecute(task, t);
        }
    }
    
    private final IThreadFactory _threadFactory;
    private final TaskQueue _taskQueue;
    private final int _maxPoolSize;
    private final long _keepAliveTimeInMillis;
    private final BasicArrayList _workers;
    
    private boolean _shutdown;
    
    private final Object _mainMutex= new Object();
    
    public ScheduledTaskExecutor(int initialPoolSize, int maxPoolSize, long keepAliveTimeInMillis, IThreadFactory threadFactory) {
        if(initialPoolSize < 0 || maxPoolSize < 0 || initialPoolSize > maxPoolSize) {
            throw new IllegalArgumentException("pool sizes");
        }
        
        _shutdown= false;
        _maxPoolSize= maxPoolSize;
        _threadFactory= threadFactory;
        _taskQueue= new TaskQueue();
        _keepAliveTimeInMillis= keepAliveTimeInMillis;
        _workers= new BasicArrayList();
        
        synchronized (_mainMutex) {
            for(int i= 0; i < initialPoolSize; i++) {
                createAndStartThread();
            }
        }
    }
    
    public TaskFuture submit(Runnable target) {
        return scheduleAtFixedRate(target, 0L, 0L);
    }
    
    public TaskFuture schedule(Runnable target, long delayInMillis) {
        return scheduleAtFixedRate(target, delayInMillis, 0L);
    }
    
    public TaskFuture scheduleAtFixedRate(Runnable target, long delayInMillis, long periodInMillis) {
        if(delayInMillis < 0 || periodInMillis < 0) {
            throw new IllegalArgumentException("delay or period");
        }
        TaskFuture task= createAndInitialiseTaskFuture(target, delayInMillis, periodInMillis);
        addTaskForExecution(task);
        return task;
    }
    
    public void shutdown() {
        _shutdown= true;
        
        synchronized (_mainMutex) {
            for(int i= _workers.size() - 1; i >= 0; i--) {
                ((Worker) _workers.get(i)).thread.interrupt();
            }
        }
        
        _taskQueue.clear();
    }
    
    protected void beforeExecute(Thread workThread, TaskFuture task) {
        // do nothing
    }
    
    protected void afterExecute(TaskFuture task, Throwable t) {
        // do nothing
    }
    
    protected TaskFuture createTaskFuture(Object target) {
        return new TaskFuture();
    }
    
    /*package*/ TaskFuture getTask() {
        long deadline= _keepAliveTimeInMillis + System.currentTimeMillis();
        try {
            while(!_shutdown) {
                try {
                    return _taskQueue.waitForTask(deadline);
                } catch (InterruptedException e) {
                    // just reenter the loop
                }
            }
        } finally {
            ensureEnoughThreadsStarted();
        }
        
        return null;
    }
    
    /*package*/ void addTask(TaskFuture task) {
        _taskQueue.addTask(task);
    }
    
    /*package*/ void removeTask(TaskFuture task) {
        _taskQueue.removeTask(task);
    }
    
    /*package*/ void workerDone(Worker worker) {
        synchronized (_mainMutex) {
            _workers.remove(worker);
        }
    }
    
    private TaskFuture createAndInitialiseTaskFuture(Runnable target, long delay, long period) {
        TaskFuture task= createTaskFuture(target);
        task.executor= this;
        task.target= target;
        task.start= System.currentTimeMillis() + delay;
        task.period= period;
        return task;
    }
    
    /*
     *  all callers hold _mainMutex
     */
    private void createAndStartThread() {
        Worker worker= new Worker();
        Thread thr= _threadFactory.newThread(worker);
        worker.thread= thr;
        _workers.add(worker);
        thr.start();
    }
    
    private void addTaskForExecution(TaskFuture task) {
        synchronized (_mainMutex) {
            if(_shutdown) {
                return;
            }
            
            _taskQueue.addTask(task);
            ensureEnoughThreadsStarted();
        }
    }
    
    private void ensureEnoughThreadsStarted() {
        synchronized (_mainMutex) {
            if(_shutdown) {
                return;
            }
            
            if(_taskQueue.hasUnassignedTasks()) {
                if(_workers.size() < _maxPoolSize) {
                    createAndStartThread();
                } else {
                    // FIXME: what should we do here?
                    System.err.println("WARNING: not enough worker threads");
                }
            }
        }
    }
}