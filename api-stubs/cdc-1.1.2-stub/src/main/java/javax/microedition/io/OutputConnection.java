package javax.microedition.io;

public interface OutputConnection extends Connection {
    DataOutputStream openDataOutputStream() throws IOException;

    OutputStream openOutputStream() throws IOException;

}
