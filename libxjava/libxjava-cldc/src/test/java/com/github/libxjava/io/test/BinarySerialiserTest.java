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

package com.github.libxjava.io.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import junit.framework.TestCase;

import com.github.libxjava.io.BinaryDeserialiserStream;
import com.github.libxjava.io.BinarySerialiserStream;
import com.github.libxjava.io.ByteArrayInputBuffer;
import com.github.libxjava.lang.IClassLoader;
import com.github.libxjava.util.SerialisableHashMap;

/**
 * @author Marcel Patzlaff
 */
public class BinarySerialiserTest extends TestCase {
    public void testSerialiser() throws Exception {
        SerialisableHashMap map= new SerialisableHashMap();
        map.put("one", new Integer(1));
        map.put(map, null);
        
        ByteArrayOutputStream output= new ByteArrayOutputStream();
        BinarySerialiserStream bss= new BinarySerialiserStream(output);
        bss.writeObject(map);
        bss.flush();
        
        System.out.println(new String(output.toByteArray()));
        
        ByteArrayInputBuffer input= new ByteArrayInputBuffer(output.toByteArray());
        BinaryDeserialiserStream bds= new BinaryDeserialiserStream(
            new IClassLoader() {
                public InputStream getResourceAsStream(String name) {
                    return null;
                }

                public Class loadClass(String name) throws ClassNotFoundException {
                    return Class.forName(name);
                }
            }, 
        input);
        
        System.out.println(bds.readObject());
    }
}
