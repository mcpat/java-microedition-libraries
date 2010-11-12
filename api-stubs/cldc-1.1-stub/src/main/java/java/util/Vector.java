package java.util;

/**
 * @since
 */
public class Vector {
    protected int capacityIncrement;
    protected int elementCount;
    protected Object[] elementData;

    public Vector() {}
    public Vector(int initialCapacity) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public Vector(int initialCapacity, int capacityIncrement) {}

    public void addElement(Object obj) {}

    public int capacity() {
        return 0;
    }

    public boolean contains(Object elem) {
        return false;
    }

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

    public Object firstElement() {
        return null;
    }

    public int indexOf(Object elem) {
        return 0;
    }

    public int indexOf(Object elem, int index) {
        return 0;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void insertElementAt(Object elem, int index) {}

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

    public void removeAllElements() {}

    public boolean removeElement(Object obj) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void removeElementAt(int index) {}

    public void setElementAt(Object obj, int index) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setSize(int newSize) {}

    public int size() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public void trimToSize() {}
}
