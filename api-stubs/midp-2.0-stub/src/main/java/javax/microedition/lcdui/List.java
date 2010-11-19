package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 * @author schoener
 *
 */
public class List extends Screen implements Choice {
    public final static Command SELECT_COMMAND= new Command("", Command.SCREEN, 0);;

    /**
     * @throws IllegalArgumentException
     */
    public List(String title, int listType) {}
    
    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public List(String title, int listType, String[] stringElements, Image[] imageElements) {}

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
     * @throws IllegalArgumentException
     * @throws NullPointerException
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
    public void insert(int elementNum, String stringPart, Image imagePart){}

    /**
     * @throws IndexOutOfBoundsException
     */
    public boolean isSelected(int elementNum) {
        return false;
    }

    /**
     * @since MIDP 2.0
     */
    public void removeCommand(Command cmd) {}

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
     * @since MIDP 2.0
     */
    public void setSelectCommand(Command command) {}

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void setSelectedFlags(boolean[] selectedArray) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setSelectedIndex(int elementNum, boolean selected) {}

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
