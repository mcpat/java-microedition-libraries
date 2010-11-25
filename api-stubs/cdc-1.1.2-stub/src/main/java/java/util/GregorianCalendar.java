package java.util;

public class GregorianCalendar extends Calendar {
    public final static int AD= 1;
    public final static int BC= 0;

    public GregorianCalendar() {}
    public GregorianCalendar(TimeZone zone) {}
    public GregorianCalendar(Locale aLocale) {}
    public GregorianCalendar(TimeZone zone, Locale aLocale) {}
    public GregorianCalendar(int year, int month, int date) {}
    public GregorianCalendar(int year, int month, int date, int hour, int minute) {}
    public GregorianCalendar(int year, int month, int date, int hour, int minute, int second) {}

    /**
     * @throws IllegalArgumentException
     */
    public void add(int field, int amount) {}

    protected void computeFields() {}

    protected void computeTime() {}

    public boolean equals(Object obj) {
        return false;
    }

    public int getActualMaximum(int field) {
        return 0;
    }

    public int getActualMinimum(int field) {
        return 0;
    }

    public int getGreatestMinimum(int field) {
        return 0;
    }

    public final Date getGregorianChange() {
        return null;
    }

    public int getLeastMaximum(int field) {
        return 0;
    }

    public int getMaximum(int field) {
        return 0;
    }

    public int getMinimum(int field) {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isLeapYear(int year) {
        return false;
    }

    /**
     * @throws IllegalArgumentException
     */
    public void roll(int field, boolean up) {}

    public void roll(int field, int amount) {}

    public void setGregorianChange(Date date) {}

}
