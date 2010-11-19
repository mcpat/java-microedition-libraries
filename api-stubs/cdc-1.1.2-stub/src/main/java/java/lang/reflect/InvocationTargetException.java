package java.lang.reflect;

public class InvocationTargetException extends Exception {
    protected InvocationTargetException() {}
    public InvocationTargetException(Throwable arg0) {}
    public InvocationTargetException(Throwable arg0, String arg1) {}

    public Throwable getCause() {
        return null;
    }

    public Throwable getTargetException() {
        return null;
    }

}
