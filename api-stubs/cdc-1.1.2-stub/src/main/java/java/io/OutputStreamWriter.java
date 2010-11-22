package java.io;

public class OutputStreamWriter extends Writer {
    /**
     * @throws UnsupportedEncodingException
     */
    public OutputStreamWriter(OutputStream out, String enc) throws UnsupportedEncodingException {}
    public OutputStreamWriter(OutputStream out) {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    public String getEncoding() {
        return null;
    }

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
