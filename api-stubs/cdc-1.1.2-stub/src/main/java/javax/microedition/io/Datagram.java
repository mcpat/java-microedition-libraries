package javax.microedition.io;

public interface Datagram extends DataInput, DataOutput {
    String getAddress();

    byte[] getData();

    int getLength();

    int getOffset();

    void reset();

    void setAddress(String arg0) throws IOException;

    void setAddress(Datagram arg0);

    void setData(byte[] arg0, int arg1, int arg2);

    void setLength(int arg0);

}
