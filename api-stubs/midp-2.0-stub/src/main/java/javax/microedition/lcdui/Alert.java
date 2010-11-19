package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class Alert extends Screen {
    public final static Command DISMISS_COMMAND= new Command("", Command.OK, 0);
    public final static int FOREVER= -2;

    public Alert(String title) {}
    public Alert(String title, String alertText, Image alertImage, AlertType alertType) {}

    /**
     * @throws NullPointerException
     */
    public void addCommand(Command cmd) {}

    public int getDefaultTimeout() {
        return 0;
    }

    public Image getImage() {
        return null;
    }

    public Gauge getIndicator() {
        return null;
    }

    public String getString() {
        return null;
    }

    public int getTimeout() {
        return 0;
    }

    public AlertType getType() {
        return null;
    }

    public void removeCommand(Command cmd) {}

    public void setCommandListener(CommandListener l) {}

    public void setImage(Image img) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setIndicator(Gauge indicator) {}

    public void setString(String str) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setTimeout(int time) {}

    public void setType(AlertType type) {}

}
