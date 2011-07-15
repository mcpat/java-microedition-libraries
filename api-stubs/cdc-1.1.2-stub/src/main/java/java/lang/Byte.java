package java.lang;

public final class Byte extends Number implements Comparable {
    public final static byte MAX_VALUE= 127;
    public final static byte MIN_VALUE= -128;
    public final static Class TYPE;
    
	static {
		TYPE= new Object().getClass();
	}

    /**
     * @throws NumberFormatException
     */
    public static Byte decode(String nm) throws NumberFormatException {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public static byte parseByte(String s) throws NumberFormatException {
        return 0;
    }

    /**
     * @throws NumberFormatException
     */
    public static byte parseByte(String s, int radix) throws NumberFormatException {
        return 0;
    }

    public static String toString(byte b) {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public static Byte valueOf(String s, int radix) throws NumberFormatException {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public static Byte valueOf(String s) throws NumberFormatException {
        return null;
    }

    public Byte(byte value) {}

    /**
     * @throws NumberFormatException
     */
    public Byte(String s) throws NumberFormatException {}

    public byte byteValue() {
        return 0;
    }

    public int compareTo(Byte anotherByte) {
        return 0;
    }

    public int compareTo(Object o) {
        return 0;
    }

    public double doubleValue() {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public float floatValue() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public int intValue() {
        return 0;
    }

    public long longValue() {
        return 0;
    }

    public short shortValue() {
        return 0;
    }

    public String toString() {
        return null;
    }

}
