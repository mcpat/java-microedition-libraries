package java.util;

import java.io.Serializable;

public class LinkedList extends AbstractSequentialList implements List, Cloneable, Serializable {
    public LinkedList() {}
    
    /**
     * @throws NullPointerException
     */
    public LinkedList(Collection c) {}

    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void add(int index, Object element) {}

    /**
     * @throws NullPointerException
     */
    public boolean addAll(Collection c) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void addFirst(Object o) {}

    public void addLast(Object o) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean contains(Object o) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public Object get(int index) {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object getFirst() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object getLast() {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public Object remove(int index) {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object removeFirst() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object removeLast() {
        return null;
    }

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
     * @throws NoSuchElementException
     */
    public Object[] toArray(Object[] a) {
        return null;
    }

}
