package java.security;

import java.io.Serializable;

public abstract class BasicPermission extends Permission implements Serializable {
    public BasicPermission(String arg0) {}
    public BasicPermission(String arg0, String arg1) {}

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
