package java.net;

public interface SocketOptions {
    int IP_MULTICAST_IF;
    int IP_MULTICAST_IF2;
    int IP_MULTICAST_LOOP;
    int IP_TOS;
    int SO_BINDADDR;
    int SO_BROADCAST;
    int SO_KEEPALIVE;
    int SO_LINGER;
    int SO_OOBINLINE;
    int SO_RCVBUF;
    int SO_REUSEADDR;
    int SO_SNDBUF;
    int SO_TIMEOUT;
    int TCP_NODELAY;

    Object getOption(int arg0) throws SocketException;

    void setOption(int arg0, Object arg1) throws SocketException;

}
