package java.io;

/**
 * @since CLDC 1.0
 */
public abstract class Reader {
    protected Object lock;

    protected Reader() {}
    protected Reader(Object lock) {}

    /**
     * @throws IOException
     */
    public abstract void close() throws IOException;

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
    public int read(char[] cbuf) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public abstract int read(char[] cbuf, int off, int len) throws IOException;

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
     * @throws IOException
     */
    public long skip(long n) throws IOException {
        return 0;
    }
}
