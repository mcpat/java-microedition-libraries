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

package com.github.libxjava.util;

import java.util.NoSuchElementException;

import com.github.libxjava.util.BasicEnumeration;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class BasicHashMap {
    private final static class Entry {
        int hash;
        Object key;
        Object value;
        Entry next;

        Entry(int hash, Object key, Object value, Entry next) {
            this.hash= hash;
            this.key= key;
            this.value= value;
            this.next= next;
        }
    }
    
    private final class Enumerator implements BasicEnumeration {
        boolean keys;
        int index;
        Entry[] table;
        Entry entry;
        Entry lastAccessedElement;

        Enumerator(Entry[] table, boolean keys) {
            this.table= table;
            this.keys= keys;
            this.index= table.length;
        }

        public boolean hasMoreElements() {
            if (entry != null) {
                return true;
            }

            while (index-- > 0) {
                if ((entry= table[index]) != null) {
                    return true;
                }
            }

            return false;
        }

        public Object nextElement() {
            if (hasMoreElements()) {
                Entry e= entry;
                entry= e.next;
                lastAccessedElement= e;
                return keys ? e.key : e.value;
            }
            
            lastAccessedElement= null;

            throw new NoSuchElementException("HashMapEnumeration");
        }

		public void remove() {
            if (lastAccessedElement == null) {
                throw new RuntimeException("illegal state");
            }
            Object k = lastAccessedElement.key;
            entry = null;
            BasicHashMap.this.remove(k);
            lastAccessedElement= null;
        } 
    }
    
    private final static int LOAD_FACTOR_PERCENT= 75;
    private final static int DEFAULT_INITIAL_CAPACITY= 16;
    private final static int MAX_CAPACITY= 1 << 30;

    private static int hash(int h) {
        h^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    private static int indexFor(int h, int length) {
        return h & (length - 1);
    }

    private Entry[] _table;

    private int _count;
    private int _threshold;

    public BasicHashMap() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public BasicHashMap(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException();
        }
        if (initialCapacity > MAX_CAPACITY) {
            initialCapacity= MAX_CAPACITY;
        }

        int capacity= 1;
        while (capacity < initialCapacity) {
            capacity<<= 1;
        }

        _table= new Entry[initialCapacity];
        _threshold= (initialCapacity * LOAD_FACTOR_PERCENT) / 100;
    }

    public void clear() {
        Entry[] tab= _table;
        for (int i= 0; i < tab.length; i++) {
            tab[i]= null;
        }
        _count= 0;
    }

    public boolean containsKey(Object key) {
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

    public BasicEnumeration elements() {
        return new Enumerator(_table, false);
    }

    public Object get(Object key) {
        Entry e= getEntry(key);
        return e != null ? e.value : null;
    }

    public boolean isEmpty() {
        return _count == 0;
    }

    public BasicEnumeration keys() {
        return new Enumerator(_table, true);
    }

    public Object put(Object key, Object value) {
        int hash= (key == null) ? 0 : hash(key.hashCode());
        int i= indexFor(hash, _table.length);
        for (Entry e= _table[i]; e != null; e= e.next) {
            Object k;
            if (e.hash == hash && ((k= e.key) == key || (key != null && key.equals(k)))) {
                Object oldValue= e.value;
                e.value= value;
                return oldValue;
            }
        }

        addEntry(hash, key, value, i);
        return null;
    }

    public Object remove(Object key) {
        int hash= (key == null) ? 0 : hash(key.hashCode());
        int i= indexFor(hash, _table.length);
        Entry prev= _table[i];
        Entry e= prev;

        while (e != null) {
            Entry next= e.next;
            Object k;
            if (e.hash == hash && ((k= e.key) == key || (key != null && key.equals(k)))) {
                _count--;
                if (prev == e) {
                    _table[i]= next;
                } else {
                    prev.next= next;
                }
                return e.value;
            }
            prev= e;
            e= next;
        }

        return null;
    }

    public int size() {
        return _count;
    }
    
    public String toString() {
        if(_count == 0) {
            return "{}";
        }
        
        StringBuffer buffer= new StringBuffer();
        buffer.append('{');
        int max= _count - 1;
        Entry entry= null;
        for(int i= 0, e= 0; i <= max; ++i) {
            while(entry == null) {
                entry= _table[e++];
            }
            
            Object key= entry.key;
            Object value= entry.value;
            
            buffer.append(key == this ? "(this Map)" : key);
            buffer.append('=');
            buffer.append(value == this ? "(this Map)" : value);
            entry= entry.next;
            if(i < max) {
                buffer.append(", ");
            }
        }
        
        buffer.append('}');
        return buffer.toString();
    }

    private void addEntry(int hash, Object key, Object value, int bucketIndex) {
        Entry e= _table[bucketIndex];
        _table[bucketIndex]= new Entry(hash, key, value, e);
        if (_count++ >= _threshold) {
            resize(_table.length << 1);
        }
    }

    private Entry getEntry(Object key) {
        int hash= (key == null) ? 0 : hash(key.hashCode());
        for (Entry e= _table[indexFor(hash, _table.length)]; e != null; e= e.next) {
            Object k;
            if (e.hash == hash && ((k= e.key) == key || (key != null && key.equals(k)))) {
                return e;
            }
        }

        return null;
    }

    private void resize(int newCapacity) {
        Entry[] oldTable= _table;
        int oldCapacity= oldTable.length;
        if (oldCapacity == MAX_CAPACITY) {
            _threshold= Integer.MAX_VALUE;
            return;
        }

        Entry[] newTable= new Entry[newCapacity];
        _table= newTable;
        _threshold= (newCapacity * LOAD_FACTOR_PERCENT) / 100;

        for (int j= 0; j < oldTable.length; ++j) {
            Entry e= oldTable[j];
            if (e != null) {
                oldTable[j]= null;
                do {
                    Entry next= e.next;
                    int i= indexFor(e.hash, newCapacity);
                    e.next= newTable[i];
                    newTable[i]= e;
                    e= next;
                } while (e != null);
            }
        }
    }
}