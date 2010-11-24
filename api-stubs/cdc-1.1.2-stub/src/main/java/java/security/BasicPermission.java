package java.security;

import java.io.Serializable;

public abstract class BasicPermission extends Permission implements Serializable {
	/**
	 * @throws NullPointerException 
	 * @throws IllegalArgumentException
	 */
    public BasicPermission(String name) {super(null);}

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public BasicPermission(String name, String actions) {super(null);}

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
