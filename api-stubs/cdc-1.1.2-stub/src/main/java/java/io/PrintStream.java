package java.io;

public class PrintStream extends FilterOutputStream {
    public PrintStream(OutputStream out) {super(null);}
    public PrintStream(OutputStream out, boolean autoFlush) {super(null);}
    /**
     * @throws UnsupportedEncodingException
     */
    public PrintStream(OutputStream out, boolean autoFlush, String encoding) throws UnsupportedEncodingException {super(null);}

    public boolean checkError() {
        return false;
    }

    public void close() {}

    public void flush() {}

    public void print(boolean b) {}

    public void print(char c) {}

    public void print(int i) {}

    public void print(long l) {}

    public void print(float f) {}

    public void print(double d) {}

    public void print(char[] s) {}

    public void print(String s) {}

    public void print(Object obj) {}

    public void println() {}

    public void println(boolean x) {}

    public void println(char x) {}

    public void println(int x) {}

    public void println(long x) {}

    public void println(float x) {}

    public void println(double x) {}

    public void println(char[] x) {}

    public void println(String x) {}

    public void println(Object x) {}

    protected void setError() {}

    public void write(int b) {}

    public void write(byte[] buf, int off, int len) {}

}
