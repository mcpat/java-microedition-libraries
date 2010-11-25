package java.util;

import java.io.Serializable;

public class TreeMap extends AbstractMap implements SortedMap, Cloneable, Serializable {
    public TreeMap() {}
    public TreeMap(Comparator c) {}
    
    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public TreeMap(Map m) {}
    
    /**
     * @throws NullPointerException
     */
    public TreeMap(SortedMap m) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public Comparator comparator() {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Set entrySet() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object firstKey() {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public Object get(Object key) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedMap headMap(Object toKey) {
        return null;
    }

    public Set keySet() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object lastKey() {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public Object put(Object key, Object value) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public void putAll(Map map) {}

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public Object remove(Object key) {
        return null;
    }

    public int size() {
        return 0;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedMap subMap(Object fromKey, Object toKey) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedMap tailMap(Object fromKey) {
        return null;
    }

    public Collection values() {
        return null;
    }

}
