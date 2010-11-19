package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 * @since MIDP 2.0
 */
public abstract class GameCanvas extends Canvas {
	public static final int DOWN_PRESSED= 64;
	public static final int FIRE_PRESSED= 256;
	public static final int GAME_A_PRESSED= 512;
	public static final int GAME_B_PRESSED= 1024;
	public static final int GAME_C_PRESSED= 2048;
	public static final int GAME_D_PRESSED= 4096;
	public static final int LEFT_PRESSED= 4;
	public static final int RIGHT_PRESSED= 32;
	public static final int UP_PRESSED= 2;

    protected GameCanvas(boolean suppressKeyEvents) {}

    public void flushGraphics(int x, int y, int width, int height) {}

    public void flushGraphics() {}

    protected Graphics getGraphics() {
        return null;
    }

    public int getKeyStates() {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public void paint(Graphics g) {}

}
