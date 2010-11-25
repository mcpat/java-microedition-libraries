package java.util;

public class LinkedHashMap extends HashMap {
    /**
     * @throws IllegalArgumentException
     */
    public LinkedHashMap(int initialCapacity, float loadFactor) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public LinkedHashMap(int initialCapacity) {}
    public LinkedHashMap() {}
    
    /**
     * @throws NullPointerException
     */
    public LinkedHashMap(Map m) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {}

    public void clear() {}

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    protected boolean removeEldestEntry(Entry eldest) {
        return false;
    }

}
