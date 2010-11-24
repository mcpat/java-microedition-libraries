package java.security;

public class AccessControlException extends SecurityException {
    public AccessControlException(String s) {}
    public AccessControlException(String s, Permission p) {}

    public Permission getPermission() {
        return null;
    }

}
