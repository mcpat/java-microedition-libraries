package java.io;

public interface ObjectOutput extends DataOutput {
    void close() throws IOException;

    void flush() throws IOException;

    void write(int arg0) throws IOException;

    void write(byte[] arg0) throws IOException;

    void write(byte[] arg0, int arg1, int arg2) throws IOException;

    void writeObject(Object arg0) throws IOException;

}
