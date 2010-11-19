package java.io;

public class FileInputStream extends InputStream {
    public FileInputStream(String arg0) throws FileNotFoundException {}
    public FileInputStream(File arg0) throws FileNotFoundException {}
    public FileInputStream(FileDescriptor arg0) {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    protected void finalize() throws IOException {}

    public final FileDescriptor getFD() throws IOException {
        return null;
    }

    public int read() throws IOException {
        return 0;
    }

    public int read(byte[] arg0) throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public long skip(long arg0) throws IOException {
        return 0;
    }

}
