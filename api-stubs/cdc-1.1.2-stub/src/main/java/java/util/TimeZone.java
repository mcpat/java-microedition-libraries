package java.util;

import java.io.Serializable;

public abstract class TimeZone implements Serializable, Cloneable {
    public final static int LONG= 1;
    public final static int SHORT= 0;

    public static String[] getAvailableIDs(int rawOffset) {
        return null;
    }

    public static String[] getAvailableIDs() {
        return null;
    }

    public static TimeZone getDefault() {
        return null;
    }

    public static TimeZone getTimeZone(String ID) {
        return null;
    }

    public static void setDefault(TimeZone zone) {}


    public TimeZone() {}

    public Object clone() {
        return null;
    }

    public final String getDisplayName() {
        return null;
    }

    public final String getDisplayName(Locale locale) {
        return null;
    }

    public final String getDisplayName(boolean daylight, int style) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public String getDisplayName(boolean daylight, int style, Locale locale) {
        return null;
    }

    public int getDSTSavings() {
        return 0;
    }

    public String getID() {
        return null;
    }

    public abstract int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds);

    public int getOffset(long date) {
        return 0;
    }

    public abstract int getRawOffset();

    public boolean hasSameRules(TimeZone other) {
        return false;
    }

    public abstract boolean inDaylightTime(Date date);

    public void setID(String ID) {}

    public abstract void setRawOffset(int offsetMillis);

    public abstract boolean useDaylightTime();

}
