package java.util;

public abstract class AbstractSet extends AbstractCollection implements Set {
    protected AbstractSet() {}

    public boolean equals(Object arg0) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean removeAll(Collection arg0) {
        return false;
    }

}
