package java.io;

public class PushbackInputStream extends FilterInputStream {
    protected byte[] buf;
    protected int pos;

    /**
     * @throws IllegalArgumentException
     */
    public PushbackInputStream(InputStream in, int size) {super(null);}
    public PushbackInputStream(InputStream in) {super(null);}

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
    public long skip(long n) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void unread(int b) throws IOException {}

    /**
     * @throws IOException
     */
    public void unread(byte[] b, int off, int len) throws IOException {}

    /**
     * @throws IOException
     */
    public void unread(byte[] b) throws IOException {}

}
