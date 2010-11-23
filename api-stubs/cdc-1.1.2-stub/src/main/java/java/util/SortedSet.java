package java.util;

public interface SortedSet extends Set {
    Comparator comparator();

    /**
     * @throws NoSuchElementException
     */
    Object first();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    SortedSet headSet(Object toElement);

    /**
     * @throws NoSuchElementException
     */
    Object last();

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    SortedSet subSet(Object fromElement, Object toElement);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    SortedSet tailSet(Object fromElement);

}
