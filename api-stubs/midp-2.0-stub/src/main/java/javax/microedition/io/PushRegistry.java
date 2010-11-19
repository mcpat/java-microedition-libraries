package javax.microedition.io;

import java.io.IOException;

/**
 * @since MIDP 2.0
 */
public class PushRegistry {
    public static String getFilter(String connection) {
        return null;
    }

    public static String getMIDlet(String connection) {
        return null;
    }

    public static String[] listConnections(boolean available) {
        return null;
    }

    /**
     * @throws ClassNotFoundException
     * @throws ConnectionNotFoundException
     * @throws SecurityException
     */
    public static long registerAlarm(String midlet, long time) throws ClassNotFoundException, ConnectionNotFoundException {
        return 0;
    }

    /**
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws SecurityException
     */
    public static void registerConnection(String connection, String midlet, String filter) throws ClassNotFoundException, IOException {}

    /**
     * @throws SecurityException
     */
    public static boolean unregisterConnection(String connection) {
        return false;
    }


}
