package java.text;

public class ChoiceFormat extends NumberFormat {
    public final static double nextDouble(double d) {
        return 0;
    }

    public static double nextDouble(double d, boolean positive) {
        return 0;
    }

    public final static double previousDouble(double d) {
        return 0;
    }


    public ChoiceFormat(String newPattern) {}
    public ChoiceFormat(double[] limits, String[] formats) {}

    public void applyPattern(String newPattern) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public StringBuffer format(long number, StringBuffer toAppendTo, FieldPosition status) {
        return null;
    }

    public StringBuffer format(double number, StringBuffer toAppendTo, FieldPosition status) {
        return null;
    }

    public Object[] getFormats() {
        return null;
    }

    public double[] getLimits() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public Number parse(String text, ParsePosition status) {
        return null;
    }

    public void setChoices(double[] limits, String[] formats) {}

    public String toPattern() {
        return null;
    }

}
