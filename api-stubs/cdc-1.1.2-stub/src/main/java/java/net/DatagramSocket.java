package java.net;

import java.io.IOException;

public class DatagramSocket {
	/**
	 * @throws IOException 
	 * @throws SocketException 
	 * @throws SecurityException
	 */
    public static void setDatagramSocketImplFactory(DatagramSocketImplFactory fac) throws IOException {}

    /**
     * @throws SecurityException
     * @throws SocketException
     */
    public DatagramSocket() throws SocketException {}
    protected DatagramSocket(DatagramSocketImpl impl) {}
    
    /**
     * @throws SecurityException
     * @throws SocketException
     */
    public DatagramSocket(SocketAddress bindaddr) throws SocketException {}

    /**
     * @throws SecurityException
     * @throws SocketException
     */
    public DatagramSocket(int port) throws SocketException {}
   
    /**
     * @throws SecurityException
     * @throws SocketException
     */
    public DatagramSocket(int port, InetAddress laddr) throws SocketException {}

    /**
     * @throws SocketException 
     * @throws SecurityException 
     * @throws IllegalArgumentException
     */
    public void bind(SocketAddress addr) throws SocketException {}

    public void close() {}

    /**
     * @throws IllegalArgumentException 
     * @throws SecurityException
     */
    public void connect(InetAddress address, int port) {}

    /**
     * @throws SocketException 
     * @throws IllegalArgumentException
     */
    public void connect(SocketAddress addr) throws SocketException {}

    public void disconnect() {}

    /**
     * @throws SocketException
     */
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

    /**
     * @throws SocketException
     */
    public int getReceiveBufferSize() throws SocketException {
        return 0;
    }

    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    /**
     * @throws SocketException
     */
    public boolean getReuseAddress() throws SocketException {
        return false;
    }

    /**
     * @throws SocketException
     */
    public int getSendBufferSize() throws SocketException {
        return 0;
    }

    /**
     * @throws SocketException
     */
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

    /**
     * @throws IOException 
     * @throws SocketTimeoutException 
     * @throws PortUnreachableException
     */
    public void receive(DatagramPacket p) throws IOException {}

    /**
     * @throws IOException 
     * @throws SecurityException 
     * @throws PortUnreachableException
     */
    public void send(DatagramPacket p) throws IOException {}

    /**
     * @throws SocketException
     */
    public void setBroadcast(boolean on) throws SocketException {}

    /**
     * @throws SocketException
     * @throws IllegalArgumentException
     */
    public void setReceiveBufferSize(int size) throws SocketException {}

    /**
     * @throws SocketException
     */
    public void setReuseAddress(boolean on) throws SocketException {}

    /**
     * @throws SocketException
     * @throws IllegalArgumentException
     */
    public void setSendBufferSize(int size) throws SocketException {}

    /**
     * @throws SocketException
     */
    public void setSoTimeout(int size) throws SocketException {}

    /**
     * @throws SocketException
     */
    public void setTrafficClass(int tc) throws SocketException {}

}
