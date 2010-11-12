package java.io;

/**
 * @since CLDC 1.0
 */
public class InputStreamReader extends Reader {
    public InputStreamReader(InputStream is) {}
    
    /**
     * @throws UnsupportedEncodingException
     */
    public InputStreamReader(InputStream is, String enc) throws UnsupportedEncodingException {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void mark(int readAheadLimit) throws IOException {}

    public boolean markSupported() {
        return false;
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

    /**
     * @throws IOException
     */
    public void reset() throws IOException {}

    /**
     * @throws IllegalArgumentException
     * @throws IOException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
