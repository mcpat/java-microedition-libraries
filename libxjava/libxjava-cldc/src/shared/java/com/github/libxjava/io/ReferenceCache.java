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
import java.io.InputStream;
import java.io.OutputStream;

import com.github.libxjava.lang.IClassLoader;
import /*[CDCjava.util.HashMap/*CDC]*/com.github.libxjava.util.BasicHashMap/**/;
import com.github.libxjava.util.IntHashMap;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class ReferenceCache {
    private final class CachedReferenceBinarySerialiserStream extends BinarySerialiserStream {
        protected CachedReferenceBinarySerialiserStream(OutputStream out) {
            super(out);
        }

        public void flush() throws IOException {
            super.flush();
            referenceCounter= (byte) getReferenceCount();
        }

        protected int getReferenceNumber(Object obj) {
            int refNum= ReferenceCache.this.getReferenceNumber(obj);
            
            if(refNum >= 0) {
                return refNum;
            }
            
            return super.getReferenceNumber(obj);
        }
    }
    
    private final class CachedReferenceBinaryDeserialiserStream extends BinaryDeserialiserStream {
        public CachedReferenceBinaryDeserialiserStream(IClassLoader classLoader, InputStream in) {
            super(classLoader, in);
        }

        public void flush() {
            super.flush();
            referenceCounter= getReferenceCount();
        }

        protected Object getReference(byte num) {
            Object ref= ReferenceCache.this.getReference(num);
            
            if(ref != null) {
                return ref;
            }
            
            return super.getReference(num);
        }
    }
    
    private final IntHashMap _numToReference;
    private final /*[CDCHashMap/*CDC]*/BasicHashMap/**/ _referenceToNum;
    
    public ReferenceCache() {
        _numToReference= new IntHashMap();
        _referenceToNum= new /*[CDCHashMap/*CDC]*/BasicHashMap/**/();
    }
    
    public final BinaryDeserialiserStream createDeserialiser(IClassLoader classLoader, InputStream in) {
        return new CachedReferenceBinaryDeserialiserStream(classLoader, in);
    }
    
    public final BinarySerialiserStream createSerialiser(OutputStream out) {
        return new CachedReferenceBinarySerialiserStream(out);
    }
    
    public final void cacheReference(Object obj) {
        int refNum= getReferenceCount();
        _numToReference.put(refNum, obj);
        _referenceToNum.put(new Byte((byte) refNum), obj);
    }
    
    public final int getReferenceCount() {
        return _numToReference.size();
    }
    
    protected final int getReferenceNumber(Object obj) {
        Byte ref= (Byte) _referenceToNum.get(obj);
        
        if(ref != null) {
            return ref.byteValue() & 0xFF;
        }
        
        return -1;
    }
    
    protected final Object getReference(byte refNum) {
        return _numToReference.get(refNum);
    }
}
