package java.net;

public class URLClassLoader extends SecureClassLoader {
    public static URLClassLoader newInstance(URL[] arg0, ClassLoader arg1) {
        return null;
    }

    public static URLClassLoader newInstance(URL[] arg0) {
        return null;
    }


    public URLClassLoader(URL[] arg0, ClassLoader arg1) {}
    public URLClassLoader(URL[] arg0) {}
    public URLClassLoader(URL[] arg0, ClassLoader arg1, URLStreamHandlerFactory arg2) {}

    protected void addURL(URL arg0) {}

    protected Package definePackage(String arg0, Manifest arg1, URL arg2) throws IllegalArgumentException {
        return null;
    }

    protected Class findClass(String arg0) throws ClassNotFoundException {
        return null;
    }

    public URL findResource(String arg0) {
        return null;
    }

    public Enumeration findResources(String arg0) throws IOException {
        return null;
    }

    protected PermissionCollection getPermissions(CodeSource arg0) {
        return null;
    }

    public URL[] getURLs() {
        return null;
    }

}
