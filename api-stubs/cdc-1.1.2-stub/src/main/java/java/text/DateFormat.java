package java.text;

public abstract class DateFormat extends Format {
    public final static int AM_PM_FIELD;
    public final static int DATE_FIELD;
    public final static int DAY_OF_WEEK_FIELD;
    public final static int DAY_OF_WEEK_IN_MONTH_FIELD;
    public final static int DAY_OF_YEAR_FIELD;
    public final static int DEFAULT;
    public final static int ERA_FIELD;
    public final static int FULL;
    public final static int HOUR0_FIELD;
    public final static int HOUR1_FIELD;
    public final static int HOUR_OF_DAY0_FIELD;
    public final static int HOUR_OF_DAY1_FIELD;
    public final static int LONG;
    public final static int MEDIUM;
    public final static int MILLISECOND_FIELD;
    public final static int MINUTE_FIELD;
    public final static int MONTH_FIELD;
    public final static int SECOND_FIELD;
    public final static int SHORT;
    public final static int TIMEZONE_FIELD;
    public final static int WEEK_OF_MONTH_FIELD;
    public final static int WEEK_OF_YEAR_FIELD;
    public final static int YEAR_FIELD;

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public final static DateFormat getDateInstance() {
        return null;
    }

    public final static DateFormat getDateInstance(int arg0) {
        return null;
    }

    public final static DateFormat getDateInstance(int arg0, Locale arg1) {
        return null;
    }

    public final static DateFormat getDateTimeInstance() {
        return null;
    }

    public final static DateFormat getDateTimeInstance(int arg0, int arg1) {
        return null;
    }

    public final static DateFormat getDateTimeInstance(int arg0, int arg1, Locale arg2) {
        return null;
    }

    public final static DateFormat getInstance() {
        return null;
    }

    public final static DateFormat getTimeInstance() {
        return null;
    }

    public final static DateFormat getTimeInstance(int arg0) {
        return null;
    }

    public final static DateFormat getTimeInstance(int arg0, Locale arg1) {
        return null;
    }


    protected Calendar calendar;
    protected NumberFormat numberFormat;

    protected DateFormat() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object arg0) {
        return false;
    }

    public final StringBuffer format(Object arg0, StringBuffer arg1, FieldPosition arg2) {
        return null;
    }

    public abstract StringBuffer format(Date arg0, StringBuffer arg1, FieldPosition arg2);

    public final String format(Date arg0) {
        return null;
    }

    public Calendar getCalendar() {
        return null;
    }

    public NumberFormat getNumberFormat() {
        return null;
    }

    public TimeZone getTimeZone() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isLenient() {
        return false;
    }

    public Date parse(String arg0) throws ParseException {
        return null;
    }

    public abstract Date parse(String arg0, ParsePosition arg1);

    public Object parseObject(String arg0, ParsePosition arg1) {
        return null;
    }

    public void setCalendar(Calendar arg0) {}

    public void setLenient(boolean arg0) {}

    public void setNumberFormat(NumberFormat arg0) {}

    public void setTimeZone(TimeZone arg0) {}

}
