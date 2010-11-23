package java.net;

import java.io.Serializable;
import java.security.Permission;
import java.security.PermissionCollection;

public final class SocketPermission extends Permission implements Serializable {
    public SocketPermission(String host, String action) {super(null);}

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
