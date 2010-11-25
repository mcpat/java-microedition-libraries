package java.text;

import java.io.Serializable;
import java.util.Locale;

public class DateFormatSymbols implements Serializable, Cloneable {
	
	/**
	 * @throws MissingResourceException
	 */
    public DateFormatSymbols() {}

    /**
     * @throws MissingResourceException
     */
    public DateFormatSymbols(Locale locale) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String[] getAmPmStrings() {
        return null;
    }

    public String[] getEras() {
        return null;
    }

    public String getLocalPatternChars() {
        return null;
    }

    public String[] getMonths() {
        return null;
    }

    public String[] getShortMonths() {
        return null;
    }

    public String[] getShortWeekdays() {
        return null;
    }

    public String[] getWeekdays() {
        return null;
    }

    public String[][] getZoneStrings() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public void setAmPmStrings(String[] newAmpms) {}

    public void setEras(String[] newEras) {}

    public void setLocalPatternChars(String newLocalPatternChars) {}

    public void setMonths(String[] newMonths) {}

    public void setShortMonths(String[] newShortMonths) {}

    public void setShortWeekdays(String[] newShortWeekdays) {}

    public void setWeekdays(String[] newWeekdays) {}

    public void setZoneStrings(String[][] newZoneStrings) {}

}
