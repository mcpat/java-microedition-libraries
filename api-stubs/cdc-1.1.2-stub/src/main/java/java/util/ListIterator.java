package java.util;

public interface ListIterator extends Iterator {
    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     */
    void add(Object o);

    boolean hasNext();

    boolean hasPrevious();

    /**
     * @throws NoSuchElementException
     */
    Object next();

    int nextIndex();

    /**
     * @throws NoSuchElementException
     */
    Object previous();

    int previousIndex();

    /**
     * @throws UnsupportedOperationException
     * @throws IllegalStateException
     */
    void remove();

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     */
    void set(Object o);

}
