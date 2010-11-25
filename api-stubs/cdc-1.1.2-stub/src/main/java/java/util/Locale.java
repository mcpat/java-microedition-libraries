package java.util;

import java.io.Serializable;

public final class Locale implements Cloneable, Serializable {
    public final static Locale CANADA;
    public final static Locale CANADA_FRENCH;
    public final static Locale CHINA;
    public final static Locale CHINESE;
    public final static Locale ENGLISH;
    public final static Locale FRANCE;
    public final static Locale FRENCH;
    public final static Locale GERMAN;
    public final static Locale GERMANY;
    public final static Locale ITALIAN;
    public final static Locale ITALY;
    public final static Locale JAPAN;
    public final static Locale JAPANESE;
    public final static Locale KOREA;
    public final static Locale KOREAN;
    public final static Locale PRC;
    public final static Locale SIMPLIFIED_CHINESE;
    public final static Locale TAIWAN;
    public final static Locale TRADITIONAL_CHINESE;
    public final static Locale UK;
    public final static Locale US;
    
    static {
        CANADA= CANADA_FRENCH= CHINA= CHINESE= ENGLISH= FRANCE= FRENCH=
        GERMAN= GERMANY= ITALIAN= ITALY= JAPAN= JAPANESE= KOREA= KOREAN=
        PRC= SIMPLIFIED_CHINESE= TAIWAN= TRADITIONAL_CHINESE= UK= US= getDefault();
    }

    public static Locale[] getAvailableLocales() {
        return null;
    }

    public static Locale getDefault() {
        return null;
    }

    public static String[] getISOCountries() {
        return null;
    }

    public static String[] getISOLanguages() {
        return null;
    }

    /**
     * @throws SecurityException
     * @throws NullPointerException
     */
    public static void setDefault(Locale newLocale) {}

    
    /**
     * @throws NullPointerException
     */
    public Locale(String language, String country, String variant) {}
    
    /**
     * @throws NullPointerException
     */
    public Locale(String language, String country) {}
    
    /**
     * @throws NullPointerException
     */
    public Locale(String language) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String getCountry() {
        return null;
    }

    public final String getDisplayCountry() {
        return null;
    }

    public String getDisplayCountry(Locale inLocale) {
        return null;
    }

    public final String getDisplayLanguage() {
        return null;
    }

    public String getDisplayLanguage(Locale inLocale) {
        return null;
    }

    public final String getDisplayName() {
        return null;
    }

    public String getDisplayName(Locale inLocale) {
        return null;
    }

    public final String getDisplayVariant() {
        return null;
    }

    public String getDisplayVariant(Locale inLocale) {
        return null;
    }

    /**
     * @throws MissingResourceException
     */
    public String getISO3Country() throws MissingResourceException {
        return null;
    }

    /**
     * @throws MissingResourceException
     */
    public String getISO3Language() throws MissingResourceException {
        return null;
    }

    public String getLanguage() {
        return null;
    }

    public String getVariant() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public final String toString() {
        return null;
    }

}
