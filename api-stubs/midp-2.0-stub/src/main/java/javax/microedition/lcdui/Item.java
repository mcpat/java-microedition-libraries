package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public abstract class Item {
	public static final int BUTTON= 2;
	public static final int HYPERLINK= 1;
	public static final int LAYOUT_2= 16384;
	public static final int LAYOUT_BOTTOM= 32;
	public static final int LAYOUT_CENTER= 3;
	public static final int LAYOUT_DEFAULT= 0;
	public static final int LAYOUT_EXPAND= 2048;
	public static final int LAYOUT_LEFT= 1;
	public static final int LAYOUT_NEWLINE_AFTER= 512;
	public static final int LAYOUT_NEWLINE_BEFORE= 256;
	public static final int LAYOUT_RIGHT= 2;
	public static final int LAYOUT_SHRINK= 1024;
	public static final int LAYOUT_TOP= 16;
	public static final int LAYOUT_VCENTER= 48;
	public static final int LAYOUT_VEXPAND= 8192;
	public static final int LAYOUT_VSHRINK= 4096;
	public static final int PLAIN= 0;

    Item(String s) {}

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void addCommand(Command cmd) {}

    public String getLabel() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public int getLayout() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getMinimumHeight() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getMinimumWidth() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getPreferredHeight() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getPreferredWidth() {
        return 0;
    }

    /**
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void notifyStateChanged() {}

    /**
     * @since MIDP 2.0
     */
    public void removeCommand(Command cmd) {}

    /**
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setDefaultCommand(Command cmd) {}

    /**
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setItemCommandListener(ItemCommandListener l) {}

    /**
     * @throws IllegalStateException
     */
    public void setLabel(String label) {}

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setLayout(int layout) {}

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setPreferredSize(int width, int height) {}

}
