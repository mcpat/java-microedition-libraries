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
 * Base85 implementation using the table proposed in RFC-1924.
 * 
 * @author Marcel Patzlaff
 * 
 * @see <a href="http://www.faqs.org/rfcs/rfc1924.html" />
 */
public class Base85 extends BaseX {
    private static final byte[] ENCODABET;
    private static final byte[] DECODABET;
    
    private final static long[] FACTORS= {
              1,
             85,
           7225,   // 85^2
         614125,   // 85^3
       52200625    // 85^4
    };

    static {
        ENCODABET= new byte[] {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '!', '#', '$', '%', '&', '(', ')', '*', '+', '-', ';', '<', '=',
            '>', '?', '@', '^', '_', '`', '{', '|', '}', '~' 
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
        int factor= 5;
        long sum= 0;
        
        while((b= in.read()) >= 0) {
            sum+= DECODABET[b] * FACTORS[--factor];
            
            if(factor == 0) {
                for(int e= 24; e >= 0; e-= 8) {
                    out.write((int)((sum >>> e) & 0xFF));
                }
                
                sum= 0;
                factor= 5;
            }
        }
        
        // process rest (if present)
        if(factor < 5) {
            sum/= FACTORS[factor];
            for(int e= (3 - factor) * 8; e >= 0; e-= 8) {
                out.write((int)((sum >>> e) & 0xFF));
            }
        }
    }

    protected void internalEncode(InputStream in, OutputStream out) throws IOException {
        int b;
        int bytes= 0;
        long sum= 0;
        while((b= in.read()) >= 0) {
            sum= (sum << 8) | b;
            bytes++;
            
            if(bytes == 4) {
                for(int e= 4; e >= 0; e--) {
                    out.write(ENCODABET[(int) (sum / FACTORS[e])]);
                    sum%= FACTORS[e];
                }
                sum= 0;
                bytes= 0;
            }
        }
        
        // process rest (if present)
        if(bytes > 0) {
            for(int e= bytes; e >= 0; e--) {
                out.write(ENCODABET[(int) (sum / FACTORS[e])]);
                sum%= FACTORS[e];
            }
        }
    }
}
