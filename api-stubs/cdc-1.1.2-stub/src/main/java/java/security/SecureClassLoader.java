package java.security;

public class SecureClassLoader extends ClassLoader {
    protected SecureClassLoader(ClassLoader arg0) {}
    protected SecureClassLoader() {}

    protected final Class defineClass(String arg0, byte[] arg1, int arg2, int arg3, CodeSource arg4) {
        return null;
    }

    protected PermissionCollection getPermissions(CodeSource arg0) {
        return null;
    }

}
