package java.io;

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
    public ObjectInputStream(InputStream arg0) throws IOException {}
    protected ObjectInputStream() throws IOException, SecurityException {}

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public void defaultReadObject() throws IOException, ClassNotFoundException {}

    protected boolean enableResolveObject(boolean arg0) throws SecurityException {
        return false;
    }

    public int read() throws IOException {
        return 0;
    }

    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        return 0;
    }

    public boolean readBoolean() throws IOException {
        return false;
    }

    public byte readByte() throws IOException {
        return 0;
    }

    public char readChar() throws IOException {
        return 0;
    }

    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        return null;
    }

    public double readDouble() throws IOException {
        return 0;
    }

    public ObjectInputStream$GetField readFields() throws IOException, ClassNotFoundException, NotActiveException {
        return null;
    }

    public float readFloat() throws IOException {
        return 0;
    }

    public void readFully(byte[] arg0) throws IOException {}

    public void readFully(byte[] arg0, int arg1, int arg2) throws IOException {}

    public int readInt() throws IOException {
        return 0;
    }

    public String readLine() throws IOException {
        return null;
    }

    public long readLong() throws IOException {
        return 0;
    }

    public final Object readObject() throws OptionalDataException, ClassNotFoundException, IOException {
        return null;
    }

    protected Object readObjectOverride() throws OptionalDataException, ClassNotFoundException, IOException {
        return null;
    }

    public short readShort() throws IOException {
        return 0;
    }

    protected void readStreamHeader() throws IOException, StreamCorruptedException {}

    public Object readUnshared() throws IOException, ClassNotFoundException {
        return null;
    }

    public int readUnsignedByte() throws IOException {
        return 0;
    }

    public int readUnsignedShort() throws IOException {
        return 0;
    }

    public String readUTF() throws IOException {
        return null;
    }

    public void registerValidation(ObjectInputValidation arg0, int arg1) throws NotActiveException, InvalidObjectException {}

    protected Class resolveClass(ObjectStreamClass arg0) throws IOException, ClassNotFoundException {
        return null;
    }

    protected Object resolveObject(Object arg0) throws IOException {
        return null;
    }

    protected Class resolveProxyClass(String[] arg0) throws IOException, ClassNotFoundException {
        return null;
    }

    public int skipBytes(int arg0) throws IOException {
        return 0;
    }

}
