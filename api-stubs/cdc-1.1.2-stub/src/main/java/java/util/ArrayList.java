package java.util;

import java.io.Serializable;

public class ArrayList extends AbstractList implements List, RandomAccess, Cloneable, Serializable {
    /**
     * @throws IllegalArgumentException
     */
    public ArrayList(int initialCapacity) {}
    
    public ArrayList() {}
    
    /**
     * @throws NullPointerException
     */
    public ArrayList(Collection c) {}

    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, Object o) {}

    /**
     * @throws NullPointerException
     */
    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int arg0, Collection arg1) {
        return false;
    }

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean contains(Object elem) {
        return false;
    }

    public void ensureCapacity(int minCapacity) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public Object get(int index) {
        return null;
    }

    public int indexOf(Object elem) {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object elem) {
        return 0;
    }

    public Object remove(int index) {
        return null;
    }

    protected void removeRange(int fromIndex, int toIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public Object set(int index, Object element) {
        return null;
    }

    public int size() {
        return 0;
    }

    public Object[] toArray() {
        return null;
    }

    /**
     * @throws ArrayStoreException
     */
    public Object[] toArray(Object[] a) {
        return null;
    }

    public void trimToSize() {}

}
