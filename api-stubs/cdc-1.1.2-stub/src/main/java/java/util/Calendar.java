package java.util;

public abstract class Calendar implements Serializable, Cloneable {
    public final static int AM;
    public final static int AM_PM;
    public final static int APRIL;
    public final static int AUGUST;
    public final static int DATE;
    public final static int DAY_OF_MONTH;
    public final static int DAY_OF_WEEK;
    public final static int DAY_OF_WEEK_IN_MONTH;
    public final static int DAY_OF_YEAR;
    public final static int DECEMBER;
    public final static int DST_OFFSET;
    public final static int ERA;
    public final static int FEBRUARY;
    public final static int FIELD_COUNT;
    public final static int FRIDAY;
    public final static int HOUR;
    public final static int HOUR_OF_DAY;
    public final static int JANUARY;
    public final static int JULY;
    public final static int JUNE;
    public final static int MARCH;
    public final static int MAY;
    public final static int MILLISECOND;
    public final static int MINUTE;
    public final static int MONDAY;
    public final static int MONTH;
    public final static int NOVEMBER;
    public final static int OCTOBER;
    public final static int PM;
    public final static int SATURDAY;
    public final static int SECOND;
    public final static int SEPTEMBER;
    public final static int SUNDAY;
    public final static int THURSDAY;
    public final static int TUESDAY;
    public final static int UNDECIMBER;
    public final static int WEDNESDAY;
    public final static int WEEK_OF_MONTH;
    public final static int WEEK_OF_YEAR;
    public final static int YEAR;
    public final static int ZONE_OFFSET;

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public static Calendar getInstance() {
        return null;
    }

    public static Calendar getInstance(TimeZone arg0) {
        return null;
    }

    public static Calendar getInstance(Locale arg0) {
        return null;
    }

    public static Calendar getInstance(TimeZone arg0, Locale arg1) {
        return null;
    }


    protected boolean areFieldsSet;
    protected int[] fields;
    protected boolean[] isSet;
    protected boolean isTimeSet;
    protected long time;

    protected Calendar() {}
    protected Calendar(TimeZone arg0, Locale arg1) {}

    public abstract void add(int arg0, int arg1);

    public boolean after(Object arg0) {
        return false;
    }

    public boolean before(Object arg0) {
        return false;
    }

    public final void clear() {}

    public final void clear(int arg0) {}

    public Object clone() {
        return null;
    }

    protected void complete() {}

    protected abstract void computeFields();

    protected abstract void computeTime();

    public boolean equals(Object arg0) {
        return false;
    }

    public int get(int arg0) {
        return 0;
    }

    public int getActualMaximum(int arg0) {
        return 0;
    }

    public int getActualMinimum(int arg0) {
        return 0;
    }

    public int getFirstDayOfWeek() {
        return 0;
    }

    public abstract int getGreatestMinimum(int arg0);

    public abstract int getLeastMaximum(int arg0);

    public abstract int getMaximum(int arg0);

    public int getMinimalDaysInFirstWeek() {
        return 0;
    }

    public abstract int getMinimum(int arg0);

    public final Date getTime() {
        return null;
    }

    public long getTimeInMillis() {
        return 0;
    }

    public TimeZone getTimeZone() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    protected final int internalGet(int arg0) {
        return 0;
    }

    public boolean isLenient() {
        return false;
    }

    public final boolean isSet(int arg0) {
        return false;
    }

    public abstract void roll(int arg0, boolean arg1);

    public void roll(int arg0, int arg1) {}

    public void set(int arg0, int arg1) {}

    public final void set(int arg0, int arg1, int arg2) {}

    public final void set(int arg0, int arg1, int arg2, int arg3, int arg4) {}

    public final void set(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {}

    public void setFirstDayOfWeek(int arg0) {}

    public void setLenient(boolean arg0) {}

    public void setMinimalDaysInFirstWeek(int arg0) {}

    public final void setTime(Date arg0) {}

    public void setTimeInMillis(long arg0) {}

    public void setTimeZone(TimeZone arg0) {}

    public String toString() {
        return null;
    }

}
