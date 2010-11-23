package java.util;

public interface Map {
    interface Entry {
        boolean equals(Object o);

        Object getKey();

        Object getValue();

        int hashCode();

        /**
         * @throws UnsupportedOperationException
         * @throws ClassCastException
         * @throws IllegalArgumentException
         * @throws NullPointerException
         */
        Object setValue(Object value);

    }
    
    /**
     * @throws UnsupportedOperationException
     */
    void clear();

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean containsKey(Object key);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    boolean containsValue(Object value);

    Set entrySet();

    boolean equals(Object o);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    Object get(Object key);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    Object put(Object key, Object value);

    /**
     * @throws UnsupportedOperationException
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    void putAll(Map t);

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     * @throws UnsupportedOperationException
     */
    Object remove(Object key);

    int size();

    Collection values();

}
