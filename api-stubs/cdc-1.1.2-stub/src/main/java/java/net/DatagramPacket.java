package java.net;

public final class DatagramPacket {
    public DatagramPacket(byte[] buf, int offset, int length) {}
    public DatagramPacket(byte[] buf, int length) {}
    public DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port) {}
    
    /**
     * @throws IllegalArgumentException
     * @throws SocketException
     */
    public DatagramPacket(byte[] buf, int offset, int length, SocketAddress address) throws SocketException {}
    public DatagramPacket(byte[] buf, int length, InetAddress address, int port) {}
    
    /**
     * @throws IllegalArgumentException
     * @throws SocketException
     */
    public DatagramPacket(byte[] buf, int length, SocketAddress address) throws SocketException {}

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

    public void setAddress(InetAddress iaddr) {}

    /**
     * @throws NullPointerException
     */
    public void setData(byte[] buf, int offset, int length) {}

    /**
     * @throws NullPointerException
     */
    public void setData(byte[] buf) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setLength(int length) {}

    public void setPort(int iport) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setSocketAddress(SocketAddress address) {}

}
