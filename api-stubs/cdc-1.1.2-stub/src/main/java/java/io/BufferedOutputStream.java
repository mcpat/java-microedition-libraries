package java.io;

public class BufferedOutputStream extends FilterOutputStream {
    protected byte[] buf;
    protected int count;

    public BufferedOutputStream(OutputStream arg0) {}
    public BufferedOutputStream(OutputStream arg0, int arg1) {}

    public void flush() throws IOException {}

    public void write(int arg0) throws IOException {}

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {}

}
