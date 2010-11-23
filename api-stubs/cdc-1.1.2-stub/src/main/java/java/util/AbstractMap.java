package java.util;

public abstract class AbstractMap implements Map {
    protected AbstractMap() {}

    /**
     * @throws UnsupportedOperationException
     */
    public void clear() {}

    /**
     * @throws CloneNotSupportedException
     */
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public abstract Set entrySet();

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

    public Set keySet() {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public Object put(Object key, Object value) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void putAll(Map t) {}

    /**
     * @throws UnsupportedOperationException
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
