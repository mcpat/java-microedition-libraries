package javax.microedition.lcdui;

import javax.microedition.midlet.MIDlet;
/**
 * @since MIDP 1.0
 */
public class Display {
	public static final int ALERT = 3;
	public static final int CHOICE_GROUP_ELEMENT = 2;
	public static final int COLOR_BACKGROUND = 0;
	public static final int COLOR_BORDER = 4;
	public static final int COLOR_FOREGROUND = 1;
	public static final int COLOR_HIGHLIGHTED_BACKGROUND = 2;
	public static final int COLOR_HIGHLIGHTED_BORDER = 5;
	public static final int COLOR_HIGHLIGHTED_FOREGROUND = 3;
	public static final int LIST_ELEMENT = 1;

	/**
	 * @throws NullPointerException
	 */
    public static Display getDisplay(MIDlet m) {
        return null;
    }

    Display(MIDlet m) {}

    public void callSerially(Runnable r) {}

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public boolean flashBacklight(int duration) {
        return false;
    }

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public int getBestImageHeight(int imageType) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public int getBestImageWidth(int imageType) {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getBorderStyle(boolean highlighted) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public int getColor(int colorSpecifier) {
        return 0;
    }

    public Displayable getCurrent() {
        return null;
    }

    public boolean isColor() {
        return false;
    }

    /**
     * @since MIDP 2.0
     */
    public int numAlphaLevels() {
        return 0;
    }

    public int numColors() {
        return 0;
    }

    public void setCurrent(Displayable nextDisplayable) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public void setCurrent(Alert alert, Displayable nextDisplayable) {}

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void setCurrentItem(Item item) {}

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public boolean vibrate(int duration) {
        return false;
    }

}
