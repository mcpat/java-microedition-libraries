package java.io;

public class FileReader extends InputStreamReader {
	/**
	 * @throws FileNotFoundException
	 */
    public FileReader(String fileName) throws FileNotFoundException {super(null);}

    /**
     * @throws FileNotFoundException
     */
    public FileReader(File file) throws FileNotFoundException {super(null);}
    public FileReader(FileDescriptor fd) {super(null);}

}
