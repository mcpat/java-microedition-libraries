package java.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Permission;
import java.util.Map;

public abstract class URLConnection {
    public static boolean getDefaultAllowUserInteraction() {
        return false;
    }

    public static FileNameMap getFileNameMap() {
        return null;
    }

    public static String guessContentTypeFromName(String fname) {
        return null;
    }

    /**
     * @throws IOException
     */
    public static String guessContentTypeFromStream(InputStream is) throws IOException {
        return null;
    }

    /**
     * @throws Error 
     * @throws SecurityException
     */
    public static void setContentHandlerFactory(ContentHandlerFactory fac) {}

    public static void setDefaultAllowUserInteraction(boolean defaultallowuserinteraction) {}

    /**
     * @throws SecurityException
     */
    public static void setFileNameMap(FileNameMap map) {}


    protected boolean allowUserInteraction;
    protected boolean connected;
    protected boolean doInput;
    protected boolean doOutput;
    protected long ifModifiedSince;
    protected URL url;
    protected boolean useCaches;

    protected URLConnection(URL url) {}

    /**
     * @throws IllegalStateException 
     * @throws NullPointerException
     */
    public void addRequestProperty(String key, String value) {}

    /**
     * @throws IOException
     */
    public abstract void connect() throws IOException;

    public boolean getAllowUserInteraction() {
        return false;
    }

    /**
     * @throws IOException 
     * @throws UnknownServiceException
     */
    public Object getContent() throws IOException {
        return null;
    }

    /**
     * @throws IOException 
     * @throws UnknownServiceException
     */
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

    public String getHeaderField(String name) {
        return null;
    }

    public String getHeaderField(int n) {
        return null;
    }

    public long getHeaderFieldDate(String name, long Default) {
        return 0;
    }

    public int getHeaderFieldInt(String name, int Default) {
        return 0;
    }

    public String getHeaderFieldKey(int n) {
        return null;
    }

    public Map getHeaderFields() {
        return null;
    }

    public long getIfModifiedSince() {
        return 0;
    }

    /**
     * @throws IOException
     * @throws UnknownServiceException
     */
    public InputStream getInputStream() throws IOException {
        return null;
    }

    public long getLastModified() {
        return 0;
    }

    /**
     * @throws IOException
     * @throws UnknownServiceException
     */
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public Permission getPermission() throws IOException {
        return null;
    }

    /**
     * @throws IllegalStateException
     */
    public Map getRequestProperties() {
        return null;
    }

    /**
     * @throws IllegalStateException
     */
    public String getRequestProperty(String key) {
        return null;
    }

    public URL getURL() {
        return null;
    }

    public boolean getUseCaches() {
        return false;
    }

    /**
     * @throws IllegalStateException
     */
    public void setAllowUserInteraction(boolean allowuserinteraction) {}

    public void setDefaultUseCaches(boolean defaultusecaches) {}

    /**
     * @throws IllegalStateException
     */
    public void setDoInput(boolean doinput) {}

    /**
     * @throws IllegalStateException
     */
    public void setDoOutput(boolean dooutput) {}

    /**
     * @throws IllegalStateException
     */
    public void setIfModifiedSince(long ifmodifiedsince) {}

    /**
     * @throws IllegalStateException 
     * @throws NullPointerException
     */
    public void setRequestProperty(String key, String value) {}

    /**
     * @throws IllegalStateException
     */
    public void setUseCaches(boolean usecaches) {}

    public String toString() {
        return null;
    }

}
