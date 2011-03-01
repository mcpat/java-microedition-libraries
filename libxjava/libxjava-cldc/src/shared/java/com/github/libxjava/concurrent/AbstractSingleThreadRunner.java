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


/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public abstract class AbstractSingleThreadRunner {
    public final static byte STARTED= 0x01;
    public final static byte STOPPED= 0x02;
    
    private final static byte TRANSITION= 0x10;
    private final static byte STARTING= TRANSITION | STARTED;
    private final static byte STOPPING= TRANSITION | STOPPED;
    
    private final class Executor implements Runnable {
        protected final String name;
        
        private Thread _workThread;
        private final Object _mutex;
        private int _state;
        
        Executor(String name) {
            _mutex= new Object();
            this.name= name == null ? AbstractSingleThreadRunner.this.getClass().getName() : name;
            _state= STOPPED;
        }

        public void run() {
            synchronized (_mutex) {
                _workThread= Thread.currentThread();
                _state= STARTED;
                _mutex.notifyAll();
            }
            
            try {
                doRun();
            } finally {
                synchronized (_mutex) {
                    _state= STOPPED;
                    _workThread= null;
                    _mutex.notifyAll();
                }
            }
        }
        
        boolean start() {
            synchronized (_mutex) {
                if(_state == STOPPED) {
                    _state= STARTING;
                    
                    forkExecution(this, name);
                    return true;
                }
            }
            
            return false;
        }
        
        boolean stop() {
            synchronized (_mutex) {
                if(_state == STARTED) {
                    _state= STOPPING;
                    unblock();
                    return true;
                }
            }
            
            return false;
        }
        
        void interrupt() {
            synchronized (_mutex) {
                if(_workThread != null) {
                    _workThread.interrupt();
                }
            }
        }
        
        boolean isInState(byte requiredState) {
            synchronized (_mutex) {
                return _state == requiredState;
            }
        }
        
        boolean waitForState(final long timeout, final byte requiredState) throws InterruptedException {
            final long start= System.currentTimeMillis();
            
            synchronized (_mutex) {
                while(_state != requiredState) {
                    if((_state & TRANSITION) <= 0 || Thread.currentThread() == _workThread) {
                        return false;
                    }
                    
                    long toWait= timeout - (System.currentTimeMillis() - start);
                    if(toWait > 0) {
                        _mutex.wait(toWait);
                    } else {
                        throw new InterruptedException("timed out");
                    }
                }
            }
            
            return true;
        }
    }
    
    private final Executor _executor;
    
    protected AbstractSingleThreadRunner(String name) {
        _executor= new Executor(name);
    }
    
    public final String getName() {
        return _executor.name;
    }
    
    public final boolean start() {
        return _executor.start();
    }
    
    public final boolean stop() {
        return _executor.stop();
    }
    
    public final boolean isInState(byte requiredState) {
        return _executor.isInState(requiredState);
    }
    
    public final boolean waitForState(int timeout, byte requiredState) throws InterruptedException {
        return _executor.waitForState(timeout, requiredState);
    }
    
    protected abstract void doRun();
    
    /**
     * This method is called on behalf of the {@link #start()} method.
     * It must set up the concurrent execution of the specified runnable.
     * <p>
     * The default implementation just creates a new thread and starts it.
     * </p>
     * @param runnable      to execute in a concurrent thread
     * @param name          an optional name for the thread
     */
    protected void forkExecution(Runnable runnable, String name) {
        new Thread(runnable, name).start();
    }
    
    /**
     * This method is called on behalf of the {@link #stop()} method.
     * <p>
     * If the runner performs blocking operations like I/O reads or
     * synchronized waits, the implementing class should unblock/notify
     * the runner in this method.
     * </p>
     * <p>
     * The default implementation just signals interruption to the
     * working thread
     * </p>
     * 
     */
    protected void unblock() {
        _executor.interrupt();
    }
    
    protected final boolean isCancelled() {
        return _executor.isInState(STOPPING);
    }
}
