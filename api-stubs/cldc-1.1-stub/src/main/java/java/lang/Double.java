package java.lang;

/**
 * @since CLDC 1.1
 */
public final class Double {
    public final static double MAX_VALUE= 1.7976931348623157E308d;
    public final static double MIN_VALUE= Double.longBitsToDouble(0x1L);
    public final static double NaN= 0d/0d;
    public final static double NEGATIVE_INFINITY= -1d/0d;
    public final static double POSITIVE_INFINITY= 1d/0d;

    public static long doubleToLongBits(double value) {
        return 0;
    }

    public static boolean isInfinite(double v) {
        return false;
    }

    public static boolean isNaN(double v) {
        return false;
    }

    public static double longBitsToDouble(long bits) {
        return 0;
    }

    /**
     * @throws NumberFormatException
     */
    public static double parseDouble(String s) throws NumberFormatException {
        return 0;
    }

    public static String toString(double d) {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public static Double valueOf(String s) throws NumberFormatException {
        return null;
    }


    public Double(double value) {}

    public byte byteValue() {
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
