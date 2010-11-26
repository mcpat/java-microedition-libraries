package java.util;

import java.io.Serializable;

public class Vector extends AbstractList implements List, RandomAccess, Cloneable, Serializable {
    protected int capacityIncrement;
    protected int elementCount;
    protected Object[] elementData;

    /**
     * @throws IllegalArgumentException
     */
    public Vector(int initialCapacity, int capacityIncrement) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public Vector(int initialCapacity) {}
    
    public Vector() {}
    
    /**
     * @throws NullPointerException
     */
    public Vector(Collection c) {}

    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void add(int index, Object element) {}

    /**
     * @throws NullPointerException
     */
    public boolean addAll(Collection c) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void addElement(Object obj) {}

    public int capacity() {
        return 0;
    }

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean contains(Object elem) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean containsAll(Collection c) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public void copyInto(Object[] anArray) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object elementAt(int index) {
        return null;
    }

    public Enumeration elements() {
        return null;
    }

    public void ensureCapacity(int minCapacity) {}

    public boolean equals(Object o) {
        return false;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object firstElement() {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object get(int index) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public int indexOf(Object elem) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public int indexOf(Object elem, int index) {
        return 0;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void insertElementAt(Object obj, int index) {}

    public boolean isEmpty() {
        return false;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object lastElement() {
        return null;
    }

    public int lastIndexOf(Object elem) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public int lastIndexOf(Object elem, int index) {
        return 0;
    }

    public boolean remove(Object o) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object remove(int index) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public boolean removeAll(Collection c) {
        return false;
    }

    public void removeAllElements() {}

    public boolean removeElement(Object obj) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void removeElementAt(int index) {}

    protected void removeRange(int fromIndex, int toIndex) {}

    /**
     * @throws NullPointerException
     */
    public boolean retainAll(Collection c) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public Object set(int index, Object element) {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setElementAt(Object obj, int index) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setSize(int newSize) {}

    public int size() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public Object[] toArray() {
        return null;
    }

    /**
     * @throws ArrayStoreException
     * @throws NullPointerException
     */
    public Object[] toArray(Object[] a) {
        return null;
    }

    public String toString() {
        return null;
    }

    public void trimToSize() {}

}
