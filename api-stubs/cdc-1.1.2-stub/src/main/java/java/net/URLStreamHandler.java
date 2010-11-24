package java.net;

import java.io.IOException;

public abstract class URLStreamHandler {
    public URLStreamHandler() {}

    protected boolean equals(URL u1, URL u2) {
        return false;
    }

    protected int getDefaultPort() {
        return 0;
    }

    protected InetAddress getHostAddress(URL u) {
        return null;
    }

    protected int hashCode(URL u) {
        return 0;
    }

    protected boolean hostsEqual(URL u1, URL u2) {
        return false;
    }

    /**
     * @throws IOException
     */
    protected abstract URLConnection openConnection(URL u) throws IOException;

    protected void parseURL(URL u, String spec, int start, int limit) {}

    protected boolean sameFile(URL u1, URL u2) {
        return false;
    }

    /**
     * @throws SecurityException
     */
    protected void setURL(URL u, String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) {}

    protected String toExternalForm(URL u) {
        return null;
    }

}
