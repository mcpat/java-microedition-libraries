package java.io;

public abstract class OutputStream {
    public OutputStream() {}

    public void close() throws IOException {}

    public void flush() throws IOException {}

    public abstract void write(int arg0) throws IOException;

    public void write(byte[] arg0) throws IOException {}

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {}

}
