package java.io;

public class WriteAbortedException extends ObjectStreamException {
    public Exception detail;

    public WriteAbortedException(String s, Exception ex) {}

    public Throwable getCause() {
        return null;
    }

    public String getMessage() {
        return null;
    }

}
