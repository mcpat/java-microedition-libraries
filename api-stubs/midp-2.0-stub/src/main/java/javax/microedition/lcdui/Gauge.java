package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class Gauge extends Item {
	public static final int CONTINUOUS_IDLE= 0;
	public static final int CONTINUOUS_RUNNING= 2;
	public static final int INCREMENTAL_IDLE= 1;
	public static final int INCREMENTAL_UPDATING= 3;
	public static final int INDEFINITE= -1;

	/**
	 * @throws IllegalArgumentException
	 */
    public Gauge(String label, boolean interactive, int maxValue, int initialValue) {super("");}

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     * @since MIDP 2.0
     */
    public void addCommand(Command cmd) {}

    public int getMaxValue() {
        return 0;
    }

    public int getValue() {
        return 0;
    }

    public boolean isInteractive() {
        return false;
    }

    /**
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setDefaultCommand(Command cmd) {}

    /**
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setItemCommandListener(ItemCommandListener l) {}

    /**
     * @throws IllegalStateException
     */
    public void setLabel(String label) {}

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setLayout(int layout) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setMaxValue(int maxValue) {}

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     * @since MIDP 2.0
     */
    public void setPreferredSize(int width, int height) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setValue(int value) {}

}
