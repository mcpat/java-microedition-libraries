package java.io;

/**
 * @since CLDC 1.0
 */
public class DataOutputStream extends OutputStream implements DataOutput {
    protected OutputStream out;

    public DataOutputStream(OutputStream out) {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    /**
     * @throws IOException
     */
    public void write(int b) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] b, int off, int len) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeBoolean(boolean v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeByte(int v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeChar(int v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeChars(String s) throws IOException {}

    /**
     * @since CLDC 1.1
     * 
     * @throws IOException
     */
    public final void writeDouble(double v) throws IOException {}

    /**
     * @since CLDC 1.1
     * 
     * @throws IOException
     */
    public final void writeFloat(float v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeInt(int v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeLong(long v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeShort(int v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeUTF(String v) throws IOException {}
}
