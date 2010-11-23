package java.lang.reflect;

public class UndeclaredThrowableException extends RuntimeException {
    public UndeclaredThrowableException(Throwable undeclaredThrowable) {}
    public UndeclaredThrowableException(Throwable undeclaredThrowable, String s) {}

    public Throwable getCause() {
        return null;
    }

    public Throwable getUndeclaredThrowable() {
        return null;
    }

}
