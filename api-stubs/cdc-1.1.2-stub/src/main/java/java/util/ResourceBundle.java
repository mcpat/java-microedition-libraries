package java.util;

public abstract class ResourceBundle {
    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     */
    public final static ResourceBundle getBundle(String baseName) {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     */
    public final static ResourceBundle getBundle(String baseName, Locale locale) {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     */
    public static ResourceBundle getBundle(String baseName, Locale locale, ClassLoader loader) {
        return null;
    }


    protected ResourceBundle parent;

    public ResourceBundle() {}

    public abstract Enumeration getKeys();

    public Locale getLocale() {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     */
    public final Object getObject(String key) {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     * @throws ClassCastException
     */
    public final String getString(String key) {
        return null;
    }

    /**
     * @throws NullPointerException
     * @throws MissingResourceException
     * @throws ClassCastException
     */
    public final String[] getStringArray(String key) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    protected abstract Object handleGetObject(String key);

    protected void setParent(ResourceBundle parent) {}

}
