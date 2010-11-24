package java.util;

public class Collections {
    public final static List EMPTY_LIST;
    public final static Map EMPTY_MAP;
    public final static Set EMPTY_SET;
    
    static {
        EMPTY_LIST= singletonList(null);
        EMPTY_MAP= singletonMap(null, null);
        EMPTY_SET= singleton(null);
    }

    /**
     * @throws ClassCastException
     */
    public static int binarySearch(List list, Object key) {
        return 0;
    }

    /**
     * @throws ClassCastException
     */
    public static int binarySearch(List list, Object key, Comparator c) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws UnsupportedOperationException
     */
    public static void copy(List dest, List src) {}

    public static Enumeration enumeration(Collection c) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public static void fill(List list, Object obj) {}

    public static int indexOfSubList(List source, List target) {
        return 0;
    }

    public static int lastIndexOfSubList(List source, List target) {
        return 0;
    }

    public static ArrayList list(Enumeration e) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NoSuchElementException
     */
    public static Object max(Collection coll) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NoSuchElementException
     */
    public static Object max(Collection coll, Comparator comp) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NoSuchElementException
     */
    public static Object min(Collection coll) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws NoSuchElementException
     */
    public static Object min(Collection coll, Comparator comp) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public static List nCopies(int n, Object o) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public static boolean replaceAll(List list, Object oldVal, Object newVal) {
        return false;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public static void reverse(List list) {}

    public static Comparator reverseOrder() {
        return null;
    }

    /**
     * @throws UnsupportedOperationException
     */
    public static void rotate(List list, int distance) {}

    /**
     * @throws UnsupportedOperationException
     */
    public static void shuffle(List list) {}

    /**
     * @throws UnsupportedOperationException
     */
    public static void shuffle(List list, Random rnd) {}

    public static Set singleton(Object o) {
        return null;
    }

    public static List singletonList(Object o) {
        return null;
    }

    public static Map singletonMap(Object key, Object value) {
        return null;
    }

    /**
     * @throws ClassCastException
     * @throws UnsupportedOperationException
     */
    public static void sort(List list) {}

    /**
     * @throws ClassCastException
     * @throws UnsupportedOperationException
     */
    public static void sort(List list, Comparator c) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public static void swap(List list, int i, int j) {}

    public static Collection synchronizedCollection(Collection c) {
        return null;
    }

    public static List synchronizedList(List list) {
        return null;
    }

    public static Map synchronizedMap(Map m) {
        return null;
    }

    public static Set synchronizedSet(Set s) {
        return null;
    }

    public static SortedMap synchronizedSortedMap(SortedMap m) {
        return null;
    }

    public static SortedSet synchronizedSortedSet(SortedSet s) {
        return null;
    }

    public static Collection unmodifiableCollection(Collection c) {
        return null;
    }

    public static List unmodifiableList(List list) {
        return null;
    }

    public static Map unmodifiableMap(Map m) {
        return null;
    }

    public static Set unmodifiableSet(Set s) {
        return null;
    }

    public static SortedMap unmodifiableSortedMap(SortedMap m) {
        return null;
    }

    public static SortedSet unmodifiableSortedSet(SortedSet s) {
        return null;
    }


}
