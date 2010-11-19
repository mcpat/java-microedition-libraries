package java.text;

public abstract class NumberFormat extends Format {
    public final static int FRACTION_FIELD;
    public final static int INTEGER_FIELD;

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public final static NumberFormat getCurrencyInstance() {
        return null;
    }

    public static NumberFormat getCurrencyInstance(Locale arg0) {
        return null;
    }

    public final static NumberFormat getInstance() {
        return null;
    }

    public static NumberFormat getInstance(Locale arg0) {
        return null;
    }

    public final static NumberFormat getIntegerInstance() {
        return null;
    }

    public static NumberFormat getIntegerInstance(Locale arg0) {
        return null;
    }

    public final static NumberFormat getNumberInstance() {
        return null;
    }

    public static NumberFormat getNumberInstance(Locale arg0) {
        return null;
    }

    public final static NumberFormat getPercentInstance() {
        return null;
    }

    public static NumberFormat getPercentInstance(Locale arg0) {
        return null;
    }


    public NumberFormat() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object arg0) {
        return false;
    }

    public final StringBuffer format(Object arg0, StringBuffer arg1, FieldPosition arg2) {
        return null;
    }

    public final String format(double arg0) {
        return null;
    }

    public final String format(long arg0) {
        return null;
    }

    public abstract StringBuffer format(double arg0, StringBuffer arg1, FieldPosition arg2);

    public abstract StringBuffer format(long arg0, StringBuffer arg1, FieldPosition arg2);

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

    public abstract Number parse(String arg0, ParsePosition arg1);

    public Number parse(String arg0) throws ParseException {
        return null;
    }

    public final Object parseObject(String arg0, ParsePosition arg1) {
        return null;
    }

    public void setCurrency(Currency arg0) {}

    public void setGroupingUsed(boolean arg0) {}

    public void setMaximumFractionDigits(int arg0) {}

    public void setMaximumIntegerDigits(int arg0) {}

    public void setMinimumFractionDigits(int arg0) {}

    public void setMinimumIntegerDigits(int arg0) {}

    public void setParseIntegerOnly(boolean arg0) {}

}
