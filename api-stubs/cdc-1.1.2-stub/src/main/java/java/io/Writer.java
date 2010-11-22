package java.io;

public abstract class Writer {
    protected Object lock;

    protected Writer() {}
    protected Writer(Object lock) {}

    /**
     * @throws IOException
     */
    public abstract void close() throws IOException;

    /**
     * @throws IOException
     */
    public abstract void flush() throws IOException;

    /**
     * @throws IOException
     */
    public void write(int c) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(char[] cbuf) throws IOException {}

    /**
     * @throws IOException
     */
    public abstract void write(char[] cbuf, int off, int len) throws IOException;

    /**
     * @throws IOException
     */
    public void write(String str) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(String str, int off, int len) throws IOException {}

}
