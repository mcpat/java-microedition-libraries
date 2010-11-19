package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * @since MIDP 2.0
 */
public class Sprite extends Layer {
	public static final int TRANS_MIRROR= 2;
	public static final int TRANS_MIRROR_ROT180= 1;
	public static final int TRANS_MIRROR_ROT270= 4;
	public static final int TRANS_MIRROR_ROT90= 7;
	public static final int TRANS_NONE= 0;
	public static final int TRANS_ROT180= 3;
	public static final int TRANS_ROT270= 6;
	public static final int TRANS_ROT90= 5;

	/**
	 * @throws NullPointerException
	 */
    public Sprite(Image image) {super(0, 0);}
    
    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public Sprite(Image image, int frameWidth, int frameHeight) {super(0, 0);}
    
    /**
     * @throws NullPointerException
     */
    public Sprite(Sprite s) {super(0, 0);}

    /**
     * @throws NullPointerException
     */
    public final boolean collidesWith(Sprite s, boolean pixelLevel) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public final boolean collidesWith(TiledLayer t, boolean pixelLevel) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public final boolean collidesWith(Image image, int x, int y, boolean pixelLevel){
        return false;
    }

    /**
     * @throws IllegalArgumentException
     */
    public void defineCollisionRectangle(int x, int y, int width, int height) {}

    public void defineReferencePixel(int x, int y) {}

    public final int getFrame() {
        return 0;
    }

    public int getFrameSequenceLength() {
        return 0;
    }

    public int getRawFrameCount() {
        return 0;
    }

    public int getRefPixelX() {
        return 0;
    }

    public int getRefPixelY() {
        return 0;
    }

    public void nextFrame() {}

    /**
     * @throws NullPointerException
     */
    public final void paint(Graphics g) {}

    public void prevFrame() {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setFrame(int sequenceIndex) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void setFrameSequence(int[] sequence) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public void setImage(Image img, int frameWidth, int frameHeight) {}

    public void setRefPixelPosition(int x, int y) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setTransform(int transform) {}

}
