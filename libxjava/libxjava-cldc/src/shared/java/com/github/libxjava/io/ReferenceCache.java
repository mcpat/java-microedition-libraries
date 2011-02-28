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
            referenceCounter= ReferenceCache.this.getReferenceCount();
        }

        public void flush() throws IOException {
            super.flush();
            referenceCounter= ReferenceCache.this.getReferenceCount();
        }

        protected Short getReferenceNumber(Object obj) {
            Short refNum= ReferenceCache.this.getReferenceNumber(obj);
            return refNum != null ? refNum : super.getReferenceNumber(obj);
        }
    }
    
    private final class CachedReferenceBinaryDeserialiserStream extends BinaryDeserialiserStream {
        public CachedReferenceBinaryDeserialiserStream(IClassLoader classLoader, InputStream in) {
            super(classLoader, in);
            referenceCounter= ReferenceCache.this.getReferenceCount();
        }

        public void flush() {
            super.flush();
            referenceCounter= ReferenceCache.this.getReferenceCount();
        }

        protected Object getReference(short num) {
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
        _referenceToNum.put(obj, /*[J5Short.valueOf/*J5]*/new Short/**/((short) refNum));
    }
    
    public final int getReferenceCount() {
        return _numToReference.size();
    }
    
    protected final Short getReferenceNumber(Object obj) {
        return (Short) _referenceToNum.get(obj);
    }
    
    protected final Object getReference(short refNum) {
        return _numToReference.get(refNum);
    }
}
