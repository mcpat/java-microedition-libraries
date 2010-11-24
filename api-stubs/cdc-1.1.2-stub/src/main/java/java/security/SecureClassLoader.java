package java.security;

public class SecureClassLoader extends ClassLoader {
	/**
	 * @throws SecurityException
	 */
    protected SecureClassLoader(ClassLoader parent) {}

    /**
     * @throws SecurityException
     */
    protected SecureClassLoader() {}

    /**
     * @throws ClassFormatError 
     * @throws IndexOutOfBoundsException 
     * @throws SecurityException
     */
    protected final Class defineClass(String name, byte[] b, int off, int len, CodeSource cs) {
        return null;
    }

    protected PermissionCollection getPermissions(CodeSource codesource) {
        return null;
    }

}
