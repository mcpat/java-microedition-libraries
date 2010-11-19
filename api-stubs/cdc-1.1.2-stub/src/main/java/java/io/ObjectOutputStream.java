package java.io;

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
    public ObjectOutputStream(OutputStream arg0) throws IOException {}
    protected ObjectOutputStream() throws IOException, SecurityException {}

    protected void annotateClass(Class arg0) throws IOException {}

    protected void annotateProxyClass(Class arg0) throws IOException {}

    public void close() throws IOException {}

    public void defaultWriteObject() throws IOException {}

    protected void drain() throws IOException {}

    protected boolean enableReplaceObject(boolean arg0) throws SecurityException {
        return false;
    }

    public void flush() throws IOException {}

    public ObjectOutputStream$PutField putFields() throws IOException {
        return null;
    }

    protected Object replaceObject(Object arg0) throws IOException {
        return null;
    }

    public void reset() throws IOException {}

    public void useProtocolVersion(int arg0) throws IOException {}

    public void write(int arg0) throws IOException {}

    public void write(byte[] arg0) throws IOException {}

    public void write(byte[] arg0, int arg1, int arg2) throws IOException {}

    public void writeBoolean(boolean arg0) throws IOException {}

    public void writeByte(int arg0) throws IOException {}

    public void writeBytes(String arg0) throws IOException {}

    public void writeChar(int arg0) throws IOException {}

    public void writeChars(String arg0) throws IOException {}

    protected void writeClassDescriptor(ObjectStreamClass arg0) throws IOException {}

    public void writeDouble(double arg0) throws IOException {}

    public void writeFields() throws IOException {}

    public void writeFloat(float arg0) throws IOException {}

    public void writeInt(int arg0) throws IOException {}

    public void writeLong(long arg0) throws IOException {}

    public final void writeObject(Object arg0) throws IOException {}

    protected void writeObjectOverride(Object arg0) throws IOException {}

    public void writeShort(int arg0) throws IOException {}

    protected void writeStreamHeader() throws IOException {}

    public void writeUnshared(Object arg0) throws IOException {}

    public void writeUTF(String arg0) throws IOException {}

}
