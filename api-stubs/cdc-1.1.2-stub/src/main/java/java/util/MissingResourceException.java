package java.util;

public class MissingResourceException extends RuntimeException {
    public MissingResourceException(String s, String className, String key) {}

    public String getClassName() {
        return null;
    }

    public String getKey() {
        return null;
    }

}
