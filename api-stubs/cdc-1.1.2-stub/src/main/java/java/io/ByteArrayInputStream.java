package java.io;

public class ByteArrayInputStream extends InputStream {
    protected byte[] buf;
    protected int count;
    protected int mark;
    protected int pos;

    public ByteArrayInputStream(byte[] buf) {}

	public ByteArrayInputStream(byte[] buf, int offset, int length){
	}

	public int available() {
		return 0;
	}

	/**
	 * @throws IOException
	 */
	public void close() throws IOException {
	}

	public void mark(int readAheadLimit) {
	}

	public boolean markSupported() {
		return false;
	}

	public int read() {
		return 0;
	}

	public int read(byte[] b, int off, int len) {
		return 0;
	}

	public void reset() {
	}

	public long skip(long n) {
		return 0;
	}

}
