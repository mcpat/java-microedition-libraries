package java.util;

import java.security.BasicPermission;
import java.security.Permission;
import java.security.PermissionCollection;

public final class PropertyPermission extends BasicPermission {
    public PropertyPermission(String name, String actions) {
        super(name, actions);
    }

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
