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
 */
public class Base64 extends BaseX {
    private static final byte FILL = '=';
    private static final byte[] STANDARD_ENCODABET;
    private static final byte[] STANDARD_DECODABET;
    
    static {
        STANDARD_ENCODABET= new byte[] {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
        };
        
        STANDARD_DECODABET= new byte[256];
        for(int i= 0; i < STANDARD_DECODABET.length; ++i) {
            STANDARD_DECODABET[i]= -1;
        }
        
        for(int i= 0; i < STANDARD_ENCODABET.length; ++i) {
            STANDARD_DECODABET[(STANDARD_ENCODABET[i] & 0xFF)]= (byte) i;
        }
    }
    
    private final byte[] _decodedBuffer= new byte[3 * 20];
    private final byte[] _encodedBuffer= new byte[4 * 20];
    
    public Base64() {}
    
    protected void internalDecode(InputStream in, OutputStream out) throws IOException {
        int encOff= 0;
        int encLen= _encodedBuffer.length;
        int numBytes= 0;
        
        do {
            numBytes= in.read(_encodedBuffer, encOff, encLen);
            
            if(numBytes >= 0) {
                encLen-= numBytes; encOff+= numBytes;
                if(encLen > 0) {
                    continue;
                }
            } else {
                
            }
            
            if(encOff > 0) {
                int i= 0;
                int decIndex= 0;
                
                while(i < encOff) {
                    byte first= (byte) (STANDARD_DECODABET[_encodedBuffer[i++]] & 0x3F);
                    byte second= (byte) (STANDARD_DECODABET[_encodedBuffer[i++]] & 0x3F);
                    _decodedBuffer[decIndex++]= (byte) (((first << 2) | ((second >>> 4) & 0x3F)) & 0xFF);
                    first= second;
                    
                    if(_encodedBuffer[i] == FILL) {
                        out.write(_decodedBuffer, 0, decIndex);
                        return;
                    }
                    
                    second= (byte) (STANDARD_DECODABET[_encodedBuffer[i++]] & 0x3F);
                    _decodedBuffer[decIndex++]= (byte) (((first << 4) | ((second >>> 2) & 0x3F)) & 0xFF);
                    first= second;
                    
                    if(_encodedBuffer[i] == FILL) {
                        out.write(_decodedBuffer, 0, decIndex);
                        return;
                    }
                    
                    second= (byte) (STANDARD_DECODABET[_encodedBuffer[i++]] & 0x3F);
                    _decodedBuffer[decIndex++]= (byte) (((first << 6) | (second & 0x3F)) & 0xFF);
                }
                
                out.write(_decodedBuffer, 0, decIndex);
            }
            
            encOff= 0;
            encLen= _encodedBuffer.length;
        } while(numBytes >= 0);
    }

    protected void internalEncode(InputStream in, OutputStream out) throws IOException {
        int decOff= 0;
        int decLen= _decodedBuffer.length;
        int numBytes= 0;
        
        do {
            // read into decoded buffer
            numBytes= in.read(_decodedBuffer, decOff, decLen);
            
            if(numBytes >= 0) {
                decLen-= numBytes; decOff+= numBytes;
                
                if(decLen > 0) {
                    continue;
                }
            }

            if(decOff > 0) {
                int working= 0;
                int encIndex= 0;
                int shift= 0;
                for(int i= 0; i < decOff; ++i) {
                    working|= _decodedBuffer[i] & 0xFF;
                    shift+= 2;
                    _encodedBuffer[encIndex++]= STANDARD_ENCODABET[(working >>> shift) & 0x3F] ;
                    
                    if(shift == 6) {
                        _encodedBuffer[encIndex++]= STANDARD_ENCODABET[working & 0x3F];
                        shift= 0;
                    }
                    working <<= 8;
                }
                
                if(shift != 0) {
                    _encodedBuffer[encIndex++]= STANDARD_ENCODABET[(working >>> (shift + 2)) & 0x3F];
                    shift+= 2;
                    while(shift <= 6) {
                        _encodedBuffer[encIndex++]= FILL;
                        shift+= 2;
                    }
                }
 
                out.write(_encodedBuffer, 0, encIndex);
            }
            
            decOff= 0;
            decLen= _decodedBuffer.length;
        } while(numBytes >= 0);
    }
}
