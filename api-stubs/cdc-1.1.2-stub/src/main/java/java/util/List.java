package java.util;

public interface List extends Collection {
    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    boolean add(Object o);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    void add(int index, Object element);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    boolean addAll(Collection c);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    boolean addAll(int index, Collection c);

    /**
     * @throws UnsupportedOperationException
     */
    void clear();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean contains(Object o);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean containsAll(Collection c);

    boolean equals(Object o);

    /**
     * @throws IndexOutOfBoundsException
     */
    Object get(int index);

    int hashCode();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    int indexOf(Object o);

    boolean isEmpty();

    Iterator iterator();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    int lastIndexOf(Object o);

    ListIterator listIterator();

    /**
     * @throws IndexOutOfBoundsException
     */
    ListIterator listIterator(int index);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws UnsupportedOperationException
     */
    boolean remove(Object o);

    /**
     * @throws UnsupportedOperationException
     * @throws IndexOutOfBoundsException
     */
    Object remove(int index);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean removeAll(Collection c);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean retainAll(Collection c);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws IndexOutOfBoundsException
     */
    Object set(int index, Object element);

    int size();

    /**
     * @throws IndexOutOfBoundsException
     */
    List subList(int fromIndex, int toIndex);

    Object[] toArray();

    Object[] toArray(Object[] arg0);

}
