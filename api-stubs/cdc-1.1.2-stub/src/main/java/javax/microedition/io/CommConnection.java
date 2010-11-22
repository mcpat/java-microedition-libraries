package javax.microedition.io;

/**
 * @since MIDP 2.0
 */
public interface CommConnection extends StreamConnection {
    int getBaudrate();
    
    int setBaudrate(int baudrate);
}
