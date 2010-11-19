package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class TextField extends Item {
    public static final int ANY= 0;
    public static final int CONSTRAINT_MASK = 0xFFFF;
    public static final int DECIMAL = 5;
    public static final int EMAILADDR= 1;
    public static final int INITIAL_CAPS_SENTENCE= 0x200000;
    public static final int INITIAL_CAPS_WORD= 0x100000;
    public static final int NON_PREDICTIVE= 0x80000;
    public static final int NUMERIC = 2;
    public static final int PASSWORD = 0x10000;
    public static final int PHONENUMBER= 3;
    public static final int SENSITIVE= 0x40000;
    public static final int UNEDITABLE= 0x20000;
    public static final int URL= 4;
    
    /**
     * @throws IllegalArgumentException
     */
    public TextField(String label, String text, int maxSize, int constraints) {super("");}

    /**
     * @throws IllegalArgumentException
     * @throws StringIndexOutOfBoundsException
     */
    public void delete(int offset, int length) {}

    public int getCaretPosition() {
        return 0;
    }

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws NullPointerException
     */
    public int getChars(char[] data) {
        return 0;
    }

    public int getConstraints() {
        return 0;
    }

    public int getMaxSize() {
        return 0;
    }

    public String getString() {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void insert(String src, int position) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public void insert(char[] data, int offset, int length, int position) {}

    /**
     * @throws ArrayIndexOutOfBoundsException
     * @throws IllegalArgumentException
     */
    public void setChars(char[] data, int offset, int length) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setConstraints(int constraints) {}

    /**
     * @since MIDP 2.0
     */
    public void setInitialInputMode(String characterSubset) {}

    /**
     * @throws IllegalArgumentException
     */
    public int setMaxSize(int maxSize) {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public void setString(String text) {}

    public int size() {
        return 0;
    }

}
