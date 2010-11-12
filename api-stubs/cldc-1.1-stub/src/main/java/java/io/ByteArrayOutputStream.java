package java.io;

/**
 * @since CLDC 1.0
 */
public class ByteArrayOutputStream extends OutputStream {
    protected byte[] buf;
    protected int count;
    
    public ByteArrayOutputStream() {}
    public ByteArrayOutputStream(int size) {}
    
    /**
     * @throws IOException
     */
    public void close() throws IOException {}
    
    public void reset() {}
    
    public int size() {
        return -1;
    }
    
    public byte[] toByteArray() {
        return null;
    }
    
    public String toString() {
        return null;
    }
    
    public void write(byte[] b, int off, int len) {}
    
    public void write(int b) {}
}
