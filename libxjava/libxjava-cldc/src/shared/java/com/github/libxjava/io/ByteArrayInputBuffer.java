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

import java.io.InputStream;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class ByteArrayInputBuffer extends InputStream {
    private byte[] _buffer;
    
    private int _position;
    private int _count;
    private int _mark;
    
    public ByteArrayInputBuffer() {
        this(new byte[0]);
    }
    
    public ByteArrayInputBuffer(byte[] buffer) {
        _buffer= buffer;
        _count= _buffer.length;
        _position= 0;
    }
    
    public int available() {
        return _count - _position;
    }
    
    public void close() {}

    public byte[] getByteArrayReference() {
        return _buffer;
    }
    
    public void mark(int readlimit) {
        _mark= _position;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        return (_position < _count) ? (_buffer[_position++] & 0xFF) : -1;
    }

    public int read(byte[] b, int off, int len) {
        if (b == null) {
            throw new IllegalArgumentException("null buffer");
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        }
        
        if(_position >= _count) {
            return -1;
        }
        
        if(len <= 0) {
            return 0;
        }
        
        final int max= _count - _position;
        if(len > max) {
            len= max;
        }
        
        System.arraycopy(_buffer, _position, b, off, len);
        _position+= len;
        return len;
    }

    public void reset() {
        _position= _mark;
    }

    public void setInput(byte[] input) {
        setInput(input, 0, input.length);
    }
    
    public void setInput(byte[] input, int off, int len) {
        _buffer= input;
        _position= off;
        _count= len;
        _mark= 0;
    }

    public long skip(long n) {
        if (n < 0) {
            return 0;
        }
        
        if (_position + n > _count) {
            n = _count - _position;
        }
        _position += n;
        return n;
    }
}
