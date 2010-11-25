package java.text;

import java.io.InvalidObjectException;
import java.util.Currency;
import java.util.Locale;

public abstract class NumberFormat extends Format {
	public static class Field extends Format.Field {
		static {
			CURRENCY= new NumberFormat.Field(""); 
			DECIMAL_SEPARATOR= new NumberFormat.Field(""); 
			EXPONENT= new NumberFormat.Field(""); 
			EXPONENT_SIGN= new NumberFormat.Field(""); 
			EXPONENT_SYMBOL= new NumberFormat.Field(""); 
			FRACTION= new NumberFormat.Field(""); 
			GROUPING_SEPARATOR= new NumberFormat.Field(""); 
			INTEGER= new NumberFormat.Field(""); 
			PERCENT= new NumberFormat.Field(""); 
			PERMILLE= new NumberFormat.Field(""); 
			SIGN= new NumberFormat.Field(""); 
		}
		
	    public final static Field CURRENCY;
	    public final static Field DECIMAL_SEPARATOR;
	    public final static Field EXPONENT;
	    public final static Field EXPONENT_SIGN;
	    public final static Field EXPONENT_SYMBOL;
	    public final static Field FRACTION;
	    public final static Field GROUPING_SEPARATOR;
	    public final static Field INTEGER;
	    public final static Field PERCENT;
	    public final static Field PERMILLE;
	    public final static Field SIGN;

	    
	    protected Field(String name) {super(null);}

	    /**
	     * @throws InvalidObjectException
	     */
	    protected Object readResolve() throws InvalidObjectException {
	        return null;
	    }

	}
	
	public static final int FRACTION_FIELD= 1;
	public static final int INTEGER_FIELD= 0;

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public final static NumberFormat getCurrencyInstance() {
        return null;
    }

    public static NumberFormat getCurrencyInstance(Locale inLocale) {
        return null;
    }

    public final static NumberFormat getInstance() {
        return null;
    }

    public static NumberFormat getInstance(Locale inLocale) {
        return null;
    }

    public final static NumberFormat getIntegerInstance() {
        return null;
    }

    public static NumberFormat getIntegerInstance(Locale inLocale) {
        return null;
    }

    public final static NumberFormat getNumberInstance() {
        return null;
    }

    public static NumberFormat getNumberInstance(Locale inLocale) {
        return null;
    }

    public final static NumberFormat getPercentInstance() {
        return null;
    }

    public static NumberFormat getPercentInstance(Locale inLocale) {
        return null;
    }


    public NumberFormat() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @throws IllegalArgumentException
     */
    public final StringBuffer format(Object number, StringBuffer toAppendTo, FieldPosition pos) {
        return null;
    }

    public final String format(double number) {
        return null;
    }

    public final String format(long number) {
        return null;
    }

    public abstract StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition pos);

    public abstract StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition pos);

    /**
     * @throws UnsupportedOperationException
     */
    public Currency getCurrency() {
        return null;
    }

    public int getMaximumFractionDigits() {
        return 0;
    }

    public int getMaximumIntegerDigits() {
        return 0;
    }

    public int getMinimumFractionDigits() {
        return 0;
    }

    public int getMinimumIntegerDigits() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isGroupingUsed() {
        return false;
    }

    public boolean isParseIntegerOnly() {
        return false;
    }

    public abstract Number parse(String source, ParsePosition parsePosition);

    /**
     * @throws ParseException
     */
    public Number parse(String source) throws ParseException {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public final Object parseObject(String source, ParsePosition pos) {
        return null;
    }

    /**
     * @throws UnsupportedOperationException 
     * @throws NullPointerException
     */
    public void setCurrency(Currency currency) {}

    public void setGroupingUsed(boolean newValue) {}

    public void setMaximumFractionDigits(int newValue) {}

    public void setMaximumIntegerDigits(int newValue) {}

    public void setMinimumFractionDigits(int newValue) {}

    public void setMinimumIntegerDigits(int newValue) {}

    public void setParseIntegerOnly(boolean value) {}

}
