package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public final class Font {
	public static final int FACE_MONOSPACE= 32;
	public static final int FACE_PROPORTIONAL= 64;
	public static final int FACE_SYSTEM= 0;
	public static final int FONT_INPUT_TEXT= 1;
	public static final int FONT_STATIC_TEXT= 0;
	public static final int SIZE_LARGE= 16;
	public static final int SIZE_MEDIUM= 0;
	public static final int SIZE_SMALL= 8;
	public static final int STYLE_BOLD= 1;
	public static final int STYLE_ITALIC= 2;
	public static final int STYLE_PLAIN= 0;
	public static final int STYLE_UNDERLINED= 4;

    public static Font getDefaultFont() {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public static Font getFont(int fontSpecifier) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public static Font getFont(int face, int style, int size) {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public int charsWidth(char[] ch, int offset, int length) {
        return 0;
    }

    public int charWidth(char ch) {
        return 0;
    }

    public int getBaselinePosition() {
        return 0;
    }

    public int getFace() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public int getSize() {
        return 0;
    }

    public int getStyle() {
        return 0;
    }

    public boolean isBold() {
        return false;
    }

    public boolean isItalic() {
        return false;
    }

    public boolean isPlain() {
        return false;
    }

    public boolean isUnderlined() {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public int stringWidth(String str) {
        return 0;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public int substringWidth(String str, int offset, int len) {
        return 0;
    }

}
