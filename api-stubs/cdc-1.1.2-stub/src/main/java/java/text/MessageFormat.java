package java.text;

import java.io.InvalidObjectException;
import java.util.Locale;

public class MessageFormat extends Format {
	public static class Field extends Format.Field {
	    public final static Field ARGUMENT;

	    static {
	    	ARGUMENT= new Field(null);
	    }
	    
	    protected Field(String name) {super(null);}

	    protected Object readResolve() throws InvalidObjectException {
	        return null;
	    }

	}
    /**
     * @throws IllegalArgumentException
     */
    public static String format(String arg0, Object[] arg1) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public MessageFormat(String pattern) {}

    /**
     * @throws IllegalArgumentException
     */
    public MessageFormat(String pattern, Locale locale) {}

    /**
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
     * @throws IllegalArgumentException
     */
    public final StringBuffer format(Object[] arguments, StringBuffer result, FieldPosition pos) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public final StringBuffer format(Object arguments, StringBuffer result, FieldPosition pos) {
        return null;
    }

    /**
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public AttributedCharacterIterator formatToCharacterIterator(Object arguments) {
        return null;
    }

    public Format[] getFormats() {
        return null;
    }

    public Format[] getFormatsByArgumentIndex() {
        return null;
    }

    public Locale getLocale() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public Object[] parse(String source, ParsePosition pos) {
        return null;
    }

    /**
     * @throws ParseException
     */
    public Object[] parse(String source) throws ParseException {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public Object parseObject(String source, ParsePosition pos) {
        return null;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     */
    public void setFormat(int formatElementIndex, Format newFormat) {}

    public void setFormatByArgumentIndex(int argumentIndex, Format newFormat) {}

    /**
     * @throws NullPointerException
     */
    public void setFormats(Format[] newFormats) {}

    /**
     * @throws NullPointerException
     */
    public void setFormatsByArgumentIndex(Format[] newFormats) {}

    public void setLocale(Locale locale) {}

    public String toPattern() {
        return null;
    }

}
