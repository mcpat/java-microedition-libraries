package java.security;

public class PrivilegedActionException extends Exception {
    public PrivilegedActionException(Exception exception) {}

    public Throwable getCause() {
        return null;
    }

    public Exception getException() {
        return null;
    }

    public String toString() {
        return null;
    }

}
