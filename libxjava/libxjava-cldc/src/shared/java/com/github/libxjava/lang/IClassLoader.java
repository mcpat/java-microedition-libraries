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

package com.github.libxjava.lang;

import java.io.InputStream;


/**
 * Class loading interface for platforms with no {@code java.lang.ClassLoader}.
 * Classloaders are mainly used in the deserialisers.
 * 
 * @author Marcel Patzlaff
 */
public interface IClassLoader {
    /**
     * Returns the <code>Class</object> object associated with the class with the
     * given name. The classpath currently associated with this classloader
     * will be searched.
     * 
     * @param name  the fully qualified name of the desired class
     * @return      the <code>Class</code> object for the class with the specified name
     * @throws ClassNotFoundException   if the class could not be found
     * @throws Error                    if the function fails for any other reason
     */
    Class loadClass(String name) throws ClassNotFoundException;
    
    /**
     * Finds a resource with the given name in the classpath of this classloader.
     * This method returns <code>null</code> if no resource with this name is found.
     * <p>
     * The resource names can be represented in two different formats: absolute or relative.
     * <p>
     * Absolute format:
     * <ul><code>/packagePathName/resourceName</code></ul>
     * <p>
     * Relative format:
     * <ul><code>resourceName</code></ul>
     * <p>
     * In the absolute format, the programmer provides a fully qualified name that includes
     * both the full path and the name of the resource inside the classpath.  In the path
     * names, the character "/" is used as the separator.
     * <p>
     * In the relative format, the programmer provides only the name of the actual resource.
     * Relative names are converted to absolute names by the system by prefixing the
     * resource name with the fully qualified package name of class upon which the
     * <code>getResourceAsStream</code> method was called.
     * 
     * @param name  name of the desired resource
     * @return      a <code>java.io.InputStream</code> object
     */
    InputStream getResourceAsStream(String name);
}
