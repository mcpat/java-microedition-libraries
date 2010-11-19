package java.security;

public abstract class Policy {
    public static Policy getPolicy() {
        return null;
    }

    public static void setPolicy(Policy arg0) {}


    public Policy() {}

    public abstract PermissionCollection getPermissions(CodeSource arg0);

    public PermissionCollection getPermissions(ProtectionDomain arg0) {
        return null;
    }

    public boolean implies(ProtectionDomain arg0, Permission arg1) {
        return false;
    }

    public abstract void refresh();

}
