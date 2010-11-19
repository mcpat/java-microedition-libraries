package java.util;

public abstract class AbstractList extends AbstractCollection implements List {
    protected int modCount;

    protected AbstractList() {}

    public boolean add(Object arg0) {
        return false;
    }

    public void add(int arg0, Object arg1) {}

    public boolean addAll(int arg0, Collection arg1) {
        return false;
    }

    public void clear() {}

    public boolean equals(Object arg0) {
        return false;
    }

    public abstract Object get(int arg0);

    public int hashCode() {
        return 0;
    }

    public int indexOf(Object arg0) {
        return 0;
    }

    public Iterator iterator() {
        return null;
    }

    public int lastIndexOf(Object arg0) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int arg0) {
        return null;
    }

    public Object remove(int arg0) {
        return null;
    }

    protected void removeRange(int arg0, int arg1) {}

    public Object set(int arg0, Object arg1) {
        return null;
    }

    public List subList(int arg0, int arg1) {
        return null;
    }

}
