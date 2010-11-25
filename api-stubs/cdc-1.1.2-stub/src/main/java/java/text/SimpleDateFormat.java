package java.text;

import java.util.Date;
import java.util.Locale;

public class SimpleDateFormat extends DateFormat {
    public SimpleDateFormat() {}
    
    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public SimpleDateFormat(String pattern) {}

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public SimpleDateFormat(String pattern, Locale locale) {}

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public SimpleDateFormat(String pattern, DateFormatSymbols formatSymbols) {}

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public void applyLocalizedPattern(String pattern) {}

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public void applyPattern(String pattern) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos) {
        return null;
    }

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        return null;
    }

    public Date get2DigitYearStart() {
        return null;
    }

    public DateFormatSymbols getDateFormatSymbols() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws NullPointerException 
     */
    public Date parse(String text, ParsePosition pos) {
        return null;
    }

    public void set2DigitYearStart(Date startDate) {}

    /**
     * @throws NullPointerException 
     */
    public void setDateFormatSymbols(DateFormatSymbols newFormatSymbols) {}

    public String toLocalizedPattern() {
        return null;
    }

    public String toPattern() {
        return null;
    }

}
