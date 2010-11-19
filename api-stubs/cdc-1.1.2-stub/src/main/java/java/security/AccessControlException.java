package java.security;

public class AccessControlException extends SecurityException {
    public AccessControlException(String arg0) {}
    public AccessControlException(String arg0, Permission arg1) {}

    public Permission getPermission() {
        return null;
    }

}
