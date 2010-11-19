package java.security;

public final class AccessControlContext {
    public AccessControlContext(ProtectionDomain[] arg0) {}
    public AccessControlContext(AccessControlContext arg0, DomainCombiner arg1) {}

    public void checkPermission(Permission arg0) throws AccessControlException {}

    public boolean equals(Object arg0) {
        return false;
    }

    public DomainCombiner getDomainCombiner() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

}
