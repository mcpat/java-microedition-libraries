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

import com.github.libxjava.util.BasicEnumeration;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class BasicHashSet {
    private final static Object PRESENT= new Object();
    
    private final BasicHashMap _map;
    
    public BasicHashSet() {
        _map= new BasicHashMap();
    }
    
    public BasicHashSet(int initialCapacity) {
        _map= new BasicHashMap(initialCapacity);
    }
    
    public boolean add(Object o) {
        return _map.put(o, PRESENT) != PRESENT;
    }
    
    public void clear() {
        _map.clear();
    }
    
    public boolean contains(Object o) {
        return _map.containsKey(o);
    }
    
    public BasicEnumeration enumeration() {
        return _map.keys();
    }
    
    public boolean isEmpty() {
        return _map.isEmpty();
    }
    
    public boolean remove(Object o) {
        return _map.remove(o) == PRESENT;
    }
    
    public int size() {
        return _map.size();
    }

    public String toString() {
        if(size() == 0) {
            return "[]";
        }
        
        StringBuffer result= new StringBuffer();
        result.append('[');
        BasicEnumeration e= enumeration();
        final int last= size() - 1;
        for(int i= 0; i <= last; ++i) {
            Object val= e.nextElement();
            result.append(val == this ? "(this Set)" : val);
            
            if(i < last) {
                result.append(", ");
            }
        }
        
        result.append(']');
        return result.toString();
    }
}
