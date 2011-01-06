/*
 * libxjava -- utility library for cross-Java-platform development
 *             ${project.name}
 *
 * Copyright (c) 2010 Marcel Patzlaff (marcel.patzlaff@gmail.com)
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

/**
 *
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class TaskFuture {
    private final static int STATE_RUNNING= 1;
    private final static int STATE_RAN= 2;
    private final static int STATE_CANCELLED= 4;
    
    /*package*/ Runnable target;
    /*package*/ ScheduledTaskExecutor executor;
    
    /**
     * Helper field for the task queue to build a linked list
     * of task futures.
     */
    /*package*/ TaskFuture next;
    
    /*package*/ long start;
    /*package*/ long period;
    
    private Thread _workThread;
    private int _state;
    private final Object _mutex;
    
    protected TaskFuture() {
        _mutex= new Object();
    }
    
    public final boolean isCancelled() {
        synchronized (_mutex) {
            return _state == STATE_CANCELLED;
        }
    }
    
    public final boolean isDone() {
        synchronized(_mutex) {
            return (_state & (STATE_RAN | STATE_CANCELLED)) != 0 && _workThread == null;
        }
    }

    public final boolean isPeriodic() {
        return period > 0;
    }

    public final boolean cancel(boolean mayInterruptIfRunning) {
        synchronized (_mutex) {
            if((_state & (STATE_RAN | STATE_CANCELLED)) != 0) {
                return false;
            }
            
            _state= STATE_CANCELLED;
            
            if(mayInterruptIfRunning && _workThread != null) {
                _workThread.interrupt();
            }
        }
        
        executor.removeTask(this);
        return true;
    }
    
    public final long getDelayInMillis() {
        long delay= start - System.currentTimeMillis(); 
        return delay >= 0L ? delay : 0L;
    }

    /*package*/ final void doRun() {
        try {
            synchronized (_mutex) {
                if(_state != 0) {
                    return;
                }
                
                _state= STATE_RUNNING;
                _workThread= Thread.currentThread();
            }
            target.run();
            
            // TODO: what with periodic execution???
        } finally {
            synchronized (_mutex) {
                _workThread= null;
                if(_state == STATE_RUNNING) {
                    _state= STATE_RAN;
                }
            }
        }
    }
}
