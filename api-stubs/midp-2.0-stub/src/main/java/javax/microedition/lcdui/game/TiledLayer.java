package javax.microedition.lcdui.game;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * @since MIDP 2.0
 */
public class TiledLayer extends Layer {
    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
	public TiledLayer(int columns, int rows, Image image, int tileWidth, int tileHeight) {super(0, 0);}

	/**
	 * @throws IndexOutOfBoundsException
	 */
    public int createAnimatedTile(int staticTileIndex) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void fillCells(int col, int row, int numCols, int numRows, int tileIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public int getAnimatedTile(int animatedTileIndex) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public int getCell(int col, int row) {
        return 0;
    }

    public final int getCellHeight() {
        return 0;
    }

    public final int getCellWidth() {
        return 0;
    }

    public final int getColumns() {
        return 0;
    }

    public final int getRows() {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public final void paint(Graphics g) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setAnimatedTile(int animatedTileIndex, int staticTileIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setCell(int col, int row, int tileIndex) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public void setStaticTileSet(Image image, int tileWidth, int tileHeight) {}

}
