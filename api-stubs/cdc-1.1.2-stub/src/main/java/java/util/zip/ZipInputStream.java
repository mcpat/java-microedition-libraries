package java.util.zip;

public class ZipInputStream extends InflaterInputStream implements ZipConstants {
    public ZipInputStream(InputStream arg0) {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public void closeEntry() throws IOException {}

    protected ZipEntry createZipEntry(String arg0) {
        return null;
    }

    public ZipEntry getNextEntry() throws IOException {
        return null;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public long skip(long arg0) throws IOException {
        return 0;
    }

}
