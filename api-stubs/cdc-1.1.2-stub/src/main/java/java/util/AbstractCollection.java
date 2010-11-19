package java.util;

public abstract class AbstractCollection implements Collection {
    protected AbstractCollection() {}

    public boolean add(Object arg0) {
        return false;
    }

    public boolean addAll(Collection arg0) {
        return false;
    }

    public void clear() {}

    public boolean contains(Object arg0) {
        return false;
    }

    public boolean containsAll(Collection arg0) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public abstract Iterator iterator();

    public boolean remove(Object arg0) {
        return false;
    }

    public boolean removeAll(Collection arg0) {
        return false;
    }

    public boolean retainAll(Collection arg0) {
        return false;
    }

    public abstract int size();

    public Object[] toArray() {
        return null;
    }

    public Object[] toArray(Object[] arg0) {
        return null;
    }

    public String toString() {
        return null;
    }

}
