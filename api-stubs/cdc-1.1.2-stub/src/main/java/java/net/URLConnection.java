package java.net;

public abstract class URLConnection {
    public static boolean getDefaultAllowUserInteraction() {
        return false;
    }

    public static FileNameMap getFileNameMap() {
        return null;
    }

    public static String guessContentTypeFromName(String arg0) {
        return null;
    }

    public static String guessContentTypeFromStream(InputStream arg0) throws IOException {
        return null;
    }

    public static void setContentHandlerFactory(ContentHandlerFactory arg0) {}

    public static void setDefaultAllowUserInteraction(boolean arg0) {}

    public static void setFileNameMap(FileNameMap arg0) {}


    protected boolean allowUserInteraction;
    protected boolean connected;
    protected boolean doInput;
    protected boolean doOutput;
    protected long ifModifiedSince;
    protected URL url;
    protected boolean useCaches;

    protected URLConnection(URL arg0) {}

    public void addRequestProperty(String arg0, String arg1) {}

    public abstract void connect() throws IOException;

    public boolean getAllowUserInteraction() {
        return false;
    }

    public Object getContent() throws IOException {
        return null;
    }

    public Object getContent(Class[] arg0) throws IOException {
        return null;
    }

    public String getContentEncoding() {
        return null;
    }

    public int getContentLength() {
        return 0;
    }

    public String getContentType() {
        return null;
    }

    public long getDate() {
        return 0;
    }

    public boolean getDefaultUseCaches() {
        return false;
    }

    public boolean getDoInput() {
        return false;
    }

    public boolean getDoOutput() {
        return false;
    }

    public long getExpiration() {
        return 0;
    }

    public String getHeaderField(String arg0) {
        return null;
    }

    public String getHeaderField(int arg0) {
        return null;
    }

    public long getHeaderFieldDate(String arg0, long arg1) {
        return 0;
    }

    public int getHeaderFieldInt(String arg0, int arg1) {
        return 0;
    }

    public String getHeaderFieldKey(int arg0) {
        return null;
    }

    public Map getHeaderFields() {
        return null;
    }

    public long getIfModifiedSince() {
        return 0;
    }

    public InputStream getInputStream() throws IOException {
        return null;
    }

    public long getLastModified() {
        return 0;
    }

    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    public Permission getPermission() throws IOException {
        return null;
    }

    public Map getRequestProperties() {
        return null;
    }

    public String getRequestProperty(String arg0) {
        return null;
    }

    public URL getURL() {
        return null;
    }

    public boolean getUseCaches() {
        return false;
    }

    public void setAllowUserInteraction(boolean arg0) {}

    public void setDefaultUseCaches(boolean arg0) {}

    public void setDoInput(boolean arg0) {}

    public void setDoOutput(boolean arg0) {}

    public void setIfModifiedSince(long arg0) {}

    public void setRequestProperty(String arg0, String arg1) {}

    public void setUseCaches(boolean arg0) {}

    public String toString() {
        return null;
    }

}
