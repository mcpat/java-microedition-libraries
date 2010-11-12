package java.io;

/**
 * @since CLDC 1.0
 */
public class InterruptedIOException extends IOException {
    public int bytesTransferred;

    public InterruptedIOException() {}
    public InterruptedIOException(String s) {}
}
