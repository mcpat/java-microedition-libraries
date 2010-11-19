package java.net;

public final class DatagramPacket {
    public DatagramPacket(byte[] arg0, int arg1, int arg2) {}
    public DatagramPacket(byte[] arg0, int arg1) {}
    public DatagramPacket(byte[] arg0, int arg1, int arg2, InetAddress arg3, int arg4) {}
    public DatagramPacket(byte[] arg0, int arg1, int arg2, SocketAddress arg3) throws SocketException {}
    public DatagramPacket(byte[] arg0, int arg1, InetAddress arg2, int arg3) {}
    public DatagramPacket(byte[] arg0, int arg1, SocketAddress arg2) throws SocketException {}

    public InetAddress getAddress() {
        return null;
    }

    public byte[] getData() {
        return null;
    }

    public int getLength() {
        return 0;
    }

    public int getOffset() {
        return 0;
    }

    public int getPort() {
        return 0;
    }

    public SocketAddress getSocketAddress() {
        return null;
    }

    public void setAddress(InetAddress arg0) {}

    public void setData(byte[] arg0, int arg1, int arg2) {}

    public void setData(byte[] arg0) {}

    public void setLength(int arg0) {}

    public void setPort(int arg0) {}

    public void setSocketAddress(SocketAddress arg0) {}

}
