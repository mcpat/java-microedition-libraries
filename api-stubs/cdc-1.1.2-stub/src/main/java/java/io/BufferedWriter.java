package java.io;

public class BufferedWriter extends Writer {
    public BufferedWriter(Writer out) {}
    /**
     * @throws IllegalArgumentException
     */
    public BufferedWriter(Writer out, int sz) {}
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
    public void newLine() throws IOException {}

    /**
     * @throws IOException
     */
    public void write(int c) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(char[] cbuf, int off, int len) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(String s, int off, int len) throws IOException {}

}
