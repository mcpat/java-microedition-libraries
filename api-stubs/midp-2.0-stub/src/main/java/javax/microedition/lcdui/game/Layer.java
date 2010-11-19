package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Graphics;

/**
 * @since MIDP 2.0
 *
 */
public abstract class Layer {
    Layer(int x, int y) {}

    public final int getHeight() {
        return 0;
    }

    public final int getWidth() {
        return 0;
    }

    public final int getX() {
        return 0;
    }

    public final int getY() {
        return 0;
    }

    public final boolean isVisible() {
        return false;
    }

    public void move(int dx, int dy) {}

    /**
     * @throws NullPointerException
     */
    public abstract void paint(Graphics g);

    public void setPosition(int x, int y) {}

    public void setVisible(boolean visible) {}

}
