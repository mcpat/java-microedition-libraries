package java.io;

public class PushbackInputStream extends FilterInputStream {
    protected byte[] buf;
    protected int pos;

    public PushbackInputStream(InputStream arg0, int arg1) {}
    public PushbackInputStream(InputStream arg0) {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public long skip(long arg0) throws IOException {
        return 0;
    }

    public void unread(int arg0) throws IOException {}

    public void unread(byte[] arg0, int arg1, int arg2) throws IOException {}

    public void unread(byte[] arg0) throws IOException {}

}
