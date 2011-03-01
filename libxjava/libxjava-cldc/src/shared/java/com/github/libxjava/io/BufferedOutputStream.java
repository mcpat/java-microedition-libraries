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
import java.io.OutputStream;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public abstract class BufferedOutputStream extends OutputStream {
    protected final int bufsize;
    private byte[] _buffer;
    private int _position;

    protected final Object worklock= new Object();
    
    protected BufferedOutputStream(int bufsize) {
        this.bufsize = bufsize;
    }
    
    public void close() throws IOException {
        flush();
    }
    
    public final void clear() {
        synchronized (worklock) {
            _buffer= null;
            _position = 0;
        }
    }

    public final void flush() throws IOException {
        synchronized(worklock) {
            if (_buffer != null && _position > 0) {
                internalWrite(_buffer, _position, true);
                clear();
            }
        }
    }

    public final void write(final byte[] b, final int off, final int len) throws IOException {
        if (b == null) {
            throw new IllegalArgumentException();
        } else if ((off < 0) || (off > b.length) || (len < 0) || ((off + len) > b.length) || ((off + len) < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return;
        }
        
        synchronized(worklock) {
            ensureBufferNotNull();
            
            int canWrite;
            int toWrite;
            int offset= off;
            int length= len;
            while(length > 0) {
                checkBuffer(); // check whether the buffer should be flushed
                canWrite= getPayloadEnd() - _position;
                toWrite= length > canWrite ? canWrite : length;
                
                System.arraycopy(b, offset, _buffer, _position, toWrite);
                offset+= toWrite;
                length-= toWrite;
                _position+= toWrite;
            }
        }
    }

    public final void write(int b) throws IOException {
        synchronized(worklock) {
            ensureBufferNotNull();
            checkBuffer(); // check whether the buffer should be flushed
            _buffer[_position++]= (byte)b;
        }
    }
    
    protected int getPayloadStart() {
        return 0;
    }

    protected int getPayloadEnd() {
        return bufsize;
    }
    
    /**
     * {@code end} indicates the length of the payload <strong>and</strong> the first non-payload bytes.
     */
    protected abstract void internalWrite(byte[] buffer, int end, boolean flushed) throws IOException;

    private void checkBuffer() throws IOException {
        if(_position == getPayloadEnd()) {
            internalWrite(_buffer, _position, false);
            _position= getPayloadStart();
        }
    }
    
    private void ensureBufferNotNull() {
        if(_buffer == null) {
            _buffer= new byte[bufsize];
            _position= getPayloadStart();
        }
    }
}
