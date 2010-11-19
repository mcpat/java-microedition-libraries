package javax.microedition.io;

public interface UDPDatagramConnection extends DatagramConnection {
    String getLocalAddress() throws IOException;

    int getLocalPort() throws IOException;

}
