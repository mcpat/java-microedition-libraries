package java.util;

public abstract class ResourceBundle {
    public final static ResourceBundle getBundle(String arg0) {
        return null;
    }

    public final static ResourceBundle getBundle(String arg0, Locale arg1) {
        return null;
    }

    public static ResourceBundle getBundle(String arg0, Locale arg1, ClassLoader arg2) {
        return null;
    }


    protected ResourceBundle parent;

    public ResourceBundle() {}

    public abstract Enumeration getKeys();

    public Locale getLocale() {
        return null;
    }

    public final Object getObject(String arg0) {
        return null;
    }

    public final String getString(String arg0) {
        return null;
    }

    public final String[] getStringArray(String arg0) {
        return null;
    }

    protected abstract Object handleGetObject(String arg0);

    protected void setParent(ResourceBundle arg0) {}

}
