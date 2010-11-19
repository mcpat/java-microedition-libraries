package java.security;

public abstract class PermissionCollection implements Serializable {
    public PermissionCollection() {}

    public abstract void add(Permission arg0);

    public abstract Enumeration elements();

    public abstract boolean implies(Permission arg0);

    public boolean isReadOnly() {
        return false;
    }

    public void setReadOnly() {}

    public String toString() {
        return null;
    }

}
