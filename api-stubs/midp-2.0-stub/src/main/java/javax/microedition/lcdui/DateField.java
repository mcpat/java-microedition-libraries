package javax.microedition.lcdui;

import java.util.Date;
import java.util.TimeZone;

/**
 * @since MIDP 1.0
 */
public class DateField extends Item {
	public static final int DATE= 1;
	public static final int DATE_TIME= 3;
	public static final int TIME= 2;

	/**
	 * @throws IllegalArgumentException
	 */
    public DateField(String label, int mode) {super("");}
    
    /**
     * @throws IllegalArgumentException
     */
    public DateField(String label, int mode, TimeZone timeZone) {super("");}

    public Date getDate() {
        return null;
    }

    public int getInputMode() {
        return 0;
    }

    public void setDate(Date date) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setInputMode(int mode) {}

}
