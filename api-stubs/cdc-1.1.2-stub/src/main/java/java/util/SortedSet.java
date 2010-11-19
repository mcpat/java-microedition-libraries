package java.util;

public interface SortedSet extends Set {
    Comparator comparator();

    Object first();

    SortedSet headSet(Object arg0);

    Object last();

    SortedSet subSet(Object arg0, Object arg1);

    SortedSet tailSet(Object arg0);

}
