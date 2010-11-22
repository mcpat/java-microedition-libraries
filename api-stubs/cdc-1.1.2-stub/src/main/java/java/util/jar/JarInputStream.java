package java.util.jar;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;

public class JarInputStream extends ZipInputStream {
    /**
     * @throws IOException
     */
    public JarInputStream(InputStream in) throws IOException {
        super(in);
    }
    
    /**
     * @throws IOException
     */
    public JarInputStream(InputStream in, boolean verify) throws IOException {
        super(in);
    }

    protected ZipEntry createZipEntry(String name) {
        return null;
    }

    public Manifest getManifest() {
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
    public JarEntry getNextJarEntry() throws IOException {
        return null;
    }

    /**
     * @throws ZipException
     * @throws IOException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

}
