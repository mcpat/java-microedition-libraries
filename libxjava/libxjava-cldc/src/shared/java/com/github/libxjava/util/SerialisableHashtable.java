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

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

import com.github.libxjava.io.IDeserialiser;
import com.github.libxjava.io.ISerialisable;
import com.github.libxjava.io.ISerialiser;

/**
 * A serialisable map type.
 * <p>
 * It extends the class {@link java.util.Hashtable} with serialisation facilities.
 * </p>
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class SerialisableHashtable/*[J5<K,V>J5]*/ extends Hashtable/*[J5<K,V>J5]*/ implements ISerialisable {
    private static final long serialVersionUID= 1L;
    
    public SerialisableHashtable() {
        super();
    }
    
    public SerialisableHashtable(int initialCapacity) {
        super(initialCapacity);
    }
    
    public synchronized void deserialise(IDeserialiser in) throws IOException, ClassNotFoundException {
        clear();
        int count= in.readInt();
        
        for(int i= 0; i < count; ++i) {
            super.put(/*[J5(K)J5]*/in.readObject(), /*[J5(V)J5]*/in.readObject());
        }
    }

    public synchronized void serialise(ISerialiser out) throws IOException {
        int count= size();
        out.writeInt(count);
        
        Enumeration e= keys();
        
        while(e.hasMoreElements()) {
            Object key= e.nextElement();
            out.writeObject(key);
            out.writeObject(get(key));
        }
    }
}
