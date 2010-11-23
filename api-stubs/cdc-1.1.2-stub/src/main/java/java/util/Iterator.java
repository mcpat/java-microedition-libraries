package java.util;

public interface Iterator {
    boolean hasNext();

    /**
     * @throws NoSuchElementException
     */
    Object next();

    /**
     * @throws UnsupportedOperationException
     * @throws IllegalStateException
     */
    void remove();

}
