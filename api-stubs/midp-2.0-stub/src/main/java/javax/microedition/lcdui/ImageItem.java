package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class ImageItem extends Item {
	public static final int LAYOUT_CENTER = 3;
	public static final int LAYOUT_DEFAULT = 0;
	public static final int LAYOUT_LEFT = 1;
	public static final int LAYOUT_NEWLINE_AFTER = 0x200;
	public static final int LAYOUT_NEWLINE_BEFORE = 0x100;
	public static final int LAYOUT_RIGHT = 2;

	/**
	 * @throws IllegalArgumentException
	 */
	public ImageItem(String label, Image img, int layout, String altText) {super("");}

	/**
	 * @throws IllegalArgumentException
	 * @since MIDP 2.0
	 */
    public ImageItem(String label, Image image, int layout, String altText, int appearanceMode) {super("");}

    public String getAltText() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public int getAppearanceMode() {
        return 0;
    }

    public Image getImage() {
        return null;
    }

    public int getLayout() {
        return 0;
    }

    public void setAltText(String text) {}

    public void setImage(Image img) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setLayout(int layout) {}

}
