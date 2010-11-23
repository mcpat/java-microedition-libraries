package java.lang;

public final class Float extends Number implements Comparable {
	public static final float MAX_VALUE= 3.4028234663852886E38f;
	public static final float MIN_VALUE= 1.401298464324817E-45f;
	public static final float NaN= 0f/0f;
	public static final float NEGATIVE_INFINITY= -1f/0f;
	public static final float POSITIVE_INFINITY= 1f/0f;
	public final static Class TYPE;

	static {
		TYPE= null;
	}
    public static int compare(float f1, float f2) {
        return 0;
    }

    public static int floatToIntBits(float value) {
        return 0;
    }

    public static int floatToRawIntBits(float value) {
        return 0;
    }

    public static float intBitsToFloat(int bits) {
        return 0;
    }

    public static boolean isInfinite(float v) {
        return false;
    }

    public static boolean isNaN(float v) {
        return false;
    }

    /**
     * @throws NumberFormatException
     */
    public static float parseFloat(String s) throws NumberFormatException {
        return 0;
    }

    public static String toString(float f) {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public static Float valueOf(String s) throws NumberFormatException {
        return null;
    }


    public Float(float value) {}
    public Float(double value) {}
    
    /**
     * @throws NumberFormatException
     */
    public Float(String s) throws NumberFormatException {}

    public byte byteValue() {
        return 0;
    }

    public int compareTo(Float anotherFloat) {
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

    public boolean isInfinite() {
        return false;
    }

    public boolean isNaN() {
        return false;
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
