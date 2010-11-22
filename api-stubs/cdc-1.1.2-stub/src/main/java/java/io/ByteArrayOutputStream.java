package java.io;

public class ByteArrayOutputStream extends OutputStream {
    protected byte[] buf;
    protected int count;

    public ByteArrayOutputStream() {}
    /**
     * @throws IllegalArgumentException
     */
    public ByteArrayOutputStream(int size) {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    public void reset() {}

    public int size() {
        return 0;
    }

    public byte[] toByteArray() {
        return null;
    }

    public String toString() {
        return null;
    }

    /**
     * @throws UnsupportedEncodingException
     */
    public String toString(String enc) throws UnsupportedEncodingException {
        return null;
    }

    public void write(int arg0) {}

    public void write(byte[] b, int off, int len) {}

    /**
     * @throws IOException
     */
    public void writeTo(OutputStream out) throws IOException {}

}
