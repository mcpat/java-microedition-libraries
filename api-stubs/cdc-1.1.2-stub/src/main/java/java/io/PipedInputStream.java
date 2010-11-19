package java.io;

public class PipedInputStream extends InputStream {
    protected final static int PIPE_SIZE;

    protected byte[] buffer;
    protected int in;
    protected int out;

    public PipedInputStream(PipedOutputStream arg0) throws IOException {}
    public PipedInputStream() {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public void connect(PipedOutputStream arg0) throws IOException {}

    public int read() throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    protected void receive(int arg0) throws IOException {}

}
