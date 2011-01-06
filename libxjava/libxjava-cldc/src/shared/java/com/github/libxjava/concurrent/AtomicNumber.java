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
public final class AtomicNumber {
    private final Object _mutex;
    
    private int _value;
    
    public AtomicNumber() {
        this(0);
    }
    
    public AtomicNumber(int initialValue) {
        _mutex= new Object();
        _value= initialValue;
    }
    
    public int get() {
        synchronized (_mutex) {
            return _value;
        }
    }
    
    public boolean compareAndSet(int expected, int newValue) {
        synchronized (_mutex) {
            if(_value != expected) {
                return false;
            }
            
            _value= newValue;
            return true;
        }
    }
    
    public int updateAndGet(int diff) {
        synchronized (_mutex) {
            _value+= diff;
            return _value;
        }
    }
    
    public int getAndUpdate(int diff) {
        synchronized (_mutex) {
            int result= _value;
            _value+= diff;
            return result;
        }
    }
    
    public int getAndSet(int newValue) {
        synchronized (_mutex) {
            int result= _value;
            _value= newValue;
            return result;
        }
    }
    
    public void set(int newValue) {
        synchronized (_mutex) {
            _value= newValue;
        }
    }
}
