package java.security;

public final class AccessControlContext {
    public AccessControlContext(ProtectionDomain[] context) {}
    /**
     * @throws NullPointerException 
     * @throws SecurityException
     */
    public AccessControlContext(AccessControlContext acc, DomainCombiner combiner) {}

    /**
     * @throws AccessControlException
     * @throws NullPointerException
     */
    public void checkPermission(Permission perm) throws AccessControlException {}

    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public DomainCombiner getDomainCombiner() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

}
