package java.util.zip;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InflaterInputStream extends FilterInputStream {
    protected byte[] buf;
    protected Inflater inf;
    protected int len;

    public InflaterInputStream(InputStream in) {
        super(in);
    }
    
    public InflaterInputStream(InputStream in, Inflater inf) {
        super(in);
    }
    
    /**
     * @throws IllegalArgumentException
     */
    public InflaterInputStream(InputStream in, Inflater inf, int size) {
        super(in);
    }

    /**
     * @throws IOException
     */
    public int available() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    protected void fill() throws IOException {}

    /**
     * @throws IOException
     */
    public int read() throws IOException {
        return 0;
    }

    /**
     * @throws ZipException
     * @throws IOException
     */
    public int read(byte[] b, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws IllegalArgumentException
     */
    public long skip(long n) throws IOException {
        return 0;
    }

}
