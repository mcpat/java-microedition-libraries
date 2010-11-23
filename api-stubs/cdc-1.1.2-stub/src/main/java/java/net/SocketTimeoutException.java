package java.net;

import java.io.InterruptedIOException;

public class SocketTimeoutException extends InterruptedIOException {
    public SocketTimeoutException(String msg) {}
    public SocketTimeoutException() {}

}
