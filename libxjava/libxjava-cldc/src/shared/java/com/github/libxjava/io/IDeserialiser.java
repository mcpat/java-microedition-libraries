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

package com.github.libxjava.io;

import java.io.DataInput;
import java.io.IOException;

/**
 * This interface defines read methods for a primitive deserialiser.
 * 
 * @author Marcel Patzlaff
 */
public interface IDeserialiser extends DataInput {
    /**
     * Clears the internal deserialisation graphs.
     * 
     * This method should be called to process further content
     * on the underlying stream which is not associated with the
     * previously deserialised one.
     * 
     * It has no effect on the underlying inputstream.
     */
    void flush();

    /**
     * Reads the next content of the underlying stream and interprets it
     * as an <code>Object</code>.
     * 
     * @return  the object created from the stream
     * @throws  ClassNotFoundException  if a class could not be found, instantiated or accessed.
     * @throws  IOException             when problems occur while reading data
     */
    Object readObject() throws ClassNotFoundException, IOException;
}
