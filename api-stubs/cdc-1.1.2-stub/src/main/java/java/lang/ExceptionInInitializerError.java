package java.lang;

public class ExceptionInInitializerError extends LinkageError {
    public ExceptionInInitializerError() {}
    public ExceptionInInitializerError(Throwable thrown) {}
    public ExceptionInInitializerError(String s) {}

    public Throwable getCause() {
        return null;
    }

    public Throwable getException() {
        return null;
    }

}
