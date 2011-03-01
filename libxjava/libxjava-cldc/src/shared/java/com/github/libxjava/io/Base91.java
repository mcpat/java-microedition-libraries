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
import java.io.OutputStream;

/**
 * Implementation of the basE91 algorithm available on
 * <a href="http://base91.sourceforge.net">http://base91.sourceforge.net</a>
 * 
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class Base91 extends BaseX {
    private static final byte[] ENCODABET;
    private static final byte[] DECODABET;
    
    static {
        ENCODABET= new byte[] {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '#', '$',
            '%', '&', '(', ')', '*', '+', ',', '.', '/', ':', ';', '<', '=',
            '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~', '"'
        };
        
        DECODABET= new byte[256];
        for(int i= 0; i < DECODABET.length; ++i) {
            DECODABET[i]= -1;
        }
        
        for(int i= 0; i < ENCODABET.length; ++i) {
            DECODABET[(ENCODABET[i] & 0xFF)]= (byte) i;
        }
    }
    
    protected void internalDecode(InputStream in, OutputStream out) throws IOException {
        int b;
        int working= 0;
        int shift= 0;
        int val= -1;
        
        while((b= in.read()) >= 0) {
            if(val == -1) {
                val= DECODABET[b];
            } else {
                val+= DECODABET[b] * 91;
                working|= val << shift;
                shift+= (val & 0x1FFF) > 88 ? 13 : 14;
                
                do {
                    out.write(working & 0xFF);
                    working>>= 8;
                    shift-= 8;
                } while(shift >= 8);
                
                val= -1;
            }
        }
        
        if(val != -1) {
            out.write((working | val << shift) & 0xFF);
        }
    }

    protected void internalEncode(InputStream in, OutputStream out) throws IOException {
        int b;
        int working= 0;
        int shift= 0;
        int val= 0;
        
        while((b= in.read()) >= 0) {
            working|= b << shift;
            shift+= 8;
            
            if(shift > 13) {
                val= working & 0x1FFF;
                
                if(val > 88) {
                    working>>= 13;
                    shift-= 13;
                } else {
                    val= working & 0x3FFF;
                    working>>= 14;
                    shift-= 14;
                }
                
                out.write(ENCODABET[val % 91]);
                out.write(ENCODABET[val / 91]);
            }
        }
        
        if(shift > 0) {
            out.write(ENCODABET[working % 91]);
            
            if(shift > 7 || working > 90) {
                out.write(ENCODABET[working / 91]);
            }
        }
    }
}
