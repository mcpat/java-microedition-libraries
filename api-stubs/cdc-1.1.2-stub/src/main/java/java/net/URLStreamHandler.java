package java.net;

public abstract class URLStreamHandler {
    public URLStreamHandler() {}

    protected boolean equals(URL arg0, URL arg1) {
        return false;
    }

    protected int getDefaultPort() {
        return 0;
    }

    protected InetAddress getHostAddress(URL arg0) {
        return null;
    }

    protected int hashCode(URL arg0) {
        return 0;
    }

    protected boolean hostsEqual(URL arg0, URL arg1) {
        return false;
    }

    protected abstract URLConnection openConnection(URL arg0) throws IOException;

    protected void parseURL(URL arg0, String arg1, int arg2, int arg3) {}

    protected boolean sameFile(URL arg0, URL arg1) {
        return false;
    }

    protected void setURL(URL arg0, String arg1, String arg2, int arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {}

    protected String toExternalForm(URL arg0) {
        return null;
    }

}
