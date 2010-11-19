package java.util.jar;

public class JarInputStream extends ZipInputStream {
    public JarInputStream(InputStream arg0) throws IOException {}
    public JarInputStream(InputStream arg0, boolean arg1) throws IOException {}

    protected ZipEntry createZipEntry(String arg0) {
        return null;
    }

    public Manifest getManifest() {
        return null;
    }

    public ZipEntry getNextEntry() throws IOException {
        return null;
    }

    public JarEntry getNextJarEntry() throws IOException {
        return null;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

}
