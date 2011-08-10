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

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class ScheduledTaskExecutor {
    private static final class FutureWrapper<V> implements RunnableScheduledFuture<V> {
        protected final TaskFuture tf;
        protected final RunnableScheduledFuture<V> of;
        
        protected FutureWrapper(TaskFuture tf, RunnableScheduledFuture<V> of) {
            this.tf= tf;
            this.of= of;
            tf.future= of;
        }

        public boolean cancel(boolean mayInterruptIfRunning) {
            return of.cancel(mayInterruptIfRunning);
        }

        public boolean isCancelled() {
            return of.isCancelled();
        }

        public boolean isDone() {
            return of.isDone();
        }

        public V get() throws InterruptedException, ExecutionException {
            return of.get();
        }

        public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return of.get(timeout, unit);
        }

        public long getDelay(TimeUnit unit) {
            return of.getDelay(unit);
        }

        public int compareTo(Delayed o) {
            return of.compareTo(o);
        }

        public void run() {
            of.run();
        }

        public boolean isPeriodic() {
            return of.isPeriodic();
        }
    }
    
    private static final TaskFuture unwrapTaskFuture(Future<?> future) {
        FutureWrapper<?> wrapper= (FutureWrapper<?>) future;
        return wrapper.tf;
    }
    
    private final class ScheduledThreadPoolExecutorExtender extends ScheduledThreadPoolExecutor {
        protected ScheduledThreadPoolExecutorExtender(int corePoolSize, IThreadFactory threadFactory) {
            super(corePoolSize, (ThreadFactory) threadFactory);
        }
        
        @Override
        protected final void afterExecute(Runnable r, Throwable t) {
            ScheduledTaskExecutor.this.afterExecute(((FutureWrapper<?>) r).tf, t);
            super.afterExecute(r, t);
        }

        @Override
        protected final void beforeExecute(Thread t, Runnable r) {
            ScheduledTaskExecutor.this.beforeExecute(t, ((FutureWrapper<?>) r).tf);
            super.beforeExecute(t, r);
        }
        
        @Override
        protected final <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) {
            return new FutureWrapper<V>(createTaskFuture(callable), task);
        }
        
        @Override
        protected final <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) {
            return new FutureWrapper<V>(createTaskFuture(runnable), task);
        }
    }
    
    private final ScheduledThreadPoolExecutor _executorImpl;
    
    public ScheduledTaskExecutor(int initialPoolSize, int maxPoolSize, long keepAliveTimeInMillis, IThreadFactory threadFactory) {
        _executorImpl= new ScheduledThreadPoolExecutorExtender(maxPoolSize, threadFactory);
        _executorImpl.setKeepAliveTime(keepAliveTimeInMillis, TimeUnit.MILLISECONDS);
        _executorImpl.allowCoreThreadTimeOut(true);
        
        for(int i= 0; i < initialPoolSize; i++) {
            _executorImpl.prestartCoreThread();
        }
    }
    
    public int getMaximumPoolSize() {
        return _executorImpl.getMaximumPoolSize();
    }
    
    public TaskFuture submit(Runnable target) {
        return unwrapTaskFuture(_executorImpl.submit(target));
    }
    
    public TaskFuture schedule(Runnable target, long delayInMillis) {
        return unwrapTaskFuture(_executorImpl.schedule(target, delayInMillis, TimeUnit.MILLISECONDS));
    }
    
    public TaskFuture scheduleAtFixedRate(Runnable target, long delayInMillis, long periodInMillis) {
        return unwrapTaskFuture(_executorImpl.scheduleAtFixedRate(target, delayInMillis, periodInMillis, TimeUnit.MILLISECONDS));
    }
    
    public void shutdown() {
        _executorImpl.shutdownNow();
    }

    protected void beforeExecute(Thread workThread, TaskFuture task) {
        // do nothing
    }
    
    protected void afterExecute(TaskFuture task, Throwable t) {
        task.future= null;
    }

    protected TaskFuture createTaskFuture(Object target) {
        return new TaskFuture();
    }
}