package java.io;

public abstract class OutputStream {
    public OutputStream() {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    /**
     * @throws IOException
     */
    public abstract void write(int b) throws IOException;

    /**
     * @throws IOException
     */
    public void write(byte[] b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b, int off, int len) throws IOException {}

}
