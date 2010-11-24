package java.security;

public abstract class Policy {
    /**
     * @throws SecurityException
     */
	public static Policy getPolicy() {
        return null;
    }

	/**
	 * @throws SecurityException
	 */
    public static void setPolicy(Policy policy) {}


    public Policy() {}

    public abstract PermissionCollection getPermissions(CodeSource codesource);

    public PermissionCollection getPermissions(ProtectionDomain domain) {
        return null;
    }

    public boolean implies(ProtectionDomain domain, Permission permission) {
        return false;
    }

    public abstract void refresh();

}
