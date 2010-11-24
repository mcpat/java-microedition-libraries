package java.security;

import java.io.Serializable;
import java.security.cert.Certificate;

public final class UnresolvedPermission extends Permission implements Serializable {
    public UnresolvedPermission(String type, String name, String actions, Certificate[] certs) {super(null);}

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

    public String toString() {
        return null;
    }

}
