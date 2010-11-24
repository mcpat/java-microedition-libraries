package java.security;

import java.io.Serializable;
import java.util.Enumeration;

public abstract class PermissionCollection implements Serializable {
    public PermissionCollection() {}

    /**
     * @throws SecurityException
     */
    public abstract void add(Permission permission);

    public abstract Enumeration elements();

    public abstract boolean implies(Permission permission);

    public boolean isReadOnly() {
        return false;
    }

    public void setReadOnly() {}

    public String toString() {
        return null;
    }

}
