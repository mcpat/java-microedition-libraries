package javax.microedition.io;

import java.io.IOException;

/**
 * @since MIDP 2.0
 */
public interface HttpsConnection extends HttpConnection {
    int getPort();

    /**
     * @throws IOException
     */
    SecurityInfo getSecurityInfo() throws IOException;

}
