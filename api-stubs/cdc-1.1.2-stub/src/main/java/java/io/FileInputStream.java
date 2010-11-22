package java.io;

public class FileInputStream extends InputStream {
	/**
	 * @throws FileNotFoundException
	 * @throws SecurityException
	 */
	public FileInputStream(String name) throws FileNotFoundException {}

	/**
	 * @throws FileNotFoundException
	 * @throws SecurityException
	 */
    public FileInputStream(File file) throws FileNotFoundException {}
    
    /**
     * @throws SecurityException
     */
    public FileInputStream(FileDescriptor fdObj) {}

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

    /**
     * @throws IOException
     */
    protected void finalize() throws IOException {}

    /**
     * @throws IOException
     */
    public final FileDescriptor getFD() throws IOException {
        return null;
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
    public int read(byte[] b) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
