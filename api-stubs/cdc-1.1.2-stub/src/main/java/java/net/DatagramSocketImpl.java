package java.net;

public abstract class DatagramSocketImpl implements SocketOptions {
    protected FileDescriptor fd;
    protected int localPort;

    public DatagramSocketImpl() {}

    protected abstract void bind(int arg0, InetAddress arg1) throws SocketException;

    protected abstract void close();

    protected void connect(InetAddress arg0, int arg1) throws SocketException {}

    protected abstract void create() throws SocketException;

    protected void disconnect() {}

    protected FileDescriptor getFileDescriptor() {
        return null;
    }

    protected int getLocalPort() {
        return 0;
    }

    protected abstract int getTimeToLive() throws IOException;

    protected abstract void join(InetAddress arg0) throws IOException;

    protected abstract void joinGroup(SocketAddress arg0, NetworkInterface arg1) throws IOException;

    protected abstract void leave(InetAddress arg0) throws IOException;

    protected abstract void leaveGroup(SocketAddress arg0, NetworkInterface arg1) throws IOException;

    protected abstract int peek(InetAddress arg0) throws IOException;

    protected abstract int peekData(DatagramPacket arg0) throws IOException;

    protected abstract void receive(DatagramPacket arg0) throws IOException;

    protected abstract void send(DatagramPacket arg0) throws IOException;

    protected abstract void setTimeToLive(int arg0) throws IOException;

}
