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

package com.github.libxjava.util;

/**
 * @author Marcel Patzlaff
 */
public class FixedSizeQueue {
    private final Object[] _content;
    
    private int _pushPointer;
    private int _popPointer;
    private int _count;
    
    public FixedSizeQueue(int maxSize) {
        _content= new Object[maxSize];
        _pushPointer= _popPointer= _count= 0;
    }
    
    
    public Object put(Object obj) {
        synchronized (_content) {
            final Object oldObj= _content[_pushPointer];
            _content[_pushPointer]= obj;
            _pushPointer= (_pushPointer + 1) % _content.length;
            
            if(_count < _content.length) {
                _count++;
            } else {
                // we have overwritten the oldest item
                _popPointer= (_popPointer + 1) % _content.length; 
            }
            
            _content.notify();
            return oldObj;
        }
    }
    
    public Object get() {
        synchronized (_content) {
            while(_count <= 0) {
                try {
                    _content.wait();
                } catch (InterruptedException e) {
                    // ignore
                    break;
                }
            }
            
            return pop();
        }
    }
    
    public Object get(long timeout) {
        synchronized (_content) {
            if(timeout > 0 && _count <= 0) {
                try {
                    _content.wait(timeout);
                } catch (InterruptedException e) {
                    // ignore
                }
            }
            
            return pop();
        }
    }
    
    private Object pop() {
        Object obj= null;
        if(_count > 0) {
            obj= _content[_popPointer];
            _content[_popPointer]= null;
            _popPointer= (_popPointer + 1) % _content.length;
            _count--;
        }
        
        return obj;
    }
}
