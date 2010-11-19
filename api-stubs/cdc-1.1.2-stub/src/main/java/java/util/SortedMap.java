package java.util;

public interface SortedMap extends Map {
    Comparator comparator();

    Object firstKey();

    SortedMap headMap(Object arg0);

    Object lastKey();

    SortedMap subMap(Object arg0, Object arg1);

    SortedMap tailMap(Object arg0);

}
