package javax.microedition.lcdui;

/**
 * @since MIDP 2.0
 */
public class Spacer extends Item {
	/**
	 * @throws IllegalArgumentException
	 */
    public Spacer(int minWidth, int minHeight) {super("");}

    /**
     * @throws IllegalStateException
     */
    public void addCommand(Command cmd) {}

    /**
     * @throws IllegalStateException
     */
    public void setDefaultCommand(Command cmd) {}

    /**
     * @throws IllegalStateException
     */
    public void setLabel(String label) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setMinimumSize(int minWidth, int minHeight) {}

}
