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

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;


/**
 * This interface defines write methods for a primitive serialiser.
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public interface ISerialiser extends DataOutput {
    /**
     * Clears the internal serialisation graphs and flushes also
     * the underlying outputstream.
     * 
     * This method should be called to finish a serialisation process and
     * to reuse this instance for further serialisations.
     * 
     * @throws IOException  thrown from {@link OutputStream#flush()}
     */
    void flush() throws IOException;
    
    /**
     * Writes the given <code>Object</code> into this serialiser.
     * Consult {@link BinarySerialiserConstants} for further information!
     * 
     * @param o             the <code>Object</code> to write.
     * @throws IOException  if problems occur while writing data
     * @see {@link BinarySerialiserConstants}
     */
    void writeObject(Object o) throws IOException;
}
