package java.util;

public interface Enumeration {
    boolean hasMoreElements();

    /**
     * @throws NoSuchElementException
     */
    Object nextElement();

}
