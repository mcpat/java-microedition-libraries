package java.util;

public abstract class TimeZone {
    public static String[] getAvailableIDs() {
        return null;
    }

    public static TimeZone getDefault() {
        return null;
    }

    public static TimeZone getTimeZone(String ID) {
        return null;
    }


    public TimeZone() {}

    public String getID() {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public abstract int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis);

    public abstract int getRawOffset();

    public abstract boolean useDaylightTime();
}
