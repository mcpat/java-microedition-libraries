package java.lang;

import java.io.UnsupportedEncodingException;

/**
 * @since CLDC 1.0
 */
public final class String {
    public static String valueOf(Object obj) {
        return null;
    }

    public static String valueOf(char[] data) {
        return null;
    }

    /**
     * @throws NullPointerException  
     * @throws IndexOutOfBoundsException 
     */
    public static String valueOf(char[] data, int offset, int count) {
        return null;
    }

    public static String valueOf(boolean b) {
        return null;
    }

    public static String valueOf(char c) {
        return null;
    }

    public static String valueOf(int i) {
        return null;
    }

    public static String valueOf(long l) {
        return null;
    }

    public static String valueOf(float f) {
        return null;
    }

    public static String valueOf(double d) {
        return null;
    }


    public String() {}
    
    /**
     * @throws NullPointerException
     */
    public String(String value) {}
    public String(char[] value) {}
    
    /**
     * @throws IndexOutOfBoundsException 
     * @throws NullPointerException
     */
    public String(char[] value, int offset, int count) {}

    /**
     * @throws UnsupportedEncodingException
     */
    public String(byte[] bytes, int off, int len, String enc) throws UnsupportedEncodingException {}
    
    /**
     * @throws UnsupportedEncodingException
     */
    public String(byte[] bytes, String enc) throws UnsupportedEncodingException {}
    public String(byte[] bytes, int off, int len) {}
    public String(byte[] bytes) {}
    
    /**
     * @throws NullPointerException
     */
    public String(StringBuffer buffer) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public char charAt(int index) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int compareTo(String anotherString) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public String concat(String str) {
        return null;
    }
    
    /**
     * @throws NullPointerException
     */
    public boolean endsWith(String suffix) {
        return false;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return false;
    }

    /**
     * @throws UnsupportedEncodingException
     */
    public byte[] getBytes(String enc) throws UnsupportedEncodingException {
        return null;
    }

    public byte[] getBytes() {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException
     */
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {}

    public int hashCode() {
        return 0;
    }

    public int indexOf(int ch) {
        return 0;
    }

    public int indexOf(int ch, int fromIndex) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int indexOf(String str) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int indexOf(String str, int fromIndex) {
        return 0;
    }

    public String intern() {
        return null;
    }

    public int lastIndexOf(int ch) {
        return 0;
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return 0;
    }

    public int length() {
        return 0;
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return false;
    }

    public String replace(char oldChar, char newChar) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public boolean startsWith(String prefix, int toffset) {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean startsWith(String prefix) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public String substring(int beginIndex) {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public String substring(int beginIndex, int endIndex) {
        return null;
    }

    public char[] toCharArray() {
        return null;
    }

    public String toLowerCase() {
        return null;
    }

    public String toString() {
        return null;
    }

    public String toUpperCase() {
        return null;
    }

    public String trim() {
        return null;
    }

}
