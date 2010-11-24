package java.security;

public final class AccessController {
    /**
     * @throws AccessControlException
     */
    public static void checkPermission(Permission perm) throws AccessControlException {}

    public static Object doPrivileged(PrivilegedAction action) {
        return null;
    }

    public static Object doPrivileged(PrivilegedAction action, AccessControlContext context) {
        return null;
    }

    /**
     * @throws PrivilegedActionException
     */
    public static Object doPrivileged(PrivilegedExceptionAction action) throws PrivilegedActionException {
        return null;
    }

    /**
     * @throws PrivilegedActionException
     */
    public static Object doPrivileged(PrivilegedExceptionAction action, AccessControlContext context) throws PrivilegedActionException {
        return null;
    }

    public static AccessControlContext getContext() {
        return null;
    }


}
