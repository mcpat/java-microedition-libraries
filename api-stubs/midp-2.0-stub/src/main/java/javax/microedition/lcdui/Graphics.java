package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class Graphics {
	public static final int BASELINE= 64;
	public static final int BOTTOM= 32;
	public static final int DOTTED= 1;
	public static final int HCENTER= 1;
	public static final int LEFT= 4;
	public static final int RIGHT= 8;
	public static final int SOLID= 0;
	public static final int TOP= 16;
	public static final int VCENTER= 2;

    Graphics(int x, int y) {}

    public void clipRect(int x, int y, int width, int height) {}

    /**
     * @throws IllegalStateException
     * @throws IllegalArgumentException 
     * @since MIDP 2.0
     */
    public void copyArea(int x_src, int y_src, int width, int height, int x_dest, int y_dest, int anchor) {}

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {}

    /**
     * @throws IllegalArgumentException
     */
    public void drawChar(char character, int x, int y, int anchor) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void drawChars(char[] data, int offset, int length, int x, int y, int anchor) {}

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void drawImage(Image img, int x, int y, int anchor) {}

    public void drawLine(int x1, int y1, int x2, int y2) {}

    public void drawRect(int x, int y, int width, int height) {}

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void drawRegion(Image src, int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha) {}

    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public void drawString(String str, int x, int y, int anchor) {}

    /**
     * @throws StringIndexOutOfBoundsException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void drawSubstring(String str, int offset, int len, int x, int y, int anchor) {}

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {}

    public void fillRect(int x, int y, int width, int height) {}

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {}

    /**
     * @since MIDP 2.0
     */
    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {}

    public int getBlueComponent() {
        return 0;
    }

    public int getClipHeight() {
        return 0;
    }

    public int getClipWidth() {
        return 0;
    }

    public int getClipX() {
        return 0;
    }

    public int getClipY() {
        return 0;
    }

    public int getColor() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getDisplayColor(int color) {
        return 0;
    }

    public Font getFont() {
        return null;
    }

    public int getGrayScale() {
        return 0;
    }

    public int getGreenComponent() {
        return 0;
    }

    public int getRedComponent() {
        return 0;
    }

    public int getStrokeStyle() {
        return 0;
    }

    public int getTranslateX() {
        return 0;
    }

    public int getTranslateY() {
        return 0;
    }

    public void setClip(int x, int y, int width, int height) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setColor(int red, int green, int blue) {}

    public void setColor(int RGB) {}

    public void setFont(Font font) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setGrayScale(int value) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setStrokeStyle(int style) {}

    public void translate(int x, int y) {}

}
