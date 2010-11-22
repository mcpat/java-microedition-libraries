package java.io;

public class BufferedInputStream extends FilterInputStream {
    protected byte[] buf;
    protected int count;
    protected int marklimit;
    protected int markpos;
    protected int pos;

    public BufferedInputStream(InputStream in) {super(null);}
    /**
     * @throws IllegalArgumentException
     */
    public BufferedInputStream(InputStream in, int size) {super(null);}

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

    public void mark(int readlimit) {}

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
