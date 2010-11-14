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
 * @version ${project.artifactId} - ${project.version}
 */
public class IntHashMap {
    private final static class Entry {
        int key;
        Object value;
        Entry next;
        
        Entry(int key, Object value, Entry next) {
            this.key= key;
            this.value= value;
            this.next= next;
        }
    }

    private final static int LOAD_PERCENT_FACTOR= 75;

    private Entry[] _table;
    private int _count;
    private int _threshold;

    public IntHashMap() {
        this(20);
    }

    public IntHashMap(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }

        if (initialCapacity == 0) {
            initialCapacity= 1;
        }
        
        _table= new Entry[initialCapacity];
        _threshold= (initialCapacity * LOAD_PERCENT_FACTOR) / 100;
    }

    public void clear() {
        Entry[] tab= _table;
        for(int i= 0; i < tab.length; ++i) {
            tab[i]= null;
        }
        
        _count= 0;
    }

    public boolean containsKey(int key) {
        return getEntry(key) != null;
    }

    public boolean containsValue(Object value) {
        if (value == null) {
            Entry[] tab= _table;
            for (int i= 0; i < tab.length; i++) {
                for (Entry e= tab[i]; e != null; e= e.next) {
                    if (e.value == null) {
                        return true;
                    }
                }
            }
        } else {
            Entry[] tab= _table;
            for (int i= 0; i < tab.length; i++) {
                for (Entry e= tab[i]; e != null; e= e.next) {
                    if (value.equals(e.value)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    
    public Object[] elements() {
        Object[] result= new Object[_count];
        Entry entry= null;
        for(int i= 0, e= 0; i < _count; ++i) {
            while(entry == null) {
                entry= _table[e++];
            }
            
            result[i]= entry.value;
            entry= entry.next;
        }
        return result;
    }

    public Object get(int key) {
        Entry e= getEntry(key);
        return e != null ? e.value : null;
    }

    public boolean isEmpty() {
        return _count == 0;
    }
    
    public int[] keys() {
        int[] result= new int[_count];
        Entry entry= null;
        for(int i= 0, e= 0; i < _count; ++i) {
            while(entry == null) {
                entry= _table[e++];
            }
            
            result[i]= entry.key;
            entry= entry.next;
        }
        return result;
    }

    public Object put(int key, Object value) {
        Entry tab[] = _table;
        int index = (key & 0x7FFFFFFF) % tab.length;
        for (Entry e = tab[index] ; e != null ; e = e.next) {
            if (e.key == key) {
                Object old = e.value;
                e.value = value;
                return old;
            }
        }

        Entry e= _table[index];
        _table[index]= new Entry(key, value, e);
        if(_count++ >= _threshold) {
            rehash();
        }
        
        return null;
    }

    public Object remove(int key) {
        Entry tab[] = _table;
        int hash = key;
        int index = (hash & 0x7FFFFFFF) % tab.length;
        for (Entry e = tab[index], prev = null ; e != null ; prev = e, e = e.next) {
            if (e.key == key) {
                if (prev != null) {
                    prev.next = e.next;
                } else {
                    tab[index] = e.next;
                }
                _count--;
                return e.value;
            }
        }
        return null;
    }

    public int size() {
        return _count;
    }
    
    private Entry getEntry(int key) {
        Entry[] tab= _table;
        int index= (key & 0x7FFFFFFF) % tab.length;
        for(Entry e= tab[index]; e != null; e= e.next) {
            if(e.key == key) {
                return e;
            }
        }
        
        return null;
    }
    
    private void rehash() {
        int oldCapacity = _table.length;
        Entry oldTable[] = _table;

        int newCapacity = oldCapacity * 2 + 1;
        Entry newTable[] = new Entry[newCapacity];

        _threshold = ((newCapacity * LOAD_PERCENT_FACTOR) / 100);
        _table = newTable;

        for (int i = oldCapacity ; i-- > 0 ;) {
            for (Entry old = oldTable[i] ; old != null ; ) {
                Entry e = old;
                old = old.next;

                int index = (e.key & 0x7FFFFFFF) % newCapacity;
                e.next = newTable[index];
                newTable[index] = e;
            }
        }
    }
}
