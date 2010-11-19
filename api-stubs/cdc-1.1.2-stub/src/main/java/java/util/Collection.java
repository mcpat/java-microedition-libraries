package java.util;

public interface Collection {
    boolean add(Object arg0);

    boolean addAll(Collection arg0);

    void clear();

    boolean contains(Object arg0);

    boolean containsAll(Collection arg0);

    boolean equals(Object arg0);

    int hashCode();

    boolean isEmpty();

    Iterator iterator();

    boolean remove(Object arg0);

    boolean removeAll(Collection arg0);

    boolean retainAll(Collection arg0);

    int size();

    Object[] toArray();

    Object[] toArray(Object[] arg0);

}
