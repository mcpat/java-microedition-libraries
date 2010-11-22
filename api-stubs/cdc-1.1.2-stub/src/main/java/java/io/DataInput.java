package java.io;

public interface DataInput {
    /**
     * @throws IOException
     * @throws EOFException
     */
	boolean readBoolean() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    byte readByte() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    char readChar() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    double readDouble() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    float readFloat() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    void readFully(byte[] b) throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    void readFully(byte[] b, int off, int len) throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    int readInt() throws IOException;

    /**
     * @throws IOException
     */
    String readLine() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    long readLong() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    short readShort() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    int readUnsignedByte() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     */
    int readUnsignedShort() throws IOException;

    /**
     * @throws IOException
     */
    String readUTF() throws IOException;

    /**
     * @throws IOException
     * @throws EOFException
     * @throws UTFDataFormatException
     */
    int skipBytes(int n) throws IOException;

}
