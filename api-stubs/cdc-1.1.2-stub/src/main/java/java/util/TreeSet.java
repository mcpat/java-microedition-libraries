package java.util;

import java.io.Serializable;

public class TreeSet extends AbstractSet implements SortedSet, Cloneable, Serializable {
    public TreeSet() {}
    public TreeSet(Comparator c) {}
    
    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public TreeSet(Collection c) {}
    
    /**
     * @throws NullPointerException
     */
    public TreeSet(SortedSet s) {}

    /**
     * @throws ClassCastException
     */
    public boolean add(Object o) {
        return false;
    }

    /**
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {}

    public Object clone() {
        return null;
    }

    public Comparator comparator() {
        return null;
    }

    /**
     * @throws ClassCastException
     */
    public boolean contains(Object o) {
        return false;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object first() {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedSet headSet(Object toElement) {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object last() {
        return null;
    }

    /**
     * @throws ClassCastException
     */
    public boolean remove(Object o) {
        return false;
    }

    public int size() {
        return 0;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedSet subSet(Object fromElement, Object toElement) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public SortedSet tailSet(Object fromElement) {
        return null;
    }

}
