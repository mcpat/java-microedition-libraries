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

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public class NestedIOException extends IOException {
    private Throwable _cause;
    
    public NestedIOException() {
        super();
    }

    public NestedIOException(String s) {
        super(s);
    }
    
    public NestedIOException(String s, Throwable cause) {
        super(s);
        _cause= cause;
    }
    
    public Throwable getCause() {
        return _cause;
    }

    public void printStackTrace() {
        super.printStackTrace();
        
        if(_cause != null) {
            System.err.print("caused by ");
            _cause.printStackTrace();
        }
    }
}
