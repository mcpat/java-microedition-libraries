package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class Command {
	public static final int BACK= 2;
	public static final int CANCEL= 3;
	public static final int EXIT= 7;
	public static final int HELP= 5;
	public static final int ITEM= 8;
	public static final int OK= 4;
	public static final int SCREEN= 1;
	public static final int STOP= 6;

	/**
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
    public Command(String label, int commandType, int priority) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public Command(String shortLabel, String longLabel, int commandType, int priority) {}

    public int getCommandType() {
        return 0;
    }

    public String getLabel() {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public String getLongLabel() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

}
