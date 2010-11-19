package java.net;

public abstract class JarURLConnection extends URLConnection {
    protected URLConnection jarFileURLConnection;

    protected JarURLConnection(URL arg0) throws MalformedURLException {}

    public Attributes getAttributes() throws IOException {
        return null;
    }

    public Certificate[] getCertificates() throws IOException {
        return null;
    }

    public String getEntryName() {
        return null;
    }

    public JarEntry getJarEntry() throws IOException {
        return null;
    }

    public abstract JarFile getJarFile() throws IOException;

    public URL getJarFileURL() {
        return null;
    }

    public Attributes getMainAttributes() throws IOException {
        return null;
    }

    public Manifest getManifest() throws IOException {
        return null;
    }

}
