package java.util.jar;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class JarFile extends ZipFile {
    public final static String MANIFEST_NAME= "META-INF/MANIFEST.MF";

    /**
     * @throws IOException
     * @throws SecurityException
     */
    public JarFile(String name) throws IOException {
        super(name);
    }
    
    /**
     * @throws IOException
     * @throws SecurityException
     */
    public JarFile(String name, boolean verify) throws IOException {
        super(name);
    }
    
    /**
     * @throws IOException
     * @throws SecurityException
     */
    public JarFile(File file) throws IOException {
        super(file);
    }
    
    /**
     * @throws IOException
     * @throws SecurityException
     */
    public JarFile(File file, boolean verify) throws IOException {
        super(file);
    }
    
    /**
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws SecurityException
     */
    public JarFile(File file, boolean verify, int mode) throws IOException {
        super(file);
    }

    public Enumeration entries() {
        return null;
    }

    public ZipEntry getEntry(String name) {
        return null;
    }

    /**
     * @throws ZipException
     * @throws IOException
     */
    public InputStream getInputStream(ZipEntry ze) throws IOException {
        return null;
    }

    public JarEntry getJarEntry(String name) {
        return null;
    }

    /**
     * @throws IOException
     */
    public Manifest getManifest() throws IOException {
        return null;
    }

}
