package java.security;

public class ProtectionDomain {
    public ProtectionDomain(CodeSource arg0, PermissionCollection arg1) {}
    public ProtectionDomain(CodeSource arg0, PermissionCollection arg1, ClassLoader arg2, Principal[] arg3) {}

    public final ClassLoader getClassLoader() {
        return null;
    }

    public final CodeSource getCodeSource() {
        return null;
    }

    public final PermissionCollection getPermissions() {
        return null;
    }

    public final Principal[] getPrincipals() {
        return null;
    }

    public boolean implies(Permission arg0) {
        return false;
    }

    public String toString() {
        return null;
    }

}
