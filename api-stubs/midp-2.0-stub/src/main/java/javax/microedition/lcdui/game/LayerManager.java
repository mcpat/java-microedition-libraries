package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Graphics;

/**
 * @since MIDP 2.0
 */
public class LayerManager {
    public LayerManager() {}

    /**
     * @throws NullPointerException
     */
    public void append(Layer l) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public Layer getLayerAt(int index) {
        return null;
    }

    public int getSize() {
        return 0;
    }

    /**
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public void insert(Layer l, int index) {}

    /**
     * @throws NullPointerException
     */
    public void paint(Graphics g, int x, int y) {}

    /**
     * @throws NullPointerException
     */
    public void remove(Layer l) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setViewWindow(int x, int y, int width, int height) {}

}
