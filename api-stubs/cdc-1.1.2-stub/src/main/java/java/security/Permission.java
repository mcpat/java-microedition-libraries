package java.security;

import java.io.Serializable;

public abstract class Permission implements Guard, Serializable {
    public Permission(String name) {}

    /**
     * @throws SecurityException
     */
    public void checkGuard(Object object) throws SecurityException {}

    public abstract boolean equals(Object obj);

    public abstract String getActions();

    public final String getName() {
        return null;
    }

    public abstract int hashCode();

    public abstract boolean implies(Permission permission);

    public PermissionCollection newPermissionCollection() {
        return null;
    }

    public String toString() {
        return null;
    }

}
