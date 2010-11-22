package java.io;

public class PipedOutputStream extends OutputStream {
    /**
     * @throws IOException
     */
    public PipedOutputStream(PipedInputStream snk) throws IOException {}
    public PipedOutputStream() {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void connect(PipedInputStream snk) throws IOException {}

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    /**
     * @throws IOException
     */
    public void write(int b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b, int off, int len) throws IOException {}

}
