package java.util.jar;

public class JarEntry extends ZipEntry {
    public JarEntry(String arg0) {}
    public JarEntry(ZipEntry arg0) {}
    public JarEntry(JarEntry arg0) {}

    public Attributes getAttributes() throws IOException {
        return null;
    }

    public Certificate[] getCertificates() {
        return null;
    }

}
