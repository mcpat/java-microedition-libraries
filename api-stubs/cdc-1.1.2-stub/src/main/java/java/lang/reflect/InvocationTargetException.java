package java.lang.reflect;

public class InvocationTargetException extends Exception {
    protected InvocationTargetException() {}
    public InvocationTargetException(Throwable target) {}
    public InvocationTargetException(Throwable target, String s) {}

    public Throwable getCause() {
        return null;
    }

    public Throwable getTargetException() {
        return null;
    }

}
