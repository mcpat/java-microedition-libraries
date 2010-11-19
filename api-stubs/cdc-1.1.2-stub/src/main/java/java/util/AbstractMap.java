package java.util;

public abstract class AbstractMap implements Map {
    protected AbstractMap() {}

    public void clear() {}

    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    public boolean containsKey(Object arg0) {
        return false;
    }

    public boolean containsValue(Object arg0) {
        return false;
    }

    public abstract Set entrySet();

    public boolean equals(Object arg0) {
        return false;
    }

    public Object get(Object arg0) {
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

    public Object put(Object arg0, Object arg1) {
        return null;
    }

    public void putAll(Map arg0) {}

    public Object remove(Object arg0) {
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
