package java.util;

public abstract class Dictionary {
    public Dictionary() {}

    public abstract Enumeration elements();

    /**
     * @throws NullPointerException
     */
    public abstract Object get(Object key);

    public abstract boolean isEmpty();

    public abstract Enumeration keys();

    /**
     * @throws NullPointerException
     */
    public abstract Object put(Object key, Object value);

    /**
     * @throws NullPointerException
     */
    public abstract Object remove(Object key);

    public abstract int size();

}
