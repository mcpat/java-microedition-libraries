package java.io;

public class FileReader extends InputStreamReader {
	/**
	 * @throws FileNotFoundException
	 */
    public FileReader(String fileName) throws FileNotFoundException {}

    /**
     * @throws FileNotFoundException
     */
    public FileReader(File file) throws FileNotFoundException {}
    public FileReader(FileDescriptor fd) {}

}
