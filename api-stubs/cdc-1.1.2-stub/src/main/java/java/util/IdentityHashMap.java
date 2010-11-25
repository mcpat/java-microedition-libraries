package java.util;

import java.io.Serializable;

public class IdentityHashMap extends AbstractMap implements Map, Serializable, Cloneable {
    public IdentityHashMap() {}
    
    /**
     * @throws IllegalArgumentException
     */
    public IdentityHashMap(int expectedMaxCapacity) {}
    
    /**
     * @throws NullPointerException
     */
    public IdentityHashMap(Map m) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Set entrySet() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Set keySet() {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public void putAll(Map t) {}

    public Object remove(Object key) {
        return null;
    }

    public int size() {
        return 0;
    }

    public Collection values() {
        return null;
    }

}
