package java.io;

public class ByteArrayInputStream extends InputStream {
    protected byte[] buf;
    protected int count;
    protected int mark;
    protected int pos;

    public ByteArrayInputStream(byte[] arg0) {}
    public ByteArrayInputStream(byte[] arg0, int arg1, int arg2) {}

    public int available() {
        return 0;
    }

    public void close() throws IOException {}

    public void mark(int arg0) {}

    public boolean markSupported() {
        return false;
    }

    public int read() {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) {
        return 0;
    }

    public void reset() {}

    public long skip(long arg0) {
        return 0;
    }

}
