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

import java.util.HashMap;

/**
 * @author Marcel Patzlaff
 */
public class BasicHashMap/*[J5<K,V>J5]*/ extends HashMap/*[J5<K,V>J5]*/ {
    private static final long serialVersionUID= 1L;

    public BasicHashMap() {
        super();
    }
    
    public BasicHashMap(int initialCapacity) {
        super(initialCapacity);
    }
    
    public void clear() {
        super.clear();
    }

    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    public BasicEnumeration/*[J5<V>J5]*/ elements() {
        return new IteratorWrapper(super.values().iterator());
    }

    public /*[J5V/*J5]*/Object/**/ get(Object key) {
        return super.get(key);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public BasicEnumeration/*[J5<K>J5]*/ keys() {
        return new IteratorWrapper(super.keySet().iterator());
    }

    public /*[J5V/*J5]*/Object/**/ put(/*[J5K/*J5]*/Object/**/ key, /*[J5V/*J5]*/Object/**/ value) {
        return super.put(key, value);
    }

    public /*[J5V/*J5]*/Object/**/ remove(Object key) {
        return super.remove(key);
    }

    public int size() {
        return super.size();
    }
    
    public String toString() {
        return super.toString();
    }
}
