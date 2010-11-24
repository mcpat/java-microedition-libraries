package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

public final class URL implements Serializable {
	/**
	 * @throws Error 
	 * @throws SecurityException
	 */
    public static void setURLStreamHandlerFactory(URLStreamHandlerFactory fac) {}

    /**
     * @throws MalformedURLException
     */
    public URL(String protocol, String host, int port, String file) throws MalformedURLException {}

    /**
     * @throws MalformedURLException
     */
    public URL(String protocol, String host, String file) throws MalformedURLException {}

    /**
     * @throws MalformedURLException
     * @throws SecurityException
     */
    public URL(String protocol, String host, int port, String file, URLStreamHandler handler) throws MalformedURLException {}

    /**
     * @throws MalformedURLException
     */
    public URL(String spec) throws MalformedURLException {}

    /**
     * @throws MalformedURLException
     */
    public URL(URL context, String spec) throws MalformedURLException {}

    /**
     * @throws MalformedURLException
     * @throws SecurityException
     */
    public URL(URL context, String spec, URLStreamHandler handler) throws MalformedURLException {}

    public boolean equals(Object obj) {
        return false;
    }

    public String getAuthority() {
        return null;
    }

    /**
     * @throws IOException
     */
    public final Object getContent() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public final Object getContent(Class[] classes) throws IOException {
        return null;
    }

    public int getDefaultPort() {
        return 0;
    }

    public String getFile() {
        return null;
    }

    public String getHost() {
        return null;
    }

    public String getPath() {
        return null;
    }

    public int getPort() {
        return 0;
    }

    public String getProtocol() {
        return null;
    }

    public String getQuery() {
        return null;
    }

    public String getRef() {
        return null;
    }

    public String getUserInfo() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws IOException
     */
    public URLConnection openConnection() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public final InputStream openStream() throws IOException {
        return null;
    }

    public boolean sameFile(URL other) {
        return false;
    }

    protected void set(String protocol, String host, int port, String file, String ref) {}

    protected void set(String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) {}

    public String toExternalForm() {
        return null;
    }

    public String toString() {
        return null;
    }

}
