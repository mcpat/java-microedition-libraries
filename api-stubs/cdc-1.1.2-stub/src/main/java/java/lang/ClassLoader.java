package java.lang;

public abstract class ClassLoader {
    public static ClassLoader getSystemClassLoader() {
        return null;
    }

    public static URL getSystemResource(String arg0) {
        return null;
    }

    public static InputStream getSystemResourceAsStream(String arg0) {
        return null;
    }

    public static Enumeration getSystemResources(String arg0) throws IOException {
        return null;
    }


    protected ClassLoader(ClassLoader arg0) {}
    protected ClassLoader() {}

    public void clearAssertionStatus() {}

    protected final Class defineClass(String arg0, byte[] arg1, int arg2, int arg3) throws ClassFormatError {
        return null;
    }

    protected final Class defineClass(String arg0, byte[] arg1, int arg2, int arg3, ProtectionDomain arg4) throws ClassFormatError {
        return null;
    }

    protected Package definePackage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, URL arg7) throws IllegalArgumentException {
        return null;
    }

    protected Class findClass(String arg0) throws ClassNotFoundException {
        return null;
    }

    protected String findLibrary(String arg0) {
        return null;
    }

    protected final Class findLoadedClass(String arg0) {
        return null;
    }

    protected URL findResource(String arg0) {
        return null;
    }

    protected Enumeration findResources(String arg0) throws IOException {
        return null;
    }

    protected final Class findSystemClass(String arg0) throws ClassNotFoundException {
        return null;
    }

    protected Package getPackage(String arg0) {
        return null;
    }

    protected Package[] getPackages() {
        return null;
    }

    public final ClassLoader getParent() {
        return null;
    }

    public URL getResource(String arg0) {
        return null;
    }

    public InputStream getResourceAsStream(String arg0) {
        return null;
    }

    public final Enumeration getResources(String arg0) throws IOException {
        return null;
    }

    public Class loadClass(String arg0) throws ClassNotFoundException {
        return null;
    }

    protected Class loadClass(String arg0, boolean arg1) throws ClassNotFoundException {
        return null;
    }

    protected final void resolveClass(Class arg0) {}

    public void setClassAssertionStatus(String arg0, boolean arg1) {}

    public void setDefaultAssertionStatus(boolean arg0) {}

    public void setPackageAssertionStatus(String arg0, boolean arg1) {}

    protected final void setSigners(Class arg0, Object[] arg1) {}

}
