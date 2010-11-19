package java.lang;

public abstract class Process {
    public Process() {}

    public abstract void destroy();

    public abstract int exitValue();

    public abstract InputStream getErrorStream();

    public abstract InputStream getInputStream();

    public abstract OutputStream getOutputStream();

    public abstract int waitFor() throws InterruptedException;

}
