package java.util;

public abstract class AbstractSequentialList extends AbstractList {
    protected AbstractSequentialList() {}

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, Object element) {}

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    public boolean addAll(int index, Collection c) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public Object get(int index) {
        return null;
    }

    public Iterator iterator() {
        return null;
    }

    public abstract ListIterator listIterator(int index);

    /**
     * @throws UnsupportedOperationException
     * @throws IndexOutOfBoundsException
     */
    public Object remove(int index) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws NullPointerException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    public Object set(int index, Object element) {
        return null;
    }

}
