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

package com.github.libxjava.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class PropertyUtil {
    private static final class KeyValueReader {
        private InputStream _input;
        private byte[] _buffer;
        private int _off;
        private int _newLoad;
        private StringBuffer _builder;
        
        protected String lastKey;
        protected String lastValue;
        
        protected KeyValueReader(InputStream input) {
            _input= input;
            _buffer= new byte[512];
            _off= 0;
            _newLoad= 0;
            _builder= new StringBuffer();
        }
        
        protected boolean readPair() throws IOException {
            lastKey= null;
            lastValue= null;
            
            while(true) {
                if(_off >= _newLoad) {
                    _newLoad= _input.read(_buffer);
                        
                    if(_newLoad < 0) {
                        if(lastKey != null) {
                            lastValue= _builder.toString();
                            _builder.setLength(0);
                            return true;
                        }
                        
                        return false;
                    }
                    
                    _off= 0;
                }
                
                char ch= (char) (_buffer[_off++] & 0xFF);
                switch(ch) {
                    case '\r': {
                        break;
                    }
                    
                    case '=': {
                        if(lastKey != null) {
                            throw new IOException("unexpected character: =");
                        }
                        
                        lastKey= _builder.toString();
                        _builder.setLength(0);
                        break;
                    }
                    
                    case '\n': {
                        // line finished
                        
                        if(lastKey == null) {
                            throw new IOException("unexpected end of line");
                        }
                        
                        lastValue= _builder.toString();
                        _builder.setLength(0);
                        return true;
                    }
                    
                    default: {
                        _builder.append(ch);
                        break;
                    }
                }
            }
        }
    }
    
    public static Hashtable load(final InputStream input) throws IOException {
        if(input == null) {
            throw new IllegalArgumentException("input is null");
        }
        
        Hashtable result= new Hashtable();
        loadInto(result, input);
        return result;
    }
    
//    public static void save(final Hashtable properties, final OutputStream output) throws IOException {
//        if(output == null) {
//            throw new IllegalArgumentException("output is null");
//        }
//        
//        if(properties == null) {
//            throw new IllegalArgumentException("properties table is null");
//        }
//    }
    
    public static void loadInto(Hashtable properties, InputStream input) throws IOException {
        if(input == null) {
            throw new IllegalArgumentException("input is null");
        }
        
        if(properties == null) {
            throw new IllegalArgumentException("properties table is null");
        }
        
        KeyValueReader reader= new KeyValueReader(input);
        while(reader.readPair()) {
            properties.put(reader.lastKey, reader.lastValue);
        }
    }
    
    private PropertyUtil() {}
}
