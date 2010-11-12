package java.io;

/**
 * @since CLDC 1.0
 */
public class DataInputStream extends InputStream implements DataInput {
    /**
     * @throws EOFException
     * @throws IOException
     * @throws UTFDataFormatException
     */
    public final static String readUTF(DataInput in) throws IOException {
        return null;
    }
    
    
    protected InputStream in;

    public DataInputStream(InputStream in) {}

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

    public void mark(int readLimit) {}

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
    public final int read(byte[] b) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public final int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public final boolean readBoolean() throws IOException {
        return false;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final byte readByte() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final char readChar() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final double readDouble() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final float readFloat() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final void readFully(byte[] b) throws IOException {}

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final void readFully(byte[] b, int off, int len) throws IOException {}

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final int readInt() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final long readLong() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final short readShort() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final int readUnsignedByte() throws IOException {
        return 0;
    }
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    public final String readUTF() throws IOException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public final int readUnsignedShort() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void reset() throws IOException {}

    /**
     * @throws IOException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public final int skipBytes(int n) throws IOException {
        return 0;
    }
}
