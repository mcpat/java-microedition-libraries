package java.text;

import java.io.Serializable;
import java.util.Currency;
import java.util.Locale;

public final class DecimalFormatSymbols implements Cloneable, Serializable {
    public DecimalFormatSymbols() {}
    
    /**
     * @throws NullPointerException
     */
    public DecimalFormatSymbols(Locale locale) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public Currency getCurrency() {
        return null;
    }

    public String getCurrencySymbol() {
        return null;
    }

    public char getDecimalSeparator() {
        return 0;
    }

    public char getDigit() {
        return 0;
    }

    public char getGroupingSeparator() {
        return 0;
    }

    public String getInfinity() {
        return null;
    }

    public String getInternationalCurrencySymbol() {
        return null;
    }

    public char getMinusSign() {
        return 0;
    }

    public char getMonetaryDecimalSeparator() {
        return 0;
    }

    public String getNaN() {
        return null;
    }

    public char getPatternSeparator() {
        return 0;
    }

    public char getPercent() {
        return 0;
    }

    public char getPerMill() {
        return 0;
    }

    public char getZeroDigit() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public void setCurrency(Currency currency) {}

    public void setCurrencySymbol(String currency) {}

    public void setDecimalSeparator(char decimalSeparator) {}

    public void setDigit(char digit) {}

    public void setGroupingSeparator(char groupingSeparator) {}

    public void setInfinity(String infinity) {}

    public void setInternationalCurrencySymbol(String currencyCode) {}

    public void setMinusSign(char minusSign) {}

    public void setMonetaryDecimalSeparator(char sep) {}

    public void setNaN(String NaN) {}

    public void setPatternSeparator(char patternSeparator) {}

    public void setPercent(char percent) {}

    public void setPerMill(char perMill) {}

    public void setZeroDigit(char zeroDigit) {}

}
