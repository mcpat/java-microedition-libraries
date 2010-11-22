package java.util.jar;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.zip.ZipEntry;

public class JarEntry extends ZipEntry {
    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public JarEntry(String name) {
        super(name);
    }
    
    public JarEntry(ZipEntry ze) {
        super(ze);
    }
    
    public JarEntry(JarEntry je) {
        super(je);
    }

    /**
     * @throws IOException
     */
    public Attributes getAttributes() throws IOException {
        return null;
    }

    public Certificate[] getCertificates() {
        return null;
    }

}
