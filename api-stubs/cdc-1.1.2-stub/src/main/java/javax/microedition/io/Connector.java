package javax.microedition.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @since CLDC 1.0
 */
public class Connector {
    public final static int READ= 1;
    public final static int READ_WRITE= 3;
    public final static int WRITE= 2;

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static Connection open(String name) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static Connection open(String name, int mode) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static Connection open(String name, int mode, boolean timeouts) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static DataInputStream openDataInputStream(String name) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static DataOutputStream openDataOutputStream(String name) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static InputStream openInputStream(String name) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws ConnectionNotFoundException
     * @throws IOException
     * @throws SecurityException
     */
    public static OutputStream openOutputStream(String name) throws IOException {
        return null;
    }
}
