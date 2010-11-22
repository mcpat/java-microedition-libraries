package java.io;

import java.security.Permission;
import java.security.PermissionCollection;

public final class FilePermission extends Permission implements Serializable {
    public FilePermission(String path, String actions) {super(null);}

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
