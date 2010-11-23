package java.lang;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Enumeration;

public abstract class ClassLoader {
    /**
     * @throws SecurityException 
     * @throws IllegalStateException 
     * @throws Error
     */
	public static ClassLoader getSystemClassLoader() {
        return null;
    }

    public static URL getSystemResource(String name) {
        return null;
    }

    public static InputStream getSystemResourceAsStream(String name) {
        return null;
    }

    /**
     * @throws IOException
     */
    public static Enumeration getSystemResources(String name) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    protected ClassLoader(ClassLoader parent) {}

    /**
     * @throws SecurityException
     */
    protected ClassLoader() {}

    public void clearAssertionStatus() {}

    /**
     * @throws ClassFormatError 
     * @throws IndexOutOfBoundsException 
     * @throws SecurityException
     */
    protected final Class defineClass(String name, byte[] b, int off, int len) throws ClassFormatError {
        return null;
    }

    /**
     * @throws ClassFormatError 
     * @throws NoClassDefFoundError 
     * @throws IndexOutOfBoundsException 
     * @throws SecurityException
     */
    protected final Class defineClass(String name, byte[] b, int off, int len, ProtectionDomain protectionDomain) throws ClassFormatError {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     */
    protected Class findClass(String name) throws ClassNotFoundException {
        return null;
    }

    protected String findLibrary(String libname) {
        return null;
    }

    protected final Class findLoadedClass(String name) {
        return null;
    }

    protected URL findResource(String name) {
        return null;
    }

    /**
     * @throws IOException
     */
    protected Enumeration findResources(String name) throws IOException {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     */
    protected final Class findSystemClass(String name) throws ClassNotFoundException {
        return null;
    }

    protected Package getPackage(String name) {
        return null;
    }

    protected Package[] getPackages() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public final ClassLoader getParent() {
        return null;
    }

    public URL getResource(String name) {
        return null;
    }

    public InputStream getResourceAsStream(String name) {
        return null;
    }

    /**
     * @throws IOException
     */
    public final Enumeration getResources(String name) throws IOException {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     */
    public Class loadClass(String name) throws ClassNotFoundException {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     */
    protected Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    protected final void resolveClass(Class c) {}

    public void setClassAssertionStatus(String className, boolean enabled) {}

    public void setDefaultAssertionStatus(boolean enabled) {}

    public void setPackageAssertionStatus(String packageName, boolean enabled) {}

    protected final void setSigners(Class c, Object[] signers) {}

}
