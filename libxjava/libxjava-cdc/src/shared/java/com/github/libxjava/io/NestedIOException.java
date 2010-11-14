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
 */
public class NestedIOException extends IOException {
    private static final long serialVersionUID= 1L;

    public NestedIOException() {
        super();
    }

    public NestedIOException(String s) {
        super(s);
    }
    
    public NestedIOException(String s, Throwable cause) {
        super(s, cause);
    }
    
    public Throwable getCause() {
        return super.getCause();
    }

    public void printStackTrace() {
        super.printStackTrace();
    }
}
