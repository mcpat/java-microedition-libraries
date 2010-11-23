package java.net;

import java.io.Serializable;

public class InetAddress implements Serializable {
	/**
	 * @throws UnknownHostException
	 * @throws SecurityException
	 */
    public static InetAddress[] getAllByName(String host) throws UnknownHostException {
        return null;
    }

    /**
     * @throws UnknownHostException
     */
    public static InetAddress getByAddress(String host, byte[] addr) throws UnknownHostException {
        return null;
    }

    /**
     * @throws UnknownHostException
     */
    public static InetAddress getByAddress(byte[] addr) throws UnknownHostException {
        return null;
    }

    /**
     * @throws UnknownHostException
     * @throws SecurityException
     */
    public static InetAddress getByName(String host) throws UnknownHostException {
        return null;
    }

    /**
     * @throws UnknownHostException
     */
    public static InetAddress getLocalHost() throws UnknownHostException {
        return null;
    }


    InetAddress() {}

    public boolean equals(Object obj) {
        return false;
    }

    public byte[] getAddress() {
        return null;
    }

    public String getCanonicalHostName() {
        return null;
    }

    public String getHostAddress() {
        return null;
    }

    public String getHostName() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isAnyLocalAddress() {
        return false;
    }

    public boolean isLinkLocalAddress() {
        return false;
    }

    public boolean isLoopbackAddress() {
        return false;
    }

    public boolean isMCGlobal() {
        return false;
    }

    public boolean isMCLinkLocal() {
        return false;
    }

    public boolean isMCNodeLocal() {
        return false;
    }

    public boolean isMCOrgLocal() {
        return false;
    }

    public boolean isMCSiteLocal() {
        return false;
    }

    public boolean isMulticastAddress() {
        return false;
    }

    public boolean isSiteLocalAddress() {
        return false;
    }

    public String toString() {
        return null;
    }

}
