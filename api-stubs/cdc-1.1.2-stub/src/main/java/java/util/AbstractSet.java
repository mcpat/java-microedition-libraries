package java.util;

public abstract class AbstractSet extends AbstractCollection implements Set {
    protected AbstractSet() {}

    public boolean equals(Object o) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     */
    public boolean removeAll(Collection c) {
        return false;
    }

}
