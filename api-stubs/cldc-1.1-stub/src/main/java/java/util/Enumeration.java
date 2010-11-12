package java.util;

/**
 * @since CLDC 1.0
 */
public interface Enumeration {
    boolean hasMoreElements();

    /**
     * @throws NoSuchElementException
     */
    Object nextElement();
}
