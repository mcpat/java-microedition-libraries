package java.io;

/**
 * @since CLDC 1.0
 */
public class OutputStreamWriter extends Writer {
    public OutputStreamWriter(OutputStream os) {}
    
    /**
     * @throws UnsupportedEncodingException
     */
    public OutputStreamWriter(OutputStream os, String enc) throws UnsupportedEncodingException {}

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
    public void write(int c) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(char[] cbuf, int off, int len) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(String str, int off, int len) throws IOException {}

}
