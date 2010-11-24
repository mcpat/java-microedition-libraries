package java.security;

public final class AllPermission extends Permission {
    public AllPermission() {super(null);}
    public AllPermission(String name, String actions) {super(null);}

    public boolean equals(Object obj) {
        return false;
    }

    public String getActions() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean implies(Permission p) {
        return false;
    }

    public PermissionCollection newPermissionCollection() {
        return null;
    }

}
