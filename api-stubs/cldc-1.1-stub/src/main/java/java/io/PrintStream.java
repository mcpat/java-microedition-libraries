package java.io;

/**
 * @since CLDC 1.0
 */
public class PrintStream extends OutputStream {
    public PrintStream(OutputStream out) {}

    public boolean checkError() {
        return false;
    }

    public void close() {}

    public void flush() {}

    public void print(boolean b) {}

    public void print(char c) {}

    public void print(int i) {}

    public void print(long l) {}

    /**
     * @since CLDC 1.1
     */
    public void print(float f) {}

    /**
     * @since CLDC 1.1
     */
    public void print(double d) {}

    public void print(char[] s) {}

    public void print(String s) {}

    public void print(Object o) {}

    public void println() {}

    public void println(boolean b) {}

    public void println(char c) {}

    public void println(int i) {}

    public void println(long l) {}

    /**
     * @since CLDC 1.1
     */
    public void println(float f) {}

    /**
     * @since CLDC 1.1
     */
    public void println(double d) {}

    public void println(char[] s) {}

    public void println(String s) {}

    public void println(Object o) {}

    protected void setError() {}

    public void write(int b) {}

    public void write(byte[] buf, int off, int len) {}

}
