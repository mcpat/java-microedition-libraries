package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public interface Choice {
	public static final int EXCLUSIVE= 1;
	public static final int IMPLICIT= 3;
	public static final int MULTIPLE= 2;
	public static final int POPUP= 4;
	public static final int TEXT_WRAP_DEFAULT= 0;
	public static final int TEXT_WRAP_OFF= 2;
	public static final int TEXT_WRAP_ON= 1;

	/**
	 * @throws NullPointerException
	 */
    int append(String stringPart, Image imagePart);

    /**
     * @throws IndexOutOfBoundsException 
     */
    void delete(int elementNum);

    /**
     * @since MIDP 2.0
     */
    void deleteAll();

    /**
     * @since MIDP 2.0
     */
    int getFitPolicy();

    /**
     * @throws IndexOutOfBoundsException 
     * @since MIDP 2.0
     */
    Font getFont(int elementNum);

    /**
     * @throws IndexOutOfBoundsException
     */
    Image getImage(int elementNum);

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    int getSelectedFlags(boolean[] selectedArray_return);

    int getSelectedIndex();

    /**
     * @throws IndexOutOfBoundsException
     */
    String getString(int elementNum);

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    void insert(int elementNum, String stringPart, Image imagePart);

    /**
     * @throws IndexOutOfBoundsException
     */
    boolean isSelected(int elementNum);

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    void set(int elementNum, String stringPart, Image imagePart);

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    void setFitPolicy(int fitPolicy);

    /**
     * @throws IndexOutOfBoundsException
     * @since MIDP 2.0
     */
    void setFont(int elementNum, Font font);

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    void setSelectedFlags(boolean[] selectedArray);

    /**
     * @throws IndexOutOfBoundsException
     */
    void setSelectedIndex(int elementNum, boolean selected);

    int size();

}
