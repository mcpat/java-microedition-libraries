package java.io;

/**
 * @since CLDC 1.0
 */
public interface DataInput {
    /**
     * @throws EOFException
     * @throws IOException
     */
    boolean readBoolean() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    byte readByte() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    char readChar() throws IOException;
    
    /**
     * @since CLDC 1.1
     * 
     * @throws EOFException
     * @throws IOException
     */
    double readDouble() throws IOException;
    
    /**
     * @since CLDC 1.1
     * 
     * @throws EOFException
     * @throws IOException
     */
    float readFloat() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    void readFully(byte[] b) throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    void readFully(byte[] b, int off, int len) throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    int readInt() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    long readLong() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    short readShort() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    int readUnsignedByte() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    int readUnsignedShort() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     * @throws UTFDataFormatException
     */
    String readUTF() throws IOException;
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    int skipBytes(int n) throws IOException;
}
