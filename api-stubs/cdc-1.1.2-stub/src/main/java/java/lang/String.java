package java.lang;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Locale;

public final class String implements Serializable, Comparable, CharSequence {
    public final static Comparator CASE_INSENSITIVE_ORDER;

    static {
    	CASE_INSENSITIVE_ORDER= null;
    }
    public static String copyValueOf(char[] data, int offset, int count) {
        return null;
    }

    public static String copyValueOf(char[] data) {
        return null;
    }

    public static String valueOf(Object obj) {
        return null;
    }

    public static String valueOf(char[] data) {
        return null;
    }

    /**
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
    public String(String original) {}
    public String(char[] value) {}
    /**
     * @throws IndexOutOfBoundsException
     */
    public String(char[] value, int offset, int count) {}
    /**
     * @throws UnsupportedEncodingException
     * @throws IndexOutOfBoundsException
     */
    public String(byte[] bytes, int offset, int length, String charsetName) throws UnsupportedEncodingException {}
    /**
     * @throws UnsupportedEncodingException
     */
    public String(byte[] bytes, String charsetName) throws UnsupportedEncodingException {}
    
    /**
     * @throws IndexOutOfBoundsException 
     */
    public String(byte[] bytes, int offset, int length) {}
    public String(byte[] bytes) {}
    public String(StringBuffer buffer) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public char charAt(int index) {
        return 0;
    }

    public int compareTo(String anotherString) {
        return 0;
    }

    public int compareTo(Object o) {
        return 0;
    }

    public int compareToIgnoreCase(String str) {
        return 0;
    }

    public String concat(String str) {
        return null;
    }

    public boolean contentEquals(StringBuffer sb) {
        return false;
    }

    public boolean endsWith(String suffix) {
        return false;
    }

    public boolean equals(Object anObject) {
        return false;
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return false;
    }

    /**
     * @throws UnsupportedEncodingException
     */
    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return null;
    }

    public byte[] getBytes() {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
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

    public int indexOf(String str) {
        return 0;
    }

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

    public int lastIndexOf(String str) {
        return 0;
    }

    public int lastIndexOf(String str, int fromIndex) {
        return 0;
    }

    public int length() {
        return 0;
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return false;
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return false;
    }

    public String replace(char oldChar, char newChar) {
        return null;
    }

    public boolean startsWith(String prefix, int toffset) {
        return false;
    }

    public boolean startsWith(String prefix) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public CharSequence subSequence(int beginIndex, int endIndex) {
        return null;
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

    public String toLowerCase(Locale locale) {
        return null;
    }

    public String toLowerCase() {
        return null;
    }

    public String toString() {
        return null;
    }

    public String toUpperCase(Locale locale) {
        return null;
    }

    public String toUpperCase() {
        return null;
    }

    public String trim() {
        return null;
    }

}
