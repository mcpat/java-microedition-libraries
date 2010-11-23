package java.net;

public class InetSocketAddress extends SocketAddress {
	/**
	 * @throws IllegalArgumentException
	 */
    public InetSocketAddress(int port) {}

    /**
     * @throws IllegalArgumentException
     */
    public InetSocketAddress(InetAddress addr, int port) {}

    /**
     * @throws IllegalArgumentException
     */
    public InetSocketAddress(String hostname, int port) {}

    public final boolean equals(Object obj) {
        return false;
    }

    public final InetAddress getAddress() {
        return null;
    }

    public final String getHostName() {
        return null;
    }

    public final int getPort() {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isUnresolved() {
        return false;
    }

    public String toString() {
        return null;
    }

}
