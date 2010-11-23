package java.lang;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

public final class System {
    public final static PrintStream err;
    public final static InputStream in;
    public final static PrintStream out;

    static {
    	err= null;
    	in= null;
    	out= null;
    }
    
    /**
     * @throws IndexOutOfBoundsException 
     * @throws ArrayStoreException 
     * @throws NullPointerException
     */
    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) {}

    public static long currentTimeMillis() {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public static void exit(int status) {}

    public static void gc() {}

    /**
     * @throws SecurityException
     */
    public static Properties getProperties() {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public static String getProperty(String key) {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public static String getProperty(String key, String def) {
        return null;
    }

    public static SecurityManager getSecurityManager() {
        return null;
    }

    public static int identityHashCode(Object x) {
        return 0;
    }

    /**
     * @throws SecurityException 
     * @throws UnsatisfiedLinkError
     */
    public static void load(String filename) {}

    /**
     * @throws SecurityException 
     * @throws UnsatisfiedLinkError
     */
    public static void loadLibrary(String libname) {}

    public static String mapLibraryName(String libname) {
        return null;
    }

    public static void runFinalization() {}

    /**
     * @throws SecurityException
     */
    public static void setErr(PrintStream err) {}

    /**
     * @throws SecurityException
     */
    public static void setIn(InputStream in) {}

    /**
     * @throws SecurityException
     */
    public static void setOut(PrintStream out) {}

    /**
     * @throws SecurityException
     */
    public static void setProperties(Properties props) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public static String setProperty(String key, String value) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public static void setSecurityManager(SecurityManager s) {}


}
