package java.io;

public class FileOutputStream extends OutputStream {
	/**
	 * @throws FileNotFoundException
	 * @throws SecurityException
	 */
    public FileOutputStream(String name) throws FileNotFoundException {}
    
    /**
     * @throws FileNotFoundException
     * @throws SecurityException
     */
    public FileOutputStream(String name, boolean append) throws FileNotFoundException {}

    /**
     * @throws FileNotFoundException
     * @throws SecurityException
     */
    public FileOutputStream(File file) throws FileNotFoundException {}
    
    /**
     * @throws FileNotFoundException
     * @throws SecurityException
     */
    public FileOutputStream(File file, boolean append) throws FileNotFoundException {}

    /**
     * @throws SecurityException
     */
    public FileOutputStream(FileDescriptor fdObj) {}

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
    public void write(int b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b, int off, int len) throws IOException {}

}
