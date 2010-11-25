package java.text;

import java.io.InvalidObjectException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public abstract class DateFormat extends Format {
	public static class Field extends Format.Field {
	    public final static Field AM_PM;
	    public final static Field DAY_OF_MONTH;
	    public final static Field DAY_OF_WEEK;
	    public final static Field DAY_OF_WEEK_IN_MONTH;
	    public final static Field DAY_OF_YEAR;
	    public final static Field ERA;
	    public final static Field HOUR0;
	    public final static Field HOUR1;
	    public final static Field HOUR_OF_DAY0;
	    public final static Field HOUR_OF_DAY1;
	    public final static Field MILLISECOND;
	    public final static Field MINUTE;
	    public final static Field MONTH;
	    public final static Field SECOND;
	    public final static Field TIME_ZONE;
	    public final static Field WEEK_OF_MONTH;
	    public final static Field WEEK_OF_YEAR;
	    public final static Field YEAR;

	    
	    static {
			AM_PM= new Field("", 0);
			DAY_OF_MONTH= new Field("", 0); 
			DAY_OF_WEEK= new Field("", 0); 
			DAY_OF_WEEK_IN_MONTH= new Field("", 0); 
			DAY_OF_YEAR= new Field("", 0); 
			ERA= new Field("", 0); 
			HOUR_OF_DAY0= new Field("", 0); 
			HOUR_OF_DAY1= new Field("", 0); 
			HOUR0= new Field("", 0); 
			HOUR1= new Field("", 0); 
			MILLISECOND= new Field("", 0); 
			MINUTE= new Field("", 0); 
			MONTH= new Field("", 0); 
			SECOND= new Field("", 0); 
			TIME_ZONE= new Field("", 0); 
			WEEK_OF_MONTH= new Field("", 0); 
			WEEK_OF_YEAR= new Field("", 0); 
			YEAR= new Field("", 0); 
		}
	    
	    /**
	     * @throws IllegalArgumentException
	     */
	    public static Field ofCalendarField(int calendarField) {
	        return null;
	    }


	    protected Field(String name, int calendarField) {super(null);}

	    public int getCalendarField() {
	        return 0;
	    }

	    /**
	     * @throws InvalidObjectException
	     */
	    protected Object readResolve() throws InvalidObjectException {
	        return null;
	    }
	}
	
	
	public static final int AM_PM_FIELD= 14;
	public static final int DATE_FIELD= 3;
	public static final int DAY_OF_WEEK_FIELD= 9;
	public static final int DAY_OF_WEEK_IN_MONTH_FIELD= 11;
	public static final int DAY_OF_YEAR_FIELD= 10;
	public static final int DEFAULT= 2;
	public static final int ERA_FIELD= 0;
	public static final int FULL= 0;
	public static final int HOUR_OF_DAY0_FIELD= 5;
	public static final int HOUR_OF_DAY1_FIELD= 4;
	public static final int HOUR0_FIELD= 16;
	public static final int HOUR1_FIELD= 15;
	public static final int LONG= 1;
	public static final int MEDIUM= 2;
	public static final int MILLISECOND_FIELD= 8;
	public static final int MINUTE_FIELD= 6;
	public static final int MONTH_FIELD= 2;
	public static final int SECOND_FIELD= 7;
	public static final int SHORT= 3;
	public static final int TIMEZONE_FIELD= 17;
	public static final int WEEK_OF_MONTH_FIELD= 13;
	public static final int WEEK_OF_YEAR_FIELD= 12;
	public static final int YEAR_FIELD= 1;

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public final static DateFormat getDateInstance() {
        return null;
    }

    public final static DateFormat getDateInstance(int style) {
        return null;
    }

    public final static DateFormat getDateInstance(int style, Locale aLocale) {
        return null;
    }

    public final static DateFormat getDateTimeInstance() {
        return null;
    }

    public final static DateFormat getDateTimeInstance(int dateStyle, int timeStyle) {
        return null;
    }

    public final static DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale) {
        return null;
    }

    public final static DateFormat getInstance() {
        return null;
    }

    public final static DateFormat getTimeInstance() {
        return null;
    }

    public final static DateFormat getTimeInstance(int style) {
        return null;
    }

    public final static DateFormat getTimeInstance(int style, Locale aLocale) {
        return null;
    }


    protected Calendar calendar;
    protected NumberFormat numberFormat;

    protected DateFormat() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public final StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition fieldPosition) {
        return null;
    }

    public abstract StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition);

    public final String format(Date date) {
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

    /**
     * @throws ParseException
     */
    public Date parse(String source) throws ParseException {
        return null;
    }

    public abstract Date parse(String source, ParsePosition pos);

    /**
     * @throws NullPointerException
     */
    public Object parseObject(String source, ParsePosition pos) {
        return null;
    }

    public void setCalendar(Calendar newCalendar) {}

    public void setLenient(boolean lenient) {}

    public void setNumberFormat(NumberFormat newNumberFormat) {}

    public void setTimeZone(TimeZone zone) {}

}
