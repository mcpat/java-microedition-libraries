package java.io;

public class DataOutputStream extends FilterOutputStream implements DataOutput {
    protected int written;

    public DataOutputStream(OutputStream arg0) {}

    public void flush() throws IOException {}

    public final int size() {
        return 0;
    }

    public void write(int arg0) throws IOException {}

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {}

    public final void writeBoolean(boolean arg0) throws IOException {}

    public final void writeByte(int arg0) throws IOException {}

    public final void writeBytes(String arg0) throws IOException {}

    public final void writeChar(int arg0) throws IOException {}

    public final void writeChars(String arg0) throws IOException {}

    public final void writeDouble(double arg0) throws IOException {}

    public final void writeFloat(float arg0) throws IOException {}

    public final void writeInt(int arg0) throws IOException {}

    public final void writeLong(long arg0) throws IOException {}

    public final void writeShort(int arg0) throws IOException {}

    public final void writeUTF(String arg0) throws IOException {}

}
