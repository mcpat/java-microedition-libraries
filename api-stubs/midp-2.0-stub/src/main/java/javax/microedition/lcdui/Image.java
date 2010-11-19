package javax.microedition.lcdui;

import java.io.IOException;
import java.io.InputStream;

/**
 * @since MIDP 1.0
 */
public class Image {
	
	/**
	 * @throws IllegalArgumentException
	 */
    public static Image createImage(int width, int height) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public static Image createImage(Image source) {
        return null;
    }

    /**
     * @throws IOException
     * @throws NullPointerException
     */
    public static Image createImage(String name) throws IOException {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public static Image createImage(byte[] imageData, int imageOffset, int imageLength){
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public static Image createImage(Image image, int x, int y, int width, int height, int transform) {
        return null;
    }

    /**
     * @throws IOException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public static Image createImage(InputStream stream) throws IOException {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @throws ArrayIndexOutOfBoundsException
     * @since MIDP 2.0
     */
    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        return null;
    }


    Image() {}

    /**
     * @throws IllegalStateException
     */
    public Graphics getGraphics() {
        return null;
    }

    public int getHeight() {
        return 0;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {}

    public int getWidth() {
        return 0;
    }

    public boolean isMutable() {
        return false;
    }

}
