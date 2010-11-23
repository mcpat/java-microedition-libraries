package java.util;

public abstract class AbstractCollection implements Collection {
    protected AbstractCollection() {}

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     */
    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     */
    public boolean addAll(Collection c) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public void clear() {}

    public boolean contains(Object o) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean containsAll(Collection c) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public abstract Iterator iterator();

    /**
     * @throws UnsupportedOperationException
     */
    public boolean remove(Object o) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     */
    public boolean removeAll(Collection c) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     */
    public boolean retainAll(Collection c) {
        return false;
    }

    public abstract int size();

    public Object[] toArray() {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws ArrayStoreException
     */
    public Object[] toArray(Object[] a) {
        return null;
    }

    public String toString() {
        return null;
    }

}
