package javax.microedition.io;

import java.io.IOException;

/**
 * @since MIDP 2.0
 */
public interface ServerSocketConnection extends StreamConnectionNotifier {
	
	/**
	 * @throws IOException
	 */
	String getLocalAddress() throws IOException;

	/**
	 * @throws IOException
	 */
    int getLocalPort() throws IOException;

}
