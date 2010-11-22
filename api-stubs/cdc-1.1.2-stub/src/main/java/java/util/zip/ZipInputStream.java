package java.util.zip;

import java.io.IOException;
import java.io.InputStream;

public class ZipInputStream extends InflaterInputStream implements ZipConstants {
    public ZipInputStream(InputStream in) {
        super(in);
    }

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
     * @throws ZipException
     * @throws IOException
     */
    public void closeEntry() throws IOException {}

    protected ZipEntry createZipEntry(String name) {
        return null;
    }

    /**
     * @throws ZipException
     * @throws IOException
     */
    public ZipEntry getNextEntry() throws IOException {
        return null;
    }

    /**
     * @throws ZipException
     * @throws IOException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws ZipException
     * @throws IOException
     * @throws IllegalArgumentException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
