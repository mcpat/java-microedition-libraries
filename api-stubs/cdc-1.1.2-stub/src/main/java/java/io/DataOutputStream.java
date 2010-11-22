package java.io;

public class DataOutputStream extends FilterOutputStream implements DataOutput {
    protected int written;

    public DataOutputStream(OutputStream out) {super(null);}

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    public final int size() {
        return 0;
    }

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
    public final void writeBytes(String s) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeChar(int v) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeChars(String s) throws IOException {}

    /**
     * @throws IOException
     */
    public final void writeDouble(double v) throws IOException {}

    /**
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
    public final void writeUTF(String str) throws IOException {}

}
