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

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public abstract class BaseX {
    private final Object _workLock= new Object();
    private final ByteArrayOutputBuffer _workOutput= new ByteArrayOutputBuffer();
    private final ByteArrayInputBuffer _workInput= new ByteArrayInputBuffer();
    
    protected BaseX() {}
    
    /**
     * Same as {@code encode(b, 0, b.length}.
     * @see BaseX#encode(byte[], int, int)
     */
    public final byte[] encode(byte[] b) {
        return encode(b, 0, b.length);
    }
    
    /**
     * Encodes the specified block of bytes and assumes that it holds all bytes to encode.
     */
    public final byte[] encode(byte[] b, int off, int len) {
        synchronized (_workLock) {
            _workOutput.reset();
            _workInput.setInput(b, off, len);
            try {
                internalEncode(_workInput, _workOutput);
            } catch (IOException e) {
                // should never happen
                throw new Error(e.getMessage());
            }
            
            return _workOutput.toByteArray();
        }
    }
    
    public final void encode(byte[] b, int off, int len, OutputStream out) throws IOException {
        synchronized (_workLock) {
            _workInput.setInput(b, off, len);
            internalDecode(_workInput, out);
        }
    }
    
    /**
     * Encodes the data from {@code in} and writes it to {@code out}. It does so
     * until it reads an {code end-of-file} from {@code in}.
     */
    public final void encode(InputStream in, OutputStream out) throws IOException {
        synchronized (_workLock) {
            internalEncode(in, out);
        }
    }
    
    /**
     * Same as {@code decode(b, 0, b.length}.
     * @see BaseX#decode(byte[], int, int)
    */
    public final byte[] decode(byte[] b) {
        return decode(b, 0, b.length);
    }
    
    /**
     * Decodes the specified block of bytes and assumes that it holds all bytes to decode.
     */
    public final byte[] decode(byte[] b, int off, int len) {
        synchronized (_workLock) {
            _workOutput.reset();
            _workInput.setInput(b, off, len);
            try {
                internalDecode(_workInput, _workOutput);
            } catch (IOException e) {
                // should never happen
                throw new Error(e.getMessage());
            }
            
            return _workOutput.toByteArray();
        }
    }
    
    /**
     * Decodes the data from {@code in} and writes it to {@code out}. It does so
     * until it reads an {code end-of-file} from {@code in}.
     */
    public final void decode(InputStream in, OutputStream out) throws IOException {
        synchronized (_workLock) {
            internalDecode(in, out);
        }
    }
    
    protected abstract void internalDecode(InputStream in, OutputStream out) throws IOException;
    protected abstract void internalEncode(InputStream in, OutputStream out) throws IOException;
}
