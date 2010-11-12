package java.io;

/**
 * @since CLDC 1.0
 */
public abstract class InputStream {
    public InputStream() {}

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

    public void mark(int readLimit) {}

    public boolean markSupported() {
        return false;
    }

    /**
     * @throws IOException
     */
    public abstract int read() throws IOException;

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
