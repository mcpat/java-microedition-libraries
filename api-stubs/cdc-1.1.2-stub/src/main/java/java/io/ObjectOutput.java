package java.io;

public interface ObjectOutput extends DataOutput {
	/**
	 * @throws IOException
	 */
	void close() throws IOException;

	/**
	 * @throws IOException
	 */
    void flush() throws IOException;

    /**
     * @throws IOException
     */
    void write(int b) throws IOException;

    /**
     * @throws IOException
     */
    void write(byte[] b) throws IOException;

    /**
     * @throws IOException
     */
    void write(byte[] b, int off, int len) throws IOException;

    /**
     * @throws IOException
     */
    void writeObject(Object obj) throws IOException;

}
