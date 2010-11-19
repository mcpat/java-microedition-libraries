package java.util;

public abstract class AbstractSequentialList extends AbstractList {
    protected AbstractSequentialList() {}

    public void add(int arg0, Object arg1) {}

    public boolean addAll(int arg0, Collection arg1) {
        return false;
    }

    public Object get(int arg0) {
        return null;
    }

    public Iterator iterator() {
        return null;
    }

    public abstract ListIterator listIterator(int arg0);

    public Object remove(int arg0) {
        return null;
    }

    public Object set(int arg0, Object arg1) {
        return null;
    }

}
