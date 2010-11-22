package java.io;

public class BufferedReader extends Reader {
	/**
	 * @throws IllegalArgumentException
	 */
    public BufferedReader(Reader in, int sz) {}
    public BufferedReader(Reader in) {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     * @throws IllegalArgumentException
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
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public String readLine() throws IOException {
        return null;
    }

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
     * @throws IllegalArgumentException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
