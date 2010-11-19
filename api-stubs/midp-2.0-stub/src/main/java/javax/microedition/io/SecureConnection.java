package javax.microedition.io;

import java.io.IOException;

/**
 * @since MIDP 2.0
 */
public interface SecureConnection extends SocketConnection {
	
	/**
	 * @throws IOException
	 */
    SecurityInfo getSecurityInfo() throws IOException;

}
