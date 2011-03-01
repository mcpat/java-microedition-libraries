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
import java.io.InterruptedIOException;
import java.io.OutputStream;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class ByteArrayBuffer {
    public final class Reader extends InputStream {
        private final byte[] _oneByte= new byte[1];
        
        public int available() {
            return internalAvailable();
        }
        
        /**
         * Marks the current position in this input stream. A subsequent call to
         * the <code>reset</code> method repositions this stream at the last marked
         * position so that subsequent reads re-read the same bytes.
         *
         * <p> The <code>readlimit</code> arguments tells this input stream to
         * allow that many bytes to be read before the mark position gets
         * invalidated. {@code readlimit} must never be higher then
         * <code>{@link ByteArrayBuffer#capacity()} - 1</code>!
         * </p>
         *
         * @param   readlimit   the maximum limit of bytes that can be read before
         *                      the mark position becomes invalid.
         *                      
         * @throws IllegalArgumentException     if readlimit exceeds the buffer size
         */
        public synchronized void mark(int readlimit) {
            internalMark(readlimit);
        }

        public boolean markSupported() {
            return true;
        }

        public synchronized void reset() throws IOException {
            internalReset();
        }

        public int read() throws IOException {
            internalRead(_oneByte, 0, 1);
            return (_oneByte[0] & 0xFF);
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return internalRead(b, off, len);
        }

        public int read(byte[] b) throws IOException {
            return internalRead(b, 0, b.length);
        }
    }
    
    public final class Writer extends OutputStream {
        private final byte[] _oneByte= new byte[1];

        /**
         * Returns the remaing space in the buffer.
         */
        public int space() {
            return internalSpace();
        }
        
        public void close() {
            internalCloseWriter();
        }

        /**
         * Same as {@link #markComplete()}.
         */
        public void flush() {
            internalMarkComplete();
        }

        public void write(byte[] b, int off, int len) throws IOException {
            internalWrite(b, off, len);
        }

        public void write(byte[] b) throws IOException {
            internalWrite(b, 0, b.length);
        }

        public void write(int v) throws IOException {
            _oneByte[0]= (byte) v;
            internalWrite(_oneByte, 0, 1);
        }
        
        /**
         * Notifies the buffer that the current chunk of data is complete.
         */
        public void markComplete() {
            internalMarkComplete();
        }
        
        /**
         * Notifies the buffer that the current chunk is incomplete and
         * should be discarded. This notification is handed over to the 
         * reader with an {@link IOException} in a subsequent call to one
         * of the read methods ({@link Reader#read()}, {@link Reader#read(byte[])},
         * {@link Reader#read(byte[], int, int)}).
         */
        public void markIncomplete() {
            internalMarkIncomplete();
        }
    }
    
    private final Reader _reader;
    private final Writer _writer;
    
    private final byte[] _buffer;
    private int _writePointer;
    private int _readPointer;
    
    private int _markPointer;
    private int _markLimit;
    
    private boolean _readBehind;
    private int _lastFrameEnd;
    
    private boolean _dropUntilFlush;
    private String _readErrorMessage;
    
    private long _frameWriteTimeout;
    private long _frameReadTimeout;
    
    /**
     * Indicates whether we read the end-of-frame and nothing more.
     */
    private boolean _frameEndRead;
    
    /**
     * Indicates whether the writer was closed. It ensures that
     * the {@code -1} is delivered to the reader.
     */
    private boolean _endOfStream;
    
    public ByteArrayBuffer(int bufSize) {
        this(bufSize, 1L, 1L);
    }
    
    public ByteArrayBuffer(int bufSize, long frameReadTimeout, long frameWriteTimeout) {
        _buffer= new byte[bufSize];
        _reader= new Reader();
        _writer= new Writer();
        _readPointer= 0;
        _writePointer= 0;
        _markPointer= -1;
        _markLimit= -1;
        _readBehind= false;
        _dropUntilFlush= false;
        _lastFrameEnd= -1;
        _readErrorMessage= null;
        _frameEndRead= false;
        _endOfStream= false;
        
        _frameReadTimeout= frameReadTimeout;
        _frameWriteTimeout= frameWriteTimeout;
    }
    
    public int capacity() {
    	return _buffer.length;
    }
    
    public Reader getReader() {
        return _reader;
    }
    
    public Writer getWriter() {
        return _writer;
    }
    
    void internalWrite(byte[] b, int off, int len) throws IOException {
        if(_dropUntilFlush) {
            return;
        }
        long start= System.currentTimeMillis();
        synchronized (_buffer) {
            if(_endOfStream) {
                throw new IOException("buffer is not ready yet");
            }
            
            while(len > 0) {
                int place= internalSpace();
                
                if(place == 0) {
                    long timeoutLeft= _frameWriteTimeout - (System.currentTimeMillis() - start);
                    if(timeoutLeft > 0) {
                        try {
                            _buffer.wait(timeoutLeft);
                        } catch (InterruptedException e) {
                            throw new InterruptedIOException(e.getMessage());
                        }
                        continue;
                    } else {
                        // no place for new bytes
                        _dropUntilFlush= true;
                        if(_lastFrameEnd >= 0) {
                            _writePointer= getValidOffset(_lastFrameEnd + 1);
                        } else {
                            // actual content belongs to one frame -> buffer overflow!
                            _writePointer= 0;
                            _readPointer= 0;
                            _readErrorMessage= "buffer overflow";
                        }
                        
                        throw new IOException("buffer overflow: " + len + " vs " + place);
                    }
                }
                
                int numBytes= 0;
                while(place > numBytes && len > 0) {
                    int written= internalWrite0(b, off, len);
                    off+= written;
                    len-= written;
                    numBytes+= written;
                }
                
                if(numBytes > 0) {
                    _buffer.notify();
                }
            }
        }
    }
    
    void internalCloseWriter() {
        synchronized (_buffer) {
            internalMarkComplete();
            _endOfStream= true;
            _buffer.notify();
        }
    }
    
    void internalMarkComplete() {
        synchronized (_buffer) {
            if(_dropUntilFlush) {
                _dropUntilFlush= false;
                return;
            }
            
            if(_writePointer == _readPointer && !_readBehind) {
                // we have already read the frame end
                return;
            }
            
            _lastFrameEnd= getValidOffset(_writePointer - 1);
        }
    }
    
    void internalMarkIncomplete() {
        synchronized (_buffer) {
            if(_lastFrameEnd >= 0) {
                // ignore it and just reset write pointer
                _writePointer= getValidOffset(_lastFrameEnd + 1);
            } else {
                _readErrorMessage= "missing content";
                _writePointer= 0;
                _readPointer= 0;
                _buffer.notify();
            }
        }
    }
    
    int internalRead(byte[] b, int off, int len) throws IOException {
        synchronized (_buffer) {
            boolean canWait= true;
            
            while(true) {
                if(_readErrorMessage != null)  {
                    try {
                        throw new IOException(_readErrorMessage);
                    } finally {
                        _readErrorMessage= null;
                    }
                }
                
                int available= internalAvailable();
                
                if(available == 0) {
                    if(_endOfStream) {
                        _endOfStream= false;
                        return -1;
                    }
                    
                    if(canWait || _frameEndRead) {
                        try {
                            _buffer.wait(_frameEndRead ? 0 : _frameReadTimeout);
                        } catch (InterruptedException e) {
                            throw new InterruptedIOException(e.getMessage());
                        }
                        
                        canWait= false;
                        continue;
                    } else {
                        throw new IOException("timeout");
                    }
                }
                
                _frameEndRead= false;
                int numBytes= 0;
                while(!_frameEndRead && available > numBytes && len > 0) {
                    int read= internalRead0(b, off, len);
                    off+= read;
                    len-= read;
                    numBytes+= read;
                }
                
                if(_markPointer >= 0) {
                    _markLimit-= numBytes;
                    
                    if(_markLimit < 0) {
                        _markLimit= -1;
                        _markPointer= -1;
                    }
                } else  if(numBytes > 0) {
                    _buffer.notify();
                }
                
                return numBytes;
            }
        }
    }
    
    int internalAvailable() {
        synchronized (_buffer) {
            if(_readPointer < _writePointer) {
                return _writePointer - _readPointer;
            }
            
            if(_readPointer > _writePointer || _readBehind) {
                return (_buffer.length - _readPointer) + _writePointer; 
            }
            
            return 0;
        }
    }
    
    void internalMark(int readlimit) {
        synchronized (_buffer) {
            if(readlimit >= _buffer.length) {
                throw new IllegalArgumentException("readlimit exceeds buffer size");
            }
            
            _markLimit= readlimit;
            _markPointer= _readPointer;
        }
    }
    
    void internalReset() throws IOException {
        synchronized (_buffer) {
            if(_markPointer >= 0) {
                if(_markPointer > _readPointer) {
                    _readBehind= true;
                }
                _readPointer= _markPointer;
                _markPointer= -1;
                _markLimit= -1;
                return;
            }
            
            throw new IOException("buffer was not marked before");
        }
    }
    
    int internalSpace() {
        synchronized (_buffer) {
            int consumedPointer= _markPointer >= 0 ? _markPointer : _readPointer;
            
            if(consumedPointer < _writePointer) {
                return (_buffer.length - _writePointer) + consumedPointer;
            }
            
            if(consumedPointer > _writePointer || consumedPointer > _readPointer || _readBehind) {
                return consumedPointer - _writePointer; 
            }
            return _buffer.length;
        }
    }
    
    private int getValidOffset(int offset) {
        offset= offset % _buffer.length;
        return offset < 0 ? _buffer.length + offset : offset;
    }
    
    /**
     * Caller must hold the lock on {@code _buffer}.
     */
    private int internalWrite0(byte[] b, int off, int len) {
        int consumedPointer= _markPointer >= 0 ? _markPointer : _readPointer;
        int maxToWrite= _writePointer < consumedPointer ? consumedPointer - _writePointer: _buffer.length - _writePointer;
        int toWrite= maxToWrite > len ? len : maxToWrite;
        
        if(toWrite > 0) {
            System.arraycopy(b, off, _buffer, _writePointer, toWrite);
            _writePointer= getValidOffset(_writePointer + toWrite);
            
            if(_writePointer == 0) {
                _readBehind= true;
            }
        }
        
        return toWrite;
    }
    
    /**
     * Caller must hold the lock on {@code _buffer}.
     */
    private int internalRead0(byte[] b, int off, int len) {
        int maxToRead= _readPointer < _writePointer ? _writePointer - _readPointer : _buffer.length - _readPointer;
        
        boolean checkEndOfLastFrameReached= false;
        if(_readPointer <= _lastFrameEnd) {
            maxToRead= (_lastFrameEnd - _readPointer) + 1;
            checkEndOfLastFrameReached= true;
        }
        
        int toRead= maxToRead > len ? len : maxToRead;
        
        if(toRead > 0) {
            System.arraycopy(_buffer, _readPointer, b, off, toRead);
            _readPointer= getValidOffset(_readPointer + toRead);
            
            if(_readPointer == 0) {
                _readBehind= false;
            }
        }
        
        if(checkEndOfLastFrameReached && toRead == maxToRead) {
            _lastFrameEnd= -1;
            _frameEndRead= true;
        }
        
        return toRead;
    }
}
