package java.security;

public final class AllPermission extends Permission {
    public AllPermission() {}
    public AllPermission(String arg0, String arg1) {}

    public boolean equals(Object arg0) {
        return false;
    }

    public String getActions() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean implies(Permission arg0) {
        return false;
    }

    public PermissionCollection newPermissionCollection() {
        return null;
    }

}
