package java.util;

public interface Map {
    void clear();

    boolean containsKey(Object arg0);

    boolean containsValue(Object arg0);

    Set entrySet();

    boolean equals(Object arg0);

    Object get(Object arg0);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    Object put(Object arg0, Object arg1);

    void putAll(Map arg0);

    Object remove(Object arg0);

    int size();

    Collection values();

}
