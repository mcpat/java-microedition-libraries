package javax.microedition.lcdui;

public class StringItem extends Item {
    public StringItem(String label, String text) {super("");}
    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public StringItem(String label, String text, int appearanceMode) {super("");}

    /**
     * @since MIDP 2.0
     */
    public int getAppearanceMode() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public Font getFont() {
        return null;
    }

    public String getText() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public void setFont(Font font) {}

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setPreferredSize(int width, int height) {}

    public void setText(String text) {}

}
