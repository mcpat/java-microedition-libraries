package java.util;

public interface ListIterator extends Iterator {
    void add(Object arg0);

    boolean hasNext();

    boolean hasPrevious();

    Object next();

    int nextIndex();

    Object previous();

    int previousIndex();

    void remove();

    void set(Object arg0);

}
