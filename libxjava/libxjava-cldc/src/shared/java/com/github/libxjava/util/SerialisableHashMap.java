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

import com.github.libxjava.io.IDeserialiser;
import com.github.libxjava.io.ISerialisable;
import com.github.libxjava.io.ISerialiser;

/**
 * @author Marcel Patzlaff
 */
public class SerialisableHashMap extends BasicHashMap implements ISerialisable {
    public SerialisableHashMap() {
        super();
    }

    public SerialisableHashMap(int initialCapacity) {
        super(initialCapacity);
    }
    
    public void deserialise(IDeserialiser in) throws IOException, ClassNotFoundException {
        final int count= in.readInt();
        
        for(int i= 0; i < count; ++i) {
            super.put(in.readObject(), in.readObject());
        }
    }

    public void serialise(ISerialiser out) throws IOException {
        final int count= size();
        out.writeInt(count);
        
        Enumeration keys= keys();
        while(keys.hasMoreElements()) {
            Object key= keys.nextElement();
            out.writeObject(key);
            out.writeObject(get(key));
        }
    }
}
