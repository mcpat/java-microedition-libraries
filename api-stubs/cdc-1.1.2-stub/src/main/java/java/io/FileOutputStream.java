package java.io;

public class FileOutputStream extends OutputStream {
    public FileOutputStream(String arg0) throws FileNotFoundException {}
    public FileOutputStream(String arg0, boolean arg1) throws FileNotFoundException {}
    public FileOutputStream(File arg0) throws FileNotFoundException {}
    public FileOutputStream(File arg0, boolean arg1) throws FileNotFoundException {}
    public FileOutputStream(FileDescriptor arg0) {}

    public void close() throws IOException {}

    protected void finalize() throws IOException {}

    public final FileDescriptor getFD() throws IOException {
        return null;
    }

    public void write(int arg0) throws IOException {}

    public void write(byte[] arg0) throws IOException {}

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {}

}
