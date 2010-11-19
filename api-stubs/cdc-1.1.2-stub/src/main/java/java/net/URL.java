package java.net;

public final class URL implements Serializable {
    public static void setURLStreamHandlerFactory(URLStreamHandlerFactory arg0) {}


    public URL(String arg0, String arg1, int arg2, String arg3) throws MalformedURLException {}
    public URL(String arg0, String arg1, String arg2) throws MalformedURLException {}
    public URL(String arg0, String arg1, int arg2, String arg3, URLStreamHandler arg4) throws MalformedURLException {}
    public URL(String arg0) throws MalformedURLException {}
    public URL(URL arg0, String arg1) throws MalformedURLException {}
    public URL(URL arg0, String arg1, URLStreamHandler arg2) throws MalformedURLException {}

    public boolean equals(Object arg0) {
        return false;
    }

    public String getAuthority() {
        return null;
    }

    public final Object getContent() throws IOException {
        return null;
    }

    public final Object getContent(Class[] arg0) throws IOException {
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

    public URLConnection openConnection() throws IOException {
        return null;
    }

    public final InputStream openStream() throws IOException {
        return null;
    }

    public boolean sameFile(URL arg0) {
        return false;
    }

    protected void set(String arg0, String arg1, int arg2, String arg3, String arg4) {}

    protected void set(String arg0, String arg1, int arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {}

    public String toExternalForm() {
        return null;
    }

    public String toString() {
        return null;
    }

}
