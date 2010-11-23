package java.util;

public abstract class AbstractList extends AbstractCollection implements List {
    protected int modCount;

    protected AbstractList() {}

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     */
    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, Object element) {}

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    public boolean addAll(int index, Collection c) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public void clear() {}

    public boolean equals(Object o) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public abstract Object get(int index);

    public int hashCode() {
        return 0;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public Iterator iterator() {
        return null;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public ListIterator listIterator(int index) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws IndexOutOfBoundsException
     */
    public Object remove(int index) {
        return null;
    }

    protected void removeRange(int fromIndex, int toIndex) {}

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    public Object set(int index, Object element) {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

}
