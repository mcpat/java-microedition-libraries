package java.security;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DigestOutputStream extends FilterOutputStream {
    protected MessageDigest digest;

    public DigestOutputStream(OutputStream stream, MessageDigest digest) {super(null);}

    public MessageDigest getMessageDigest() {
        return null;
    }

    public void on(boolean arg0) {}

    public void setMessageDigest(MessageDigest digest) {}

    public String toString() {
        return null;
    }

    /**
     * @throws IOException
     */
    public void write(int b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b, int off, int len) throws IOException {}

}
