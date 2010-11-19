package java.net;

public class DatagramSocket {
    public static void setDatagramSocketImplFactory(DatagramSocketImplFactory arg0) throws IOException {}


    public DatagramSocket() throws SocketException {}
    protected DatagramSocket(DatagramSocketImpl arg0) {}
    public DatagramSocket(SocketAddress arg0) throws SocketException {}
    public DatagramSocket(int arg0) throws SocketException {}
    public DatagramSocket(int arg0, InetAddress arg1) throws SocketException {}

    public void bind(SocketAddress arg0) throws SocketException {}

    public void close() {}

    public void connect(InetAddress arg0, int arg1) {}

    public void connect(SocketAddress arg0) throws SocketException {}

    public void disconnect() {}

    public boolean getBroadcast() throws SocketException {
        return false;
    }

    public InetAddress getInetAddress() {
        return null;
    }

    public InetAddress getLocalAddress() {
        return null;
    }

    public int getLocalPort() {
        return 0;
    }

    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    public int getPort() {
        return 0;
    }

    public int getReceiveBufferSize() throws SocketException {
        return 0;
    }

    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    public boolean getReuseAddress() throws SocketException {
        return false;
    }

    public int getSendBufferSize() throws SocketException {
        return 0;
    }

    public int getSoTimeout() throws SocketException {
        return 0;
    }

    public int getTrafficClass() throws SocketException {
        return 0;
    }

    public boolean isBound() {
        return false;
    }

    public boolean isClosed() {
        return false;
    }

    public boolean isConnected() {
        return false;
    }

    public void receive(DatagramPacket arg0) throws IOException {}

    public void send(DatagramPacket arg0) throws IOException {}

    public void setBroadcast(boolean arg0) throws SocketException {}

    public void setReceiveBufferSize(int arg0) throws SocketException {}

    public void setReuseAddress(boolean arg0) throws SocketException {}

    public void setSendBufferSize(int arg0) throws SocketException {}

    public void setSoTimeout(int arg0) throws SocketException {}

    public void setTrafficClass(int arg0) throws SocketException {}

}
