package java.io;

public abstract class Writer {
    protected Object lock;

    protected Writer() {}
    protected Writer(Object arg0) {}

    public abstract void close() throws IOException;

    public abstract void flush() throws IOException;

    public void write(int arg0) throws IOException {}

    public void write(char[] arg0) throws IOException {}

    public abstract void write(char[] arg0, int arg1, int arg2) throws IOException;

    public void write(String arg0) throws IOException {}

    public void write(String arg0, int arg1, int arg2) throws IOException {}

}
