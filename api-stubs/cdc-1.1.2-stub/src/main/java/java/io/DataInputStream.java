package java.io;

public class DataInputStream extends FilterInputStream implements DataInput {
	/**
	 * @throws IOException
	 * @throws EOFException
     * @throws UTFDataFormatException
	 */
    public final static String readUTF(DataInput in) throws IOException {
        return null;
    }

    public DataInputStream(InputStream in) {super(null);}

    /**
     * @throws IOException
     */
    public final int read(byte[] b) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public final int read(byte[] b, int off, int len)throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final boolean readBoolean() throws IOException {
        return false;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final byte readByte() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final char readChar() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final double readDouble() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final float readFloat() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final void readFully(byte[] b) throws IOException {}

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final void readFully(byte[] b, int off, int len)throws IOException {}

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final int readInt() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public final String readLine() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final long readLong() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final short readShort() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final int readUnsignedByte() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public final int readUnsignedShort() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     * @throws UTFDataFormatException
     */
    public final String readUTF() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public final int skipBytes(int n) throws IOException {
        return 0;
    }

}
