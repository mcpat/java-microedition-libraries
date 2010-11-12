package java.lang;

/**
 * @since CLDC 1.0
 */
public class Character {
    public final static int MAX_RADIX= 36;
    public final static char MAX_VALUE= 65535;
    public final static int MIN_RADIX= 2;
    public final static char MIN_VALUE= 0;
    
    public static int digit(char ch, int radix) {
        return -1;
    }
    
    public static boolean isDigit(char ch) {
        return false;
    }
    
    public static boolean isLowerCase(char ch) {
        return false;
    }
    
    public static boolean isUpperCase(char ch) {
        return false;
    }
    
    public static char toLowerCase(char ch) {
        return 0;
    }
    
    public static char toUpperCase(char ch) {
        return 0;
    }
    
    
    public Character(char value) {}
    
    public char charValue() {
        return 0;
    }
    
    public boolean equals(Object obj) {
        return false;
    }
    
    public int hashCode() {
        return -1;
    }
    
    public String toString() {
        return null;
    }
}
