package java.io;

public class FilterInputStream extends InputStream {
    protected InputStream in;

    protected FilterInputStream(InputStream in) {}

    /**
     * @throws IOException
     */
    public int available() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    public void mark(int arg0) {}

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
    public int read(byte[] b) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void reset() throws IOException {}

    /**
     * @throws IOException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
