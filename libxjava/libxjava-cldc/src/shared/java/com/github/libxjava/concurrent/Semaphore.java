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
 * Implementation of an "unfair" semaphore.
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class Semaphore {
    private int _permits;
    private final Object _sync;
    
    /**
     * Constructor for a Semaphore.
     * 
     * @param permits       the initial amount of permits
     */
    public Semaphore(int permits) {
        _permits= permits;
        _sync= new Object();
    }
    
    /**
     * Blocks until a permit is available and acquires it. A call
     * to this method is not interruptible!
     * <p>
     * Same as {@code acquire(1)};
     * </p>
     * @see #acquireInterruptibly()
     */
    public void acquire() {
        acquire(1);
    }
    
    /**
     * Blocks until {@code permits} permits are available and acquires them. A call
     * to this method is not interruptible!
     * 
     * @see #acquireInterruptibly()
     */
    public void acquire(int permits) {
        if(permits <= 0) {
            throw new IllegalArgumentException("permits must be a positive value");
        }
        
        boolean interrupted= false;
        for(;;) {
            try {
                acquireInterruptibly(permits);
                break;
            } catch (InterruptedException ie) {
                interrupted= true;
            }
        }
        
        if(interrupted) {
            Thread.currentThread().interrupt();
        }
    }
    
    /**
     * Blocks until a permit is available and acquires it. If this
     * thread is interrupted an {@link InterruptedException} will
     * be thrown.
     * <p>
     * Same as {@code acquireInterruptibly(1)};
     * </p>
     * 
     * @throws InterruptedException
     * 
     * @see #acquire()
     */
    public void acquireInterruptibly() throws InterruptedException {
        acquireInterruptibly(1);
    }
    
    /**
     * Blocks until {@code permits} permits are available and acquires them. If this
     * thread is interrupted an {@link InterruptedException} will
     * be thrown.
     * 
     * @throws InterruptedException
     * 
     * @see #acquire()
     */
    public void acquireInterruptibly(int permits) throws InterruptedException, IllegalArgumentException {
        if(permits <= 0) {
            throw new IllegalArgumentException("permits must be a positive value");
        }
        
        synchronized (_sync) {
            while(_permits < permits) {
                _sync.wait();
            }
            
            _permits-= permits;
        }
    }
    
    /**
     * Releases a permit. If other threads are waiting they get
     * notified.
     * <p>
     * Same as {@code release(1)};
     * </p>
     */
    public void release() {
        release(1);
    }
    
    /**
     * Releases {@code permits} permits. If other threads are waiting they get
     * notified.
     */
    public void release(int permits) {
        if(permits <= 0) {
            throw new IllegalArgumentException("permits must be a positive value");
        }
        
        synchronized (_sync) {
            _permits+= permits;
            _sync.notify();
        }
    }
    
    /**
     * Tries to acquire a permit and returns immediately.
     * <p>
     * Same as {@code tryAcquire(1)};
     * </p>
     * 
     * @return      {@code true} if acquisition was successful and {@code false} otherwise.
     */
    public boolean tryAcquire() {
        return tryAcquire(1);
    }
    
    /**
     * Tries to acquire {@code permits} permits and returns immediately.
     * 
     * @return      {@code true} if acquisition was successful and {@code false} otherwise.
     */
    public boolean tryAcquire(int permits) {
        if(permits <= 0) {
            throw new IllegalArgumentException("permits must be a positive value");
        }
        
        synchronized (_sync) {
            if(_permits >= permits) {
                _permits-= permits;
                return true;
            }
            
            return false;
        }
    }
    
    public int getPermits() {
        synchronized (_sync) {
            return _permits;
        }
    }
}
