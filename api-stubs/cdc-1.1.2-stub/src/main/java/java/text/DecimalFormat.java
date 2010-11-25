package java.text;

import java.util.Currency;

public class DecimalFormat extends NumberFormat {
    public DecimalFormat() {}
    
    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException 
     */
    public DecimalFormat(String pattern) {}

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException 
     */
    public DecimalFormat(String pattern, DecimalFormatSymbols symbols) {}

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

    public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition) {
        return null;
    }

    public StringBuffer format(long number, StringBuffer result, FieldPosition fieldPosition) {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException 
     */
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        return null;
    }

    public Currency getCurrency() {
        return null;
    }

    public DecimalFormatSymbols getDecimalFormatSymbols() {
        return null;
    }

    public int getGroupingSize() {
        return 0;
    }

    public int getMultiplier() {
        return 0;
    }

    public String getNegativePrefix() {
        return null;
    }

    public String getNegativeSuffix() {
        return null;
    }

    public String getPositivePrefix() {
        return null;
    }

    public String getPositiveSuffix() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isDecimalSeparatorAlwaysShown() {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public Number parse(String text, ParsePosition pos) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public void setCurrency(Currency currency) {}

    public void setDecimalFormatSymbols(DecimalFormatSymbols newSymbols) {}

    public void setDecimalSeparatorAlwaysShown(boolean newValue) {}

    public void setGroupingSize(int newValue) {}

    public void setMaximumFractionDigits(int newValue) {}

    public void setMaximumIntegerDigits(int newValue) {}

    public void setMinimumFractionDigits(int newValue) {}

    public void setMinimumIntegerDigits(int newValue) {}

    public void setMultiplier(int newValue) {}

    public void setNegativePrefix(String newValue) {}

    public void setNegativeSuffix(String newValue) {}

    public void setPositivePrefix(String newValue) {}

    public void setPositiveSuffix(String newValue) {}

    public String toLocalizedPattern() {
        return null;
    }

    public String toPattern() {
        return null;
    }

}
