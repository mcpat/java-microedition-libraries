package javax.microedition.io;

import java.io.IOException;

/**
 * @since MIDP 2.0
 */
public interface SocketConnection extends StreamConnection {
    byte DELAY= 0;
    byte KEEPALIVE= 2;
    byte LINGER= 1;
    byte RCVBUF= 3;
    byte SNDBUF= 4;

    /**
     * @throws IOException
     */
    String getAddress() throws IOException;

    /**
     * @throws IOException
     */
    String getLocalAddress() throws IOException;

    /**
     * @throws IOException
     */
    int getLocalPort() throws IOException;

    /**
     * @throws IOException
     */
    int getPort() throws IOException;

    /**
     * @throws IllegalArgumentException
     * @throws IOException
     */
    int getSocketOption(byte option) throws IllegalArgumentException, IOException;

    /**
     * @throws IllegalArgumentException
     * @throws IOException
     */
    void setSocketOption(byte option, int value) throws IllegalArgumentException, IOException;

}
