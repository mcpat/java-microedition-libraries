package java.lang;

import java.io.Serializable;

public final class StringBuffer implements Serializable, CharSequence {
    public StringBuffer() {}
    
    /**
     * @throws NegativeArraySizeException
     */
    public StringBuffer(int length) {}
    
    /**
     * @throws NullPointerException
     */
    public StringBuffer(String str) {}

    public StringBuffer append(Object obj) {
        return null;
    }

    public StringBuffer append(String str) {
        return null;
    }

    public StringBuffer append(StringBuffer sb) {
        return null;
    }

    public StringBuffer append(char[] str) {
        return null;
    }

    public StringBuffer append(char[] str, int offset, int len) {
        return null;
    }

    public StringBuffer append(boolean b) {
        return null;
    }

    public StringBuffer append(char c) {
        return null;
    }

    public StringBuffer append(int i) {
        return null;
    }

    public StringBuffer append(long l) {
        return null;
    }

    public StringBuffer append(float f) {
        return null;
    }

    public StringBuffer append(double d) {
        return null;
    }

    public int capacity() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public char charAt(int index) {
        return 0;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer delete(int start, int end) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer deleteCharAt(int index) {
        return null;
    }

    public void ensureCapacity(int minimumCapacity) {}

    /**
     * @throws NullPointerException 
     * @throws IndexOutOfBoundsException
     */
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {}

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

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int index, char[] str, int offset, int len) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, Object obj) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, String str) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, char[] str) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, boolean b) {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, char c) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, int i) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, long l) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, float f) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer insert(int offset, double d) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public int lastIndexOf(String str) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int lastIndexOf(String str, int fromIndex) {
        return 0;
    }

    public int length() {
        return 0;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public StringBuffer replace(int start, int end, String str) {
        return null;
    }

    public StringBuffer reverse() {
        return null;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setCharAt(int index, char ch) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void setLength(int newLength) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public String substring(int start) {
        return null;
    }

    /**
     * @throws StringIndexOutOfBoundsException
     */
    public String substring(int start, int end) {
        return null;
    }

    public String toString() {
        return null;
    }

}
