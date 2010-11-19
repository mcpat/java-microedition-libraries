package java.security;

public final class AccessController {
    public static void checkPermission(Permission arg0) throws AccessControlException {}

    public static Object doPrivileged(PrivilegedAction arg0) {
        return null;
    }

    public static Object doPrivileged(PrivilegedAction arg0, AccessControlContext arg1) {
        return null;
    }

    public static Object doPrivileged(PrivilegedExceptionAction arg0) throws PrivilegedActionException {
        return null;
    }

    public static Object doPrivileged(PrivilegedExceptionAction arg0, AccessControlContext arg1) throws PrivilegedActionException {
        return null;
    }

    public static AccessControlContext getContext() {
        return null;
    }


}
