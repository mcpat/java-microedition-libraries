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

import java.util.ArrayList;

/**
 * @author Marcel Patzlaff
 */
public class BasicArrayList/*[J5<E>J5]*/ extends ArrayList/*[J5<E>J5]*/ {
    private static final long serialVersionUID= 1L;

    public BasicArrayList() {
        super();
    }
    
    public BasicArrayList(int initialCapacity) {
        super(initialCapacity);
    }
    
    public boolean add(/*[J5E/*J5]*/Object/**/ obj) {
        return super.add(obj);
    }
    
    public void add(int index, /*[J5E/*J5]*/Object/**/ obj) {
        super.add(index, obj);
    }
    
    public void clear() {
        super.clear();
    }
    
    public boolean contains(Object obj) {
        return super.contains(obj);
    }
    
    public void ensureCapacity(int minCapacity) {
        super.ensureCapacity(minCapacity);
    }
    
    public BasicEnumeration/*[J5<E>J5]*/ enumeration() {
        return new IteratorWrapper(super.iterator());
    }
    
    public /*[J5E/*J5]*/Object/**/ get(int index) {
        return super.get(index);
    }
    
    public int indexOf(Object obj) {
        return super.indexOf(obj);
    }
    
    public boolean isEmpty() {
        return super.isEmpty();
    }
    
    public int lastIndexOf(Object obj) {
        return super.lastIndexOf(obj);
    }
    
    public void trimToSize() {
        super.trimToSize();
    }
    
    public boolean remove(Object obj) {
        return super.remove(obj);
    }
    
    public /*[J5E/*J5]*/Object/**/ remove(int index) {
        return super.remove(index);
    }
    
    public /*[J5E/*J5]*/Object/**/ set(int index, /*[J5E/*J5]*/Object/**/ obj) {
        return super.set(index, obj);
    }
    
    public int size() {
        return super.size();
    }
    
    public String toString() {
        return super.toString();
    }
}
