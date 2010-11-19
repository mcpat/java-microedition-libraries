package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class ChoiceGroup extends Item implements Choice {
    /**
     * @throws IllegalArgumentException
     */
	public ChoiceGroup(String label, int choiceType) {
    	super("");
    }
	
	/**
	 * @throws NullPointerException
     * @throws IllegalArgumentException
	 */
    public ChoiceGroup(String label, int choiceType, String[] stringElements, Image[] imageElements) {
    	super("");
    }

    /**
     * @throws NullPointerException
     */
    public int append(String stringPart, Image imagePart) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void delete(int elementNum) {}

    public void deleteAll() {}

    /**
     * @since MIDP 2.0
     */
    public int getFitPolicy() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @since MIDP 2.0
     */
    public Font getFont(int elementNum) {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public Image getImage(int elementNum) {
        return null;
    }

	/**
	 * @throws NullPointerException
     * @throws IllegalArgumentException
	 */
    public int getSelectedFlags(boolean[] selectedArray_return) {
        return 0;
    }

    public int getSelectedIndex() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public String getString(int elementNum) {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    public void insert(int elementNum, String stringPart, Image imagePart) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public boolean isSelected(int elementNum) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    public void set(int elementNum, String stringPart, Image imagePart) {}

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public void setFitPolicy(int fitPolicy) {}

    /**
     * @throws IndexOutOfBoundsException
     * @since MIDP 2.0
     */
    public void setFont(int elementNum, Font font) {}

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void setSelectedFlags(boolean[] selectedArray) {}

	/**
     * @throws IndexOutOfBoundsException
	 */
    public void setSelectedIndex(int elementNum, boolean selected) {}

    public int size() {
        return 0;
    }

}
