package java.io;

public class InputStreamReader extends Reader {
    public InputStreamReader(InputStream in) {}
    /**
     * @throws UnsupportedEncodingException
     */
    public InputStreamReader(InputStream in, String enc) throws UnsupportedEncodingException {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    public String getEncoding() {
        return null;
    }

    /**
     * @throws IOException
     */
    public int read() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public boolean ready() throws IOException {
        return false;
    }

}
