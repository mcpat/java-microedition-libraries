package java.util;

import java.io.Serializable;

public class HashSet extends AbstractSet implements Set, Cloneable, Serializable {
    public HashSet() {}
    
    /**
     * @throws NullPointerException
     */
    public HashSet(Collection c) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public HashSet(int initialCapacity, float loadFactor) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public HashSet(int initialCapacity) {}

    public boolean add(Object o) {
        return false;
    }

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    public int size() {
        return 0;
    }

}
