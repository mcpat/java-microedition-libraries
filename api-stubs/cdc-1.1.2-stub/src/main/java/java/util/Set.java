package java.util;

public interface Set extends Collection {
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
     */
    boolean addAll(Collection c);

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

    int hashCode();

    boolean isEmpty();

    Iterator iterator();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws UnsupportedOperationException
     */
    boolean remove(Object o);

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

    int size();

    Object[] toArray();

    /**
     * @throws ArrayStoreException
     * @throws NullPointerException
     */
    Object[] toArray(Object[] a);

}
