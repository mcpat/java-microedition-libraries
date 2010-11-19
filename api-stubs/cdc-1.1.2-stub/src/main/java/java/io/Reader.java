package java.io;

public abstract class Reader {
    protected Object lock;

    protected Reader() {}
    protected Reader(Object arg0) {}

    public abstract void close() throws IOException;

    public void mark(int arg0) throws IOException {}

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        return 0;
    }

    public int read(char[] arg0) throws IOException {
        return 0;
    }

    public abstract int read(char[] arg0, int arg1, int arg2) throws IOException;

    public boolean ready() throws IOException {
        return false;
    }

    public void reset() throws IOException {}

    public long skip(long arg0) throws IOException {
        return 0;
    }

}
