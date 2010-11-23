package java.net;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public abstract class JarURLConnection extends URLConnection {
    protected URLConnection jarFileURLConnection;

    /**
     * @throws MalformedURLException
     */
    protected JarURLConnection(URL url) throws MalformedURLException {super(null);}

    /**
     * @throws IOException
     */
    public Attributes getAttributes() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public Certificate[] getCertificates() throws IOException {
        return null;
    }

    public String getEntryName() {
        return null;
    }

    /**
     * @throws IOException
     */
    public JarEntry getJarEntry() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public abstract JarFile getJarFile() throws IOException;

    public URL getJarFileURL() {
        return null;
    }

    /**
     * @throws IOException
     */
    public Attributes getMainAttributes() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public Manifest getManifest() throws IOException {
        return null;
    }

}
