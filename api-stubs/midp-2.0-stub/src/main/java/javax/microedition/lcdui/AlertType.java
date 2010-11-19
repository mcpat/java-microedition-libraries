package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class AlertType {
	public final static AlertType ALARM;
	public final static AlertType CONFIRMATION;
	public final static AlertType ERROR;
	public final static AlertType INFO;
	public final static AlertType WARNING;
	static {
		ALARM= new AlertType();
		CONFIRMATION= new AlertType();
		ERROR= new AlertType();
		INFO= new AlertType();
		WARNING= new AlertType();
	}

    protected AlertType() {}

    /**
     * @throws NullPointerException
     */
    public boolean playSound(Display display) {
        return false;
    }

}
