package java.lang.reflect;

public class UndeclaredThrowableException extends RuntimeException {
    public UndeclaredThrowableException(Throwable arg0) {}
    public UndeclaredThrowableException(Throwable arg0, String arg1) {}

    public Throwable getCause() {
        return null;
    }

    public Throwable getUndeclaredThrowable() {
        return null;
    }

}
