package java.io;

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
	public abstract static class PutField {
	    public PutField() {}

	    public abstract void put(String name, boolean val);

	    public abstract void put(String name, byte val);

	    public abstract void put(String name, char val);

	    public abstract void put(String name, short val);

	    public abstract void put(String name, int val);

	    public abstract void put(String name, long val);

	    public abstract void put(String name, float val);

	    public abstract void put(String name, double val);

	    public abstract void put(String name, Object val);

	    /**
	     * @throws IOException
	     */
	    public abstract void write(ObjectOutput out) throws IOException;

	}
	
	/**
	 * @throws IOException
	 * @throws SecurityException 
	 * @throws NullPointerException
	 */
    public ObjectOutputStream(OutputStream out) throws IOException {}

    /**
     * @throws IOException
     * @throws SecurityException 
     */
    protected ObjectOutputStream() throws IOException, SecurityException {}

    /**
     * @throws IOException
     */
    protected void annotateClass(Class cl) throws IOException {}

    /**
     * @throws IOException
     */
    protected void annotateProxyClass(Class cl) throws IOException {}

    /**
     * @throws IOException
     */
    public void close() throws IOException {}

    /**
     * @throws IOException
     */
    public void defaultWriteObject() throws IOException {}

    /**
     * @throws IOException
     */
    protected void drain() throws IOException {}

    /**
     * @throws SecurityException
     */
    protected boolean enableReplaceObject(boolean enable) throws SecurityException {
        return false;
    }

    /**
     * @throws IOException
     */
    public void flush() throws IOException {}

    /**
     * @throws IOException
     */
    public PutField putFields() throws IOException {
        return null;
    }
    
    /**
     * @throws IOException
     */
    protected Object replaceObject(Object obj) throws IOException {
        return null;
    }

    /**
     * @throws IOException
     */
    public void reset() throws IOException {}

    /**
     * @throws IllegalStateException 
     * @throws IllegalArgumentException 
     * @throws IOException
     */
    public void useProtocolVersion(int version) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(int val) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] buf) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(byte[] buf, int off, int len) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeBoolean(boolean val) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeByte(int val) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeBytes(String str) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeChar(int val) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeChars(String str) throws IOException {}

    /**
     * @throws IOException
     */
    protected void writeClassDescriptor(ObjectStreamClass desc) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeDouble(double val) throws IOException {}

    /**
     * @throws IOException
     * @throws NotActiveException
     */
    public void writeFields() throws IOException {}

    /**
     * @throws IOException
     */
    public void writeFloat(float val) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeInt(int val) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeLong(long val) throws IOException {}

    /**
     * @throws InvalidClassException 
     * @throws NotSerializableException 
     * @throws IOException
     */
    public final void writeObject(Object obj) throws IOException {}

    /**
     * @throws IOException
     */
    protected void writeObjectOverride(Object obj) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeShort(int val) throws IOException {}

    /**
     * @throws IOException
     */
    protected void writeStreamHeader() throws IOException {}

    /**
     * @throws NotSerializableException 
     * @throws InvalidClassException 
     * @throws IOException
     */
    public void writeUnshared(Object obj) throws IOException {}

    /**
     * @throws IOException
     */
    public void writeUTF(String str) throws IOException {}

}
