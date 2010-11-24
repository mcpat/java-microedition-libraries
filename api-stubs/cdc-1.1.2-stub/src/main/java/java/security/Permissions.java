package java.security;

import java.io.Serializable;
import java.util.Enumeration;

public final class Permissions extends PermissionCollection implements Serializable {
    public Permissions() {}

    public void add(Permission permission) {}

    public Enumeration elements() {
        return null;
    }

    public boolean implies(Permission permission) {
        return false;
    }

}
