package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public abstract class Canvas extends Displayable {
	public static final int DOWN= 6;
	public static final int FIRE= 8;
	public static final int GAME_A= 9;
	public static final int GAME_B= 10;
	public static final int GAME_C= 11;
	public static final int GAME_D= 12;
	public static final int KEY_NUM0= 48;
	public static final int KEY_NUM1= 49;
	public static final int KEY_NUM2= 50;
	public static final int KEY_NUM3= 51;
	public static final int KEY_NUM4= 52;
	public static final int KEY_NUM5= 53;
	public static final int KEY_NUM6= 54;
	public static final int KEY_NUM7= 55;
	public static final int KEY_NUM8= 56;
	public static final int KEY_NUM9= 57;
	public static final int KEY_POUND= 35;
	public static final int KEY_STAR= 42;
	public static final int LEFT= 2;
	public static final int RIGHT= 5;
	public static final int UP= 1;
	
    protected Canvas() {}

    /**
     * @throws IllegalArgumentException
     */
    public int getGameAction(int keyCode) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public int getKeyCode(int gameAction) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public String getKeyName(int keyCode) {
        return null;
    }

    public boolean hasPointerEvents() {
        return false;
    }

    public boolean hasPointerMotionEvents() {
        return false;
    }

    public boolean hasRepeatEvents() {
        return false;
    }

    protected void hideNotify() {}

    public boolean isDoubleBuffered() {
        return false;
    }

    protected void keyPressed(int keyCode) {}

    protected void keyReleased(int keyCode) {}

    protected void keyRepeated(int keyCode) {}

    protected abstract void paint(Graphics g);

    protected void pointerDragged(int x, int y) {}

    protected void pointerPressed(int x, int y) {}

    protected void pointerReleased(int x, int y) {}

    public final void repaint(int x, int y, int width, int height) {}

    public final void repaint() {}

    public final void serviceRepaints() {}

    /**
     * @since MIDP 2.0
     */
    public void setFullScreenMode(boolean mode) {}

    protected void showNotify() {}

    /**
     * @since MIDP 2.0
     */
    protected void sizeChanged(int w, int h) {}

}
