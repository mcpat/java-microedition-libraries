package java.io;

public class PipedInputStream extends InputStream {
    protected final static int PIPE_SIZE= 1024;

    protected byte[] buffer;
    protected int in;
    protected int out;

    /**
     * @throws IOException
     */
    public PipedInputStream(PipedOutputStream src) throws IOException {}
    public PipedInputStream() {}

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

    /**
     * @throws IOException
     */
    public void connect(PipedOutputStream src) throws IOException {}

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
    protected void receive(int b) throws IOException {}

}
