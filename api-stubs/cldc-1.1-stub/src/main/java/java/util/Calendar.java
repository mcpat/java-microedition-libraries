package java.util;

public abstract class Calendar {
    public final static int AM= 0;
    public final static int AM_PM= 9;
    public final static int APRIL= 3;
    public final static int AUGUST= 7;
    public final static int DATE= 5;
    public final static int DAY_OF_MONTH= 5;
    public final static int DAY_OF_WEEK= 7;
    public final static int DECEMBER= 11;
    public final static int FEBRUARY= 1;
    public final static int FRIDAY= 6;
    public final static int HOUR= 10;
    public final static int HOUR_OF_DAY= 11;
    public final static int JANUARY= 0;
    public final static int JULY= 6;
    public final static int JUNE= 5;
    public final static int MARCH= 2;
    public final static int MAY= 4;
    public final static int MILLISECOND= 14;
    public final static int MINUTE= 12;
    public final static int MONDAY= 2;
    public final static int MONTH= 2;
    public final static int NOVEMBER= 10;
    public final static int OCTOBER= 9;
    public final static int PM= 1;
    public final static int SATURDAY= 7;
    public final static int SECOND= 13;
    public final static int SEPTEMBER= 8;
    public final static int SUNDAY= 1;
    public final static int THURSDAY= 5;
    public final static int TUESDAY= 3;
    public final static int WEDNESDAY= 4;
    public final static int YEAR= 1;

    public static Calendar getInstance() {
        return null;
    }

    public static Calendar getInstance(TimeZone zone) {
        return null;
    }

    protected int[] fields;
    protected boolean[] isSet;
    protected long time;

    protected Calendar() {}

    public boolean after(Object when) {
        return false;
    }

    public boolean before(Object when) {
        return false;
    }

    protected abstract void computeFields();

    protected abstract void computeTime();

    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public final int get(int field) {
        return 0;
    }

    public final Date getTime() {
        return null;
    }

    protected long getTimeInMillis() {
        return 0;
    }

    public TimeZone getTimeZone() {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public final void set(int field, int value) {}

    public final void setTime(Date date) {}

    protected void setTimeInMillis(long millis) {}

    public void setTimeZone(TimeZone value) {}
}
