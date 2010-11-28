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

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.github.libxjava.lang.IClassLoader;
import com.github.libxjava.util.IntHashMap;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class BinaryDeserialiserStream extends DataInputStream implements IDeserialiser {
    private IntHashMap _references= new IntHashMap();
    private int _referenceCounter= 0;
    
    private IClassLoader _classLoader;
    
    public BinaryDeserialiserStream(IClassLoader classLoader, InputStream in) {
        super(in);
        _classLoader= classLoader;
    }
    
    public void flush() {
        _references.clear();
        _referenceCounter= 0;
    }

    public Object readObject() throws ClassNotFoundException, IOException {
        // get the type of the object
        Object result= null;
        int type= readUnsignedByte();
        switch (type) {
            case BinarySerialiserConstants.NULL: {
                return null;
            }
            
            case BinarySerialiserConstants.REFERENCE: {
                return _references.get(readByte());
            }

            case BinarySerialiserConstants.SERIALISABLE:
                return readSerialisable(readUTF());
            
            case BinarySerialiserConstants.STRING: {
                result= readUTF();
                break;
            }
                
            case BinarySerialiserConstants.BOOLEAN: {
                result= readBoolean() ? Boolean.TRUE : Boolean.FALSE;
                break;
            }
                
            case BinarySerialiserConstants.BYTE: {
                result= new Byte(readByte());
                break;
            }

            case BinarySerialiserConstants.CHAR: {
                result= new Character(readChar());
                break;
            }
                
            case BinarySerialiserConstants.DOUBLE: {
                result= new Double(readDouble());
                break;
            }
                
            case BinarySerialiserConstants.FLOAT: {
                result= new Float(readFloat());
                break;
            }
                
            case BinarySerialiserConstants.INT: {
                result= new Integer(readInt());
                break;
            }
                
            case BinarySerialiserConstants.LONG: {
                result= new Long(readLong());
                break;
            }
                
            case BinarySerialiserConstants.SHORT: {
                result= new Short(readShort());
                break;
            }
        }
        
        if(result == null) {
            throw new IOException("unexpected type: '" + type + "'");
        }
        
        insertReference(result);
        return result;
    }
    
    private void insertReference(Object obj) {
        _references.put(_referenceCounter++, obj);
    }
    
    private ISerialisable readSerialisable(String className) throws ClassNotFoundException, IOException {
        try {
            ISerialisable result= (ISerialisable) _classLoader.loadClass(className).newInstance();
            // insert the reference now, as there can be cycles in the object graph
            insertReference(result);
            result.deserialise(this);
            return result;
        } catch (IllegalAccessException iae) {
            throw new ClassNotFoundException("cannot access class '" + className + "' : " + iae.getMessage());
        } catch (InstantiationException ie) {
            throw new ClassNotFoundException("cannot instantiate class '" + className + "' : " + ie.getMessage());
        }
    }
}
