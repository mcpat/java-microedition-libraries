package java.io;

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
	public abstract static class GetField {
	    public GetField() {}

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract boolean defaulted(String name) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract boolean get(String name, boolean val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract byte get(String name, byte val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract char get(String name, char val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract short get(String name, short val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract int get(String name, int val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract long get(String name, long val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract float get(String name, float val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract double get(String name, double val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract Object get(String name, Object val) throws IOException, IllegalArgumentException;

	    /**
	     * @throws IOException
	     * @throws IllegalArgumentException
	     */
	    public abstract ObjectStreamClass getObjectStreamClass();
	}
	
	/**
	 * @throws StreamCorruptedException
	 * @throws IOException
	 * @throws SecurityException
	 * @throws NullPointerException
	 */
	public ObjectInputStream(InputStream in) throws IOException {}
	
	/**
	 * @throws IOException
	 * @throws SecurityException
	 */
    protected ObjectInputStream() throws IOException, SecurityException {}

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
     * @throws NotActiveException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void defaultReadObject() throws IOException, ClassNotFoundException {}

    /**
     * @throws SecurityException
     */
    protected boolean enableResolveObject(boolean arg0) throws SecurityException {
        return false;
    }

    /**
     * @throws IOException
     */
    public int read() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public int read(byte[] buf, int off, int len) throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public boolean readBoolean() throws IOException {
        return false;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public byte readByte() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public char readChar() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public double readDouble() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws NotActiveException
     */
    public ObjectInputStream$GetField readFields() throws IOException, ClassNotFoundException, NotActiveException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public float readFloat() throws IOException {
        return 0;
    }
    
    /**
     * @throws EOFException
     * @throws IOException
     */
    public void readFully(byte[] buf) throws IOException {}

    /**
     * @throws EOFException
     * @throws IOException
     */
    public void readFully(byte[] buf, int off, int len) throws IOException {}

    /**
     * @throws EOFException
     * @throws IOException
     */
    public int readInt() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     */
    public String readLine() throws IOException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public long readLong() throws IOException {
        return 0;
    }

    /**
     * @throws StreamCorruptedException
     * @throws InvalidClassException 
     * @throws OptionalDataException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public final Object readObject() throws OptionalDataException, ClassNotFoundException, IOException {
        return null;
    }

    /**
     * @throws OptionalDataException
     * @throws ClassNotFoundException
     * @throws IOException
     */
    protected Object readObjectOverride() throws OptionalDataException, ClassNotFoundException, IOException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public short readShort() throws IOException {
        return 0;
    }

    /**
     * @throws IOException
     * @throws StreamCorruptedException
     */
    protected void readStreamHeader() throws IOException, StreamCorruptedException {}

    /**
     * @throws ClassNotFoundException
     * @throws StreamCorruptedException
     * @throws ObjectStreamException
     * @throws OptionalDataException
     * @throws IOException   
     */
    public Object readUnshared() throws IOException, ClassNotFoundException {
        return null;
    }

    /**
     * @throws IOException
     * @throws EOFException
     */
    public int readUnsignedByte() throws IOException {
        return 0;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public int readUnsignedShort() throws IOException {
        return 0;
    }

    /**
     * @throws UTFDataFormatException
     * @throws IOException
     */
    public String readUTF() throws IOException {
        return null;
    }

    /**
     * @throws NotActiveException
     * @throws InvalidObjectException
     */
    public void registerValidation(ObjectInputValidation obj, int prio) throws NotActiveException, InvalidObjectException {}

    /**
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected Class resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
        return null;
    }

    /**
     * @throws IOException
     */
    protected Object resolveObject(Object obj) throws IOException {
        return null;
    }

    /**
     * @throws IOException
     * @throws ClassNotFoundException
     */
    protected Class resolveProxyClass(String[] interfaces) throws IOException, ClassNotFoundException {
        return null;
    }

    /**
     * @throws EOFException
     * @throws IOException
     */
    public int skipBytes(int len) throws IOException {
        return 0;
    }

}
