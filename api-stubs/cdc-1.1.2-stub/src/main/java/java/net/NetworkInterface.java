package java.net;

import java.util.Enumeration;

public final class NetworkInterface {
	
	/**
	 * @throws SocketException
	 * @throws NullPointerException
	 */
    public static NetworkInterface getByInetAddress(InetAddress addr) throws SocketException {
        return null;
    }

    /**
     * @throws SocketException
     * @throws NullPointerException
     */
    public static NetworkInterface getByName(String name) throws SocketException {
        return null;
    }

    /**
     * @throws SocketException
     */
    public static Enumeration getNetworkInterfaces() throws SocketException {
        return null;
    }


    NetworkInterface() {}
    NetworkInterface(String arg0, int arg1, InetAddress[] arg2) {}

    public boolean equals(Object obj) {
        return false;
    }

    public String getDisplayName() {
        return null;
    }

    public Enumeration getInetAddresses() {
        return null;
    }

    public String getName() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

}
