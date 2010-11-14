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

import java.util.NoSuchElementException;

import com.github.libxjava.util.BasicEnumeration;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class BasicArrayList {
    private Object[] _data;
    private int _size;
    
    public BasicArrayList() {
        this(10);
    }
    
    public BasicArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
        
        _data= new Object[initialCapacity];
        _size= 0;
    }
    
    public boolean add(Object obj) {
        ensureCapacity(_size + 1);
        _data[_size++]= obj;
        return true;
    }
    
    public void add(int index, Object obj) {
        if (index > _size || index < 0) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+_size);
        }
        ensureCapacity(_size + 1);
        System.arraycopy(_data, index, _data, index + 1, _size - index);
        _data[index]= obj;
        _size++;
    }
    
    public void clear() {
        for(int i= 0; i < _size; ++i) {
            _data[i]= null;
        }
        _size= 0;
    }
    
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }
    
    public void ensureCapacity(int minCapacity) {
        int oldCapacity = _data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 3)/2 + 1;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            
            Object[] newData= new Object[newCapacity];
            System.arraycopy(_data, 0, newData, 0, _size);
            _data= newData;
        }
    }
    
    public BasicEnumeration enumeration() {
        return new BasicEnumeration() {
            private int _index= 0;
            private int _lastReturned= -1;

            public boolean hasMoreElements() {
                return _index < _size;
            }

            public Object nextElement() {
                if(_index < _size) {
                    Object result= _data[_index];
                    _lastReturned= _index++;
                    return result;
                }
                
                throw new NoSuchElementException("ArrayList Enumeration");
            }

            public void remove() {
                if(_lastReturned < 0) {
                    throw new RuntimeException("illegal state");
                }
                
                BasicArrayList.this.remove(_lastReturned);
                _index--;
                _lastReturned= -1;
            }
        };
    }
    
    public Object get(int index) {
        if (index >= _size) {
            throw new IndexOutOfBoundsException( "Index: "+index+", Size: "+_size);
        }
        return _data[index];
    }
    
    public int indexOf(Object obj) {
        if(obj == null) {
            for(int i= 0; i < _size; ++i) {
                if(_data[i] == null) {
                    return i;
                }
            }
        } else {
            for(int i= 0; i < _size; ++i) {
                if(obj.equals(_data[i])) {
                    return i;
                }
            }
        }
        
        
        return -1;
    }
    
    public boolean isEmpty() {
        return _size == 0;
    }
    
    public int lastIndexOf(Object obj) {
        if(obj == null) {
            for(int i= _size - 1; i >= 0; --i) {
                if(_data[i] == null) {
                    return i;
                }
            }
        } else {
            for(int i= _size - 1; i >= 0; --i) {
                if(obj.equals(_data[i])) {
                    return i;
                }
            }
        }
        
        
        return -1;
    }
    
    public void trimToSize() {
        if(_size < _data.length) {
            Object[] newData= new Object[_size];
            System.arraycopy(_data, 0, newData, 0, _size);
            _data= newData;
        }
    }
    
    public boolean remove(Object obj) {
        int index= indexOf(obj);
        
        if(index >= 0) {
            internalRemove(index);
            return true;
        }
        
        return false;
    }
    
    public Object remove(int index) {
        if (index >= _size) {
            throw new IndexOutOfBoundsException( "Index: "+index+", Size: "+_size);
        }
        
        Object old= _data[index];
        internalRemove(index);
        return old;
    }
    
    public Object set(int index, Object obj) {
        if (index >= _size) {
            throw new IndexOutOfBoundsException( "Index: "+index+", Size: "+_size);
        }
        
        Object old= _data[index];
        _data[index]= obj;
        return old;
    }
    
    public int size() {
        return _size;
    }
    
    public String toString() {
        if(_size <= 0) {
            return "[]";
        }
        
        StringBuffer result= new StringBuffer();
        result.append('[');
        final int last= _size - 1;
        for(int i= 0; i <= last; ++i) {
            result.append(_data[i] == this ? "(this List)" : _data[i]);
            
            if(i < last) {
                result.append(", ");
            }
        }
        
        result.append(']');
        return result.toString();
    }

    private void internalRemove(int index) {
        int toMove= _size - index - 1;
        
        if(toMove > 0) {
            System.arraycopy(_data, index + 1, _data, index, toMove);
        }
    }
}
