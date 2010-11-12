package java.lang;

import java.io.PrintStream;

/**
 * @since CLDC 1.0
 */
public final class System {
    public final static PrintStream err;
    public final static PrintStream out;

    static {
        err= new PrintStream(null);
        out= new PrintStream(null);
    }
    
    /**
     * @throws IndexOutOfBoundsException
     * @throws ArrayStoreException
     * @throws NullPointerException
     */
    public static void arraycopy(Object src, int srcOffset, Object dst, int dstOffset, int length) {}

    public static long currentTimeMillis() {
        return 0;
    }

    public static void exit(int status) {}

    public static void gc() {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public static String getProperty(String key) {
        return null;
    }

    public static int identityHashCode(Object arg0) {
        return 0;
    }
}
