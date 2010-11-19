package java.io;

public interface ObjectInput extends DataInput {
    int available() throws IOException;

    void close() throws IOException;

    int read() throws IOException;

    int read(byte[] arg0) throws IOException;

    int read(byte[] arg0, int arg1, int arg2) throws IOException;

    Object readObject() throws ClassNotFoundException, IOException;

    long skip(long arg0) throws IOException;

}
