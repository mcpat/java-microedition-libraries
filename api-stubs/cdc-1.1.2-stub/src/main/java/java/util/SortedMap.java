package java.util;

public interface SortedMap extends Map {
    Comparator comparator();

    /**
     * @throws NoSuchElementException
     */
    Object firstKey();

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    SortedMap headMap(Object toKey);

    /**
     * @throws NoSuchElementException
     */
    Object lastKey();

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    SortedMap subMap(Object fromKey, Object toKey);

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    SortedMap tailMap(Object fromKey);

}
