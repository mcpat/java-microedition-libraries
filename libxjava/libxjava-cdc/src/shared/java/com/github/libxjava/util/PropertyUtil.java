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

package com.github.libxjava.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Properties;

/**
 * @author Marcel Patzlaff
 * @version ${project.artifactId} - ${project.version}
 */
public final class PropertyUtil {
    public static Hashtable load(final InputStream input) throws IOException {
        if(input == null) {
            throw new IllegalArgumentException("input is null");
        }
        
        Properties props= new Properties();
        props.load(input);
        return props;
    }
    
    public static void loadInto(Hashtable properties, InputStream input) throws IOException {
        if(input == null) {
            throw new IllegalArgumentException("input is null");
        }
        
        if(properties == null) {
            throw new IllegalArgumentException("properties table is null");
        }
        
        if(properties instanceof Properties) {
            ((Properties) properties).load(input);
            return;
        }
        
        Properties temp= new Properties();
        temp.load(input);
        properties.putAll(temp);
    }
}
