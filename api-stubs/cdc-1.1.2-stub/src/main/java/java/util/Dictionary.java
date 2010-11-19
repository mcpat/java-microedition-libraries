package java.util;

public abstract class Dictionary {
    public Dictionary() {}

    public abstract Enumeration elements();

    public abstract Object get(Object arg0);

    public abstract boolean isEmpty();

    public abstract Enumeration keys();

    public abstract Object put(Object arg0, Object arg1);

    public abstract Object remove(Object arg0);

    public abstract int size();

}
