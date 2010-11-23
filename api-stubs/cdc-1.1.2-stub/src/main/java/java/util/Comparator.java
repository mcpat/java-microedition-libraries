package java.util;

public interface Comparator {
    /**
     * @throws ClassCastException
     */
    int compare(Object o1, Object o2);

    boolean equals(Object obj);

}
