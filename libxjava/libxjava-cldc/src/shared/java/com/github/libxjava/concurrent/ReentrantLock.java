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
 * Implementation of an "unfair" reentrant lock.
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class ReentrantLock {
    private Thread _owner;
    private int _counter;
    
    private final Object _sync;
    
    public ReentrantLock() {
        _owner= null;
        _counter= 0;
        _sync= new Object();
    }
    
    /**
     * Blocks until this lock becomes available. A call
     * to this method is not interruptible!
     * 
     * @see #lockInterruptibly()
     */
    public void lock() {
        boolean interrupted= false;
        for(;;) {
            try {
                lockInterruptibly();
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
     * Blocks until this lock becomes available.
     * If the current thread is already the owner of this lock, internal
     * acquisition counter is incremented.
     * 
     * <p>Ensure that you {@link #unlock() release} this lock as often as you
     * acquired it!</p>
     * 
     * If this thread is interrupted an {@link InterruptedException} will
     * be thrown.
     * 
     * @throws InterruptedException
     */
    public void lockInterruptibly() throws InterruptedException {
        synchronized (_sync) {
            while(_owner != null && _owner != Thread.currentThread()) {
                _sync.wait();
            }
            
            _owner= Thread.currentThread();
            _counter++;
        }
    }
    
    /**
     * Tries to obtain the ownership of this lock and returns immediately.
     * 
     * @return      {@code true} if acquisition was successful and {@code false} otherwise.
     */
    public boolean tryLock() {
        synchronized (_sync) {
            if(_owner == null || _owner == Thread.currentThread()) {
                _owner= Thread.currentThread();
                _counter++;
                return true;
            }
            
            return false;
        }
    }
    
    /**
     * Decrements the internal acquisition counter for this lock.
     * If the counter is zero afterwards, this lock is released.
     * 
     * If the current thread is not owner of this lock an
     * {@link IllegalMonitorStateException} will be thrown.
     * 
     * @throws IllegalMonitorStateException
     */
    public void unlock() throws IllegalMonitorStateException {
        synchronized (_sync) {
            if(_owner != Thread.currentThread()) {
                throw new IllegalMonitorStateException("the caller thread is not the owner of this lock");
            }
            
            _counter--;
            
            if(_counter == 0) {
                _owner= null;
                _sync.notify();
            }
        }
    }
    
    /**
     * Checks whether the current thread is the owner of this lock.
     */
    public boolean isOwner() {
        synchronized (_sync) {
            return _owner == Thread.currentThread();
        }
    }
    
    /**
     * Returns the state of the internal acquisition counter.
     */
    public int getCount() {
        synchronized (_sync) {
            return _counter;
        }
    }
}
