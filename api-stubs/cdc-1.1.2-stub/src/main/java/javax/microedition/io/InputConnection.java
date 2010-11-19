package javax.microedition.io;

public interface InputConnection extends Connection {
    DataInputStream openDataInputStream() throws IOException;

    InputStream openInputStream() throws IOException;

}
