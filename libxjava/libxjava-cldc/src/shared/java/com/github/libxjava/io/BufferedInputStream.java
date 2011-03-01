/*
 * libxjava - utility library for cross-Java-platform development
 *            ${project.name}
 *
 * Copyright (c) 2010-2011 Marcel Patzlaff (marcel.patzlaff@gmail.com)
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

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public abstract class BufferedInputStream extends InputStream {
    protected final int bufsize;
    private byte[] _buffer;
    private int _position = 0;
    private int _count = 0;

    protected final Object worklock= new Object();
    
    protected BufferedInputStream(int bufsize) {
        this.bufsize= bufsize;
    }

    public final int available() { 
        synchronized (worklock) {
            return _count - _position;
        }
    }
    
    public final void clear() {
        synchronized (worklock) {
            _buffer= null;
            _count= _position= 0;
        }
    }

    public final int read() throws IOException {
        synchronized(worklock) {
            boolean eof= checkBuffer();
            return eof ? -1 : (_buffer[_position++] & 0xFF);
        }
    }

    public final int read(byte[] b, int off, int len) throws IOException {
        if (b == null) {
            throw new IllegalArgumentException("buffer must not be null");
        } else if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException("offset and/or length are out of the buffers bounds");
        }

        synchronized(worklock) {
            if(checkBuffer()) {
                return -1;
            }
            
            int numBytes= 0;
            final int canRead= _count - _position;
            if (canRead > 0 && len > 0) {
                numBytes= len > canRead ? canRead : len;
                System.arraycopy(_buffer, _position, b, off, numBytes);
                _position+= numBytes;
            }
            
            return numBytes;
        }
    }

    protected int getPayloadStart() {
        return 0;
    }

    protected int getPayloadEnd() {
        return bufsize;
    }
    
    protected abstract int internalRead(byte[] buffer) throws IOException;

    /**
     * Caller must hold the work-lock!
     * @return {@code true} if EOF reached {@code false} otherwise
     */
    private boolean checkBuffer() throws IOException {
        if(_buffer == null) {
            _buffer= new byte[bufsize];
        }
        
        if ((_count - _position) == 0) {
            final int numBytes= internalRead(_buffer);
            
            if(numBytes <= 0) {
                _count= 0;
                _buffer= null; // save memory
            } else {
                _count= numBytes;
            }
            
            _position = 0;
            
            if(numBytes == 0) {
                throw new IOException("internalRead");
            }
            
            return numBytes == -1;
        }
        
        return false;
    }
}
