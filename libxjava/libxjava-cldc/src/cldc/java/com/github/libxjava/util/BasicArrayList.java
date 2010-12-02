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

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class BasicArrayList {
    private final class Enumerator implements BasicEnumeration {
        private int _index;
        private int _lastReturned;
        private int _expectedModCount;
        
        protected Enumerator(int modCount) {
            _index= 0;
            _lastReturned= -1;
            _expectedModCount= modCount;
        }
        
        public boolean hasMoreElements() {
            return _index < size();
        }

        public Object nextElement() {
            ensureUnmodified();
            
            try {
                Object val= BasicArrayList.this.get(_index);
                _lastReturned= _index++;
                return val;
            } catch (IndexOutOfBoundsException e) {
                ensureUnmodified();
                throw new NoSuchElementException("ArrayList Enumeration");
            }
        }

        public void remove() {
            if(_lastReturned < 0) {
                throw new RuntimeException("illegal state");
            }
            
            ensureUnmodified();
            try {
                BasicArrayList.this.remove(_lastReturned);
                _index--;
                _lastReturned= -1;
                _expectedModCount= _modCount;
            } catch (IndexOutOfBoundsException e) {
                throw new RuntimeException("concurrent modification");
            }
        }
        
        private void ensureUnmodified() {
            if(_modCount != _expectedModCount) {
                throw new RuntimeException("concurrent modification");
            }
        }
    }
    
    private Object[] _data;
    private int _size;
    
    // has to be private here because otherwise it breaks the API
    private int _modCount;
    
    public BasicArrayList() {
        this(10);
    }
    
    public BasicArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
        
        _data= new Object[initialCapacity];
        _size= 0;
        _modCount= 0;
    }
    
    public boolean add(Object obj) {
        ensureCapacity(_size + 1);
        _data[_size++]= obj;
        return true;
    }
    
    public void add(int index, Object obj) {
        checkIndex(index);
        ensureCapacity(_size + 1);
        System.arraycopy(_data, index, _data, index + 1, _size - index);
        _data[index]= obj;
        _size++;
    }
    
    public void clear() {
        _modCount++;
        for(int i= 0; i < _size; ++i) {
            _data[i]= null;
        }
        _size= 0;
    }
    
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }
    
    public void ensureCapacity(int minCapacity) {
        _modCount++;
        int oldCapacity = _data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity= (oldCapacity * 3)/2 + 1;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            
            Object[] newData= new Object[newCapacity];
            System.arraycopy(_data, 0, newData, 0, _size);
            _data= newData;
        }
    }
    
    public BasicEnumeration enumeration() {
        return new Enumerator(_modCount);
    }
    
    public Object get(int index) {
        checkIndex(index);
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
        _modCount++;
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
        checkIndex(index);
        
        Object old= _data[index];
        internalRemove(index);
        return old;
    }
    
    public Object set(int index, Object obj) {
        checkIndex(index);
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
    
    private void checkIndex(int index) {
        if (index >= _size) {
            throw new IndexOutOfBoundsException("index " + index + ", size " + _size);
        }
    }

    private void internalRemove(int index) {
        _modCount++;
        int toMove= _size - index - 1;
        
        if(toMove > 0) {
            System.arraycopy(_data, index + 1, _data, index, toMove);
        }
        
        _data[--_size]= null;
    }
}