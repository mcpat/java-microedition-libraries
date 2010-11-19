package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public abstract class Displayable {
    Displayable() {}

    /**
     * @throws NullPointerException
     */
    public void addCommand(Command cmd) {}

    /**
     * @since MIDP 2.0
     */
    public int getHeight() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public Ticker getTicker() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public String getTitle() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public int getWidth() {
        return 0;
    }

    public boolean isShown() {
        return false;
    }

    public void removeCommand(Command cmd) {}

    public void setCommandListener(CommandListener l) {}

    /**
     * @since MIDP 2.0
     */
    public void setTicker(Ticker ticker) {}

    /**
     * @since MIDP 2.0
     */
    public void setTitle(String s) {}

    /**
     * @since MIDP 2.0
     */
    protected void sizeChanged(int w, int h) {}

}
