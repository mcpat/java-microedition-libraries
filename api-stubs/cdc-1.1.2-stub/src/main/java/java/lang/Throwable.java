package java.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Throwable implements Serializable {
    public Throwable() {}
    public Throwable(String message) {}
    public Throwable(String message, Throwable cause) {}
    public Throwable(Throwable cause) {}

    public Throwable fillInStackTrace() {
        return null;
    }

    public Throwable getCause() {
        return null;
    }

    public String getLocalizedMessage() {
        return null;
    }

    public String getMessage() {
        return null;
    }

    public StackTraceElement[] getStackTrace() {
        return null;
    }

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public Throwable initCause(Throwable cause) {
        return null;
    }

    public void printStackTrace() {}

    public void printStackTrace(PrintStream s) {}

    public void printStackTrace(PrintWriter s) {}

    /**
     * @throws NullPointerException
     */
    public void setStackTrace(StackTraceElement[] stackTrace) {}

    public String toString() {
        return null;
    }

}
