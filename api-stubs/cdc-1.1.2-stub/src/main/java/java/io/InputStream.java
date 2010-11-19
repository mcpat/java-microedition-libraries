package java.io;

public abstract class InputStream {
    public InputStream() {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public void mark(int arg0) {}

    public boolean markSupported() {
        return false;
    }

    public abstract int read() throws IOException;

    public int read(byte[] arg0) throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public void reset() throws IOException {}

    public long skip(long arg0) throws IOException {
        return 0;
    }

}
