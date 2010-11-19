package java.util.zip;

public class InflaterInputStream extends FilterInputStream {
    protected byte[] buf;
    protected Inflater inf;
    protected int len;

    public InflaterInputStream(InputStream arg0, Inflater arg1, int arg2) {}
    public InflaterInputStream(InputStream arg0, Inflater arg1) {}
    public InflaterInputStream(InputStream arg0) {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    protected void fill() throws IOException {}

    public int read() throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public long skip(long arg0) throws IOException {
        return 0;
    }

}
