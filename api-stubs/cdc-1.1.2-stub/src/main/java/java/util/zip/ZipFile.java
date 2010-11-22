package java.util.zip;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

public class ZipFile implements ZipConstants {
    public final static int OPEN_DELETE= 4;
    public final static int OPEN_READ= 1;

    /**
     * @throws ZipException
     * @throws IOException
     * @throws SecurityException
     */
    public ZipFile(String name) throws IOException {}
    
    /**
     * @throws ZipException
     * @throws IOException
     * @throws SecurityException
     * @throws IllegalArgumentException
     */
    public ZipFile(File file, int mode) throws IOException {}
    
    /**
     * @throws ZipException
     * @throws IOException
     */
    public ZipFile(File file) throws ZipException, IOException {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IllegalStateException
     */
    public Enumeration entries() {
        return null;
    }

    /**
     * @throws IOException
     */
    protected void finalize() throws IOException {}

    /**
     * @throws IllegalStateException
     */
    public ZipEntry getEntry(String name) {
        return null;
    }

    /**
     * @throws ZipException
     * @throws IOException
     * @throws IllegalStateException
     */
    public InputStream getInputStream(ZipEntry entry) throws IOException {
        return null;
    }

    public String getName() {
        return null;
    }

    /**
     * @throws IllegalStateException
     */
    public int size() {
        return 0;
    }

}
