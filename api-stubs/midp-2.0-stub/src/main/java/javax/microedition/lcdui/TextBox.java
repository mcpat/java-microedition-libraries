package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class TextBox extends Screen {
	/**
	 * @throws IllegalArgumentException
	 */
	public TextBox(String title, String text, int maxSize, int constraints) {}

	/**
	 * @throws IllegalArgumentException
	 * @throws StringIndexOutOfBoundsException
	 */
    public void delete(int offset, int length) {}

    public int getCaretPosition() {
        return 0;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public int getChars(char[] data) {
        return 0;
    }

    public int getConstraints() {
        return 0;
    }

    public int getMaxSize() {
        return 0;
    }

    public String getString() {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void insert(String src, int position) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void insert(char[] data, int offset, int length, int position){}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void setChars(char[] data, int offset, int length) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setConstraints(int constraints) {}

    /**
     * @since MIDP 2.0
     */
    public void setInitialInputMode(String characterSubset) {}

    /**
     * @throws IllegalArgumentException
     */
    public int setMaxSize(int maxSize) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public void setString(String text) {}

    /**
     * @since MIDP 2.0
     */
    public void setTicker(Ticker ticker) {}

    /**
     * @since MIDP 2.0
     */
    public void setTitle(String s) {}

    public int size() {
        return 0;
    }

}
