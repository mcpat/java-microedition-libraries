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
import java.util.Vector;

import com.github.libxjava.io.IDeserialiser;
import com.github.libxjava.io.ISerialisable;
import com.github.libxjava.io.ISerialiser;

/**
 * A serialisable collection type.
 * <p>
 * It extends the class {@link java.util.Vector} with serialisation facilities.
 * 
 * @author Marcel Patzlaff
 */
public class SerialisableVector/*[J5<E>J5]*/ extends Vector/*[J5<E>J5]*/ implements ISerialisable {
    private static final long serialVersionUID= 1L;
    
    public SerialisableVector() {
        super();
    }
    
    public SerialisableVector(int initialCapacity) {
        super(initialCapacity);
    }

    public SerialisableVector(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public synchronized void deserialise(IDeserialiser in) throws IOException, ClassNotFoundException {
        removeAllElements();
        int count= in.readInt();
        ensureCapacity(count);
        
        for(int i= 0; i < count; ++i) {
            super.addElement(in.readObject());
        }
    }

    public synchronized void serialise(ISerialiser out) throws IOException {
        int count= size();
        out.writeInt(count);
        
        for(int i= 0; i < count; ++i)
            out.writeObject(/*[J5(E)J5]*/elementAt(i));
    }
}
