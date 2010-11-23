package java.net;

import java.io.FileDescriptor;
import java.io.IOException;

public abstract class DatagramSocketImpl implements SocketOptions {
    protected FileDescriptor fd;
    protected int localPort;

    public DatagramSocketImpl() {}

    /**
     * @throws SocketException
     */
    protected abstract void bind(int lport, InetAddress laddr) throws SocketException;

    protected abstract void close();

    /**
     * @throws SocketException
     */
    protected void connect(InetAddress address, int port) throws SocketException {}

    /**
     * @throws SocketException
     */
    protected abstract void create() throws SocketException;

    protected void disconnect() {}

    protected FileDescriptor getFileDescriptor() {
        return null;
    }

    protected int getLocalPort() {
        return 0;
    }

    /**
     * @throws IOException
     */
    protected abstract int getTimeToLive() throws IOException;

    /**
     * @throws IOException
     */
    protected abstract void join(InetAddress inetaddr) throws IOException;

    /**
     * @throws IOException
     */
    protected abstract void joinGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException;

    /**
     * @throws IOException
     */
    protected abstract void leave(InetAddress inetaddr) throws IOException;

    /**
     * @throws IOException
     */
    protected abstract void leaveGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException;

    /**
     * @throws IOException 
     * @throws PortUnreachableException
     */
    protected abstract int peek(InetAddress i) throws IOException;

    /**
     * @throws IOException 
     * @throws PortUnreachableException
     */
    protected abstract int peekData(DatagramPacket p) throws IOException;

    /**
     * @throws IOException 
     * @throws PortUnreachableException
     */
    protected abstract void receive(DatagramPacket p) throws IOException;

    /**
     * @throws IOException
     * @throws PortUnreachableException
     */
    protected abstract void send(DatagramPacket p) throws IOException;

    /**
     * @throws IOException
     */
    protected abstract void setTimeToLive(int ttl) throws IOException;

}
