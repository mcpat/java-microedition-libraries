package java.security;

import java.io.Serializable;

public abstract class Permission implements Guard, Serializable {
    public Permission(String arg0) {}

    public void checkGuard(Object arg0) throws SecurityException {}

    public abstract boolean equals(Object arg0);

    public abstract String getActions();

    public final String getName() {
        return null;
    }

    public abstract int hashCode();

    public abstract boolean implies(Permission arg0);

    public PermissionCollection newPermissionCollection() {
        return null;
    }

    public String toString() {
        return null;
    }

}
