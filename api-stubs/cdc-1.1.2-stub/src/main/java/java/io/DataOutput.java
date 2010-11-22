package java.io;

public interface DataOutput {
	
	/**
	 * @throws IOException
	 */
	void write(int b) throws IOException;

	/**
	 * @throws IOException
	 */
	void write(byte[] b) throws IOException;

	/**
	 * @throws IOException
	 */
	void write(byte[] b, int off, int len) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeBoolean(boolean v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeByte(int v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeBytes(String s) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeChar(int v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeChars(String s) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeDouble(double v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeFloat(float v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeInt(int v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeLong(long v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeShort(int v) throws IOException;

	/**
	 * @throws IOException
	 */
	void writeUTF(String s) throws IOException;

}
