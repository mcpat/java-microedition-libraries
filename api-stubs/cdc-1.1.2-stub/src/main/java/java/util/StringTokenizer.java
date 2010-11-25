package java.util;

public class StringTokenizer implements Enumeration {
    public StringTokenizer(String str, String delim, boolean returnDelims) {}
    public StringTokenizer(String str, String delim) {}
    public StringTokenizer(String str) {}

    public int countTokens() {
        return 0;
    }

    public boolean hasMoreElements() {
        return false;
    }

    public boolean hasMoreTokens() {
        return false;
    }

    /**
     * @throws NoSuchElementException
     */
    public Object nextElement() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public String nextToken() {
        return null;
    }

    /**
     * @throws NoSuchElementException
     */
    public String nextToken(String delim) {
        return null;
    }

}
