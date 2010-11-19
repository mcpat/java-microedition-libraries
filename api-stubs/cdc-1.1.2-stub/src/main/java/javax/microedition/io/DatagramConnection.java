package javax.microedition.io;

public interface DatagramConnection extends Connection {
    int getMaximumLength() throws IOException;

    int getNominalLength() throws IOException;

    Datagram newDatagram(int arg0) throws IOException;

    Datagram newDatagram(int arg0, String arg1) throws IOException;

    Datagram newDatagram(byte[] arg0, int arg1) throws IOException;

    Datagram newDatagram(byte[] arg0, int arg1, String arg2) throws IOException;

    void receive(Datagram arg0) throws IOException;

    void send(Datagram arg0) throws IOException;

}
