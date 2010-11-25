package java.util;

import java.io.Serializable;

public class Hashtable extends Dictionary implements Map, Cloneable, Serializable {
    /**
     * @throws IllegalArgumentException
     */
    public Hashtable(int initialCapacity, float loadFactor) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public Hashtable(int initialCapacity) {}
    
    public Hashtable() {}
    
    /**
     * @throws NullPointerException
     */
    public Hashtable(Map t) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public boolean contains(Object value) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean containsKey(Object key) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean containsValue(Object value) {
        return false;
    }

    public Enumeration elements() {
        return null;
    }

    public Set entrySet() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public Object get(Object key) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Enumeration keys() {
        return null;
    }

    public Set keySet() {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public Object put(Object key, Object value) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public void putAll(Map t) {}

    protected void rehash() {}

    /**
     * @throws NullPointerException
     */
    public Object remove(Object key) {
        return null;
    }

    public int size() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public Collection values() {
        return null;
    }

}
