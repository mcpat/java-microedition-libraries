package java.io;

public interface ObjectInput extends DataInput {
	/**
	 * @throws IOException
	 */
    int available() throws IOException;

    /**
     * @throws IOException
     */
    void close() throws IOException;

    /**
     * @throws IOException
     */
    int read() throws IOException;

    /**
     * @throws IOException
     */
    int read(byte[] b) throws IOException;

    /**
     * @throws IOException
     */
    int read(byte[] b, int off, int len) throws IOException;

    /**
     * @throws ClassNotFoundException
     * @throws IOException
     */
    Object readObject() throws ClassNotFoundException, IOException;

    /**
     * @throws IOException
     */
    long skip(long n) throws IOException;

}
