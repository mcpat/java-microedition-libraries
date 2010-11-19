package java.util;

public interface List extends Collection {
    boolean add(Object arg0);

    void add(int arg0, Object arg1);

    boolean addAll(Collection arg0);

    boolean addAll(int arg0, Collection arg1);

    void clear();

    boolean contains(Object arg0);

    boolean containsAll(Collection arg0);

    boolean equals(Object arg0);

    Object get(int arg0);

    int hashCode();

    int indexOf(Object arg0);

    boolean isEmpty();

    Iterator iterator();

    int lastIndexOf(Object arg0);

    ListIterator listIterator();

    ListIterator listIterator(int arg0);

    boolean remove(Object arg0);

    Object remove(int arg0);

    boolean removeAll(Collection arg0);

    boolean retainAll(Collection arg0);

    Object set(int arg0, Object arg1);

    int size();

    List subList(int arg0, int arg1);

    Object[] toArray();

    Object[] toArray(Object[] arg0);

}
