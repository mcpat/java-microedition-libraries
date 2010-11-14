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

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/**
 * This implementation is like the {@link ByteArrayOutputStream}
 * but not synchronised and it lets the user optimise byte array allocation.
 * 
 * Furthermore this type of {@link OutputStream} is not closable, so
 * it can be reused.
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class ByteArrayOutputBuffer extends OutputStream {
    private byte[] _buffer;
    private int _count;
    
    public ByteArrayOutputBuffer() {
        this(16);
    }
    
    public ByteArrayOutputBuffer(int size) {
        if(size < 0) {
            throw new IllegalArgumentException("negative size");
        }
        
        _buffer= new byte[size];
        _count= 0;
    }
    
    /**
     * Returns the reference to this buffer's byte array.
     * <p>
     * Remember that calling {@link #reset()} only resets the
     * internal counter. If you do not want any changes in
     * the byte array obtained by this method, you need
     * to call {@link #resetNew()} or {@link #resetNew(int)}!
     */
    public byte[] getByteArrayReference() {
        return _buffer;
    }
    
    public byte[] toByteArray() {
        byte[] result= new byte[_count];
        System.arraycopy(_buffer, 0, result, 0, _count);
        return result;
    }
    
    public void reset() {
        _count= 0;
    }
    
    /**
     * Replaces the internal buffer with a new byte array
     * of size <code>16</code>.
     * 
     * Call of this method equals <code>resetNew(16)</code>
     */
    public void resetNew() {
        resetNew(16);
    }
    
    /**
     * Replaces the internal buffer with a new byte array of
     * size <code>size</code>.
     * @param size
     */
    public void resetNew(int size) {
        if(size < 0) {
            throw new IllegalArgumentException("negative size");
        }
        _buffer= new byte[size];
        _count= 0;
    }
    
    /**
     * Resets the internal buffer with the specified byte array
     * and initialises the internal write pointer to <code>off</code>.
     * @param buffer
     * @param off
     */
    public void setOutput(byte[] buffer, int off) {
        _buffer= buffer;
        _count= off;
    }
    
    public int size() {
        return _count;
    }

    /**
     * This type of outputstream is not closable.
     */
    public void close() {}

    public void write(byte[] b, int off, int len) {
        if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length)) {
            throw new IndexOutOfBoundsException();
        }
        
        int newCount= _count + len;
        if(newCount > _buffer.length) {
            int newLength= _buffer.length << 1;
            byte[] newBuf= new byte[newLength < newCount ? newCount : newLength];
            System.arraycopy(_buffer, 0, newBuf, 0, _count);
            _buffer= newBuf;
        }
        
        System.arraycopy(b, off, _buffer, _count, len);
        _count= newCount;
    }

    public void write(int b) {
        int newCount= _count + 1;
        if(newCount > _buffer.length) {
            byte[] newBuf= new byte[_buffer.length << 1];
            System.arraycopy(_buffer, 0, newBuf, 0, _count);
            _buffer= newBuf;
        }
        
        _buffer[_count]= (byte) b;
        _count= newCount;
    }
}
