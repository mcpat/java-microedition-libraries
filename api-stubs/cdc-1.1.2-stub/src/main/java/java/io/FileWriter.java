package java.io;

public class FileWriter extends OutputStreamWriter {
	/**
	 * @throws IOException
	 */
    public FileWriter(String fileName) throws IOException {super(null);}
    
    /**
     * @throws IOException
     */
    public FileWriter(String fileName, boolean append) throws IOException {super(null);}

    /**
     * @throws IOException
     */
    public FileWriter(File file) throws IOException {super(null);}

    /**
     * @throws IOException
     */
    public FileWriter(File file, boolean append) throws IOException {super(null);}
    public FileWriter(FileDescriptor fd) {super(null);}

}
