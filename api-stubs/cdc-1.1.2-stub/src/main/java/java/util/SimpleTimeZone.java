package java.util;

public class SimpleTimeZone extends TimeZone {
    public final static int STANDARD_TIME= 1;
    public final static int UTC_TIME= 2;
    public final static int WALL_TIME= 0;

    public SimpleTimeZone(int rawOffset, String ID) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime, int dstSavings) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int startTimeMode, int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int dstSavings) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public int getDSTSavings() {
        return 0;
    }

    public int getOffset(long date) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) {
        return 0;
    }

    public int getRawOffset() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean hasSameRules(TimeZone other) {
        return false;
    }

    public boolean inDaylightTime(Date date) {
        return false;
    }

    public void setDSTSavings(int millisSavedDuringDST) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setEndRule(int endMonth, int endDay, int endTime) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime, boolean after) {}

    public void setRawOffset(int offsetMillis) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setStartRule(int startMonth, int startDay, int startTime) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime, boolean after) {}

    public void setStartYear(int year) {}

    public String toString() {
        return null;
    }

    public boolean useDaylightTime() {
        return false;
    }

}
