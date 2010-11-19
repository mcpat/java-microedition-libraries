package javax.microedition.lcdui;

/**
 * @since MIDP 2.0
 */
public abstract class CustomItem extends Item {
	protected static final int KEY_PRESS = 4;
	protected static final int KEY_RELEASE = 8;
	protected static final int KEY_REPEAT = 0x10;
	protected static final int NONE = 0;
	protected static final int POINTER_DRAG = 0x80;
	protected static final int POINTER_PRESS = 0x20;
	protected static final int POINTER_RELEASE = 0x40;
	protected static final int TRAVERSE_HORIZONTAL = 1;
	protected static final int TRAVERSE_VERTICAL = 2;

    protected CustomItem(String arg0) {super("");}

    /**
     * @throws IllegalArgumentException
     */
    public int getGameAction(int label) {
        return 0;
    }

    protected final int getInteractionModes() {
        return 0;
    }

    protected abstract int getMinContentHeight();

    protected abstract int getMinContentWidth();

    protected abstract int getPrefContentHeight(int width);

    protected abstract int getPrefContentWidth(int height);

    protected void hideNotify() {}

    protected final void invalidate() {}

    protected void keyPressed(int keyCode) {}

    protected void keyReleased(int keyCode) {}

    protected void keyRepeated(int keyCode) {}

    protected abstract void paint(Graphics g, int w, int h);

    protected void pointerDragged(int x, int y) {}

    protected void pointerPressed(int x, int y) {}

    protected void pointerReleased(int x, int y) {}

    protected final void repaint() {}

    protected final void repaint(int x, int y, int w, int h) {}

    protected void showNotify() {}

    protected void sizeChanged(int w, int h) {}

    protected boolean traverse(int dir, int viewportWidth, int viewportHeight, int[] visRect_inout) {
        return false;
    }

    protected void traverseOut() {}

}
