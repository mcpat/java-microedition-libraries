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

import java.io.IOException;

/**
 * Marks an implementing class as serialisable.
 * <p>
 * Ensure that the implementing class is accessible from all packages <strong>and</strong>
 * that it defines a default constructor. Otherwise it cannot be accessed or instantiated!
 * 
 * @author Marcel Patzlaff
 */
public interface ISerialisable {
    
    /**
     * This method defines the serialisation protocol of the
     * implementing class.
     * 
     * @param   out             the serialiser to write the content to 
     * @throws  IOException     if problems occur during the serialisation process
     * @see BinarySerialiserConstants#isSerialisationSupported(java.lang.Object)
     */
    void serialise(ISerialiser out) throws IOException;
    
    /**
     * Defines the protocol to deserialise data and fill the fields
     * of the implementing class.
     * <p>
     * Ensure that the protocols defined here and in {@link #serialise(ISerialiser)} are
     * compatible!
     * 
     * @param   in                      the deserialiser to read the content from
     * @throws  IOException             if problems occur during the deserialisation process
     * @throws  ClassNotFoundException  if class cannot be loaded and instantiated
     * @see IDeserialiser#readObject()
     * @see BinarySerialiserConstants#isSerialisationSupported(java.lang.Object)
     */
    void deserialise(IDeserialiser in) throws IOException, ClassNotFoundException;
}
