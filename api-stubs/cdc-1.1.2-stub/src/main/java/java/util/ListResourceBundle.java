package java.util;

public abstract class ListResourceBundle extends ResourceBundle {
    public ListResourceBundle() {}

    protected abstract Object[][] getContents();

    public Enumeration getKeys() {
        return null;
    }

    public final Object handleGetObject(String arg0) {
        return null;
    }

}
