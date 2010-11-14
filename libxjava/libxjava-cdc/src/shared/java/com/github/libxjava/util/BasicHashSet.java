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

import java.util.HashSet;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class BasicHashSet/*[J5<E>J5]*/ extends HashSet/*[J5<E>J5]*/ {
    private static final long serialVersionUID= 1L;

    public BasicHashSet() {
        super();
    }
    
    public BasicHashSet(int initialCapacity) {
        super(initialCapacity);
    }
    
    public boolean add(/*[J5E/*J5]*/Object/**/ o) {
        return super.add(o);
    }
    
    public void clear() {
        super.clear();
    }
    
    public boolean contains(Object o) {
        return super.contains(o);
    }
    
    public BasicEnumeration/*[J5<E>J5]*/ enumeration() {
        return new IteratorWrapper(super.iterator());
    }
    
    public boolean isEmpty() {
        return super.isEmpty();
    }
    
    public boolean remove(Object o) {
        return super.remove(o);
    }
    
    public int size() {
        return super.size();
    }

    public String toString() {
        return super.toString();
    }
}
