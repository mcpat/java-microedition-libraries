package java.net;

import java.io.IOException;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.SecureClassLoader;
import java.util.Enumeration;
import java.util.jar.Manifest;

public class URLClassLoader extends SecureClassLoader {
    public static URLClassLoader newInstance(URL[] urls, ClassLoader parent) {
        return null;
    }

    public static URLClassLoader newInstance(URL[] urls) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public URLClassLoader(URL[] urls, ClassLoader parent) {}

    /**
     * @throws SecurityException
     */
    public URLClassLoader(URL[] urls) {}

    /**
     * @throws SecurityException
     */
    public URLClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {}

    protected void addURL(URL url) {}

    /**
     * @throws IllegalArgumentException
     */
    protected Package definePackage(String name, Manifest man, URL url) throws IllegalArgumentException {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     */
    protected Class findClass(String name) throws ClassNotFoundException {
        return null;
    }

    public URL findResource(String name) {
        return null;
    }

    /**
     * @throws IOException
     */
    public Enumeration findResources(String name) throws IOException {
        return null;
    }

    protected PermissionCollection getPermissions(CodeSource codesource) {
        return null;
    }

    public URL[] getURLs() {
        return null;
    }

}
