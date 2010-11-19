package javax.microedition.lcdui;

/**
 * @since MIDP 1.0
 */
public class Form extends Screen {
    public Form(String title) {}
    
    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     */
    public Form(String title, Item[] items) {}

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     */
    public int append(Item item) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int append(String str) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public int append(Image img) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void delete(int itemNum) {}

    /**
     * @since MIDP 2.0
     */
    public void deleteAll() {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public Item get(int itemNum) {
        return null;
    }

    /**
     * @since MIDP 2.0
     */
    public int getHeight() {
        return 0;
    }

    /**
     * @since MIDP 2.0
     */
    public int getWidth() {
        return 0;
    }

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public void insert(int itemNum, Item item) {}

    /**
     * @throws IllegalStateException
     * @throws NullPointerException
     * @throws IndexOutOfBoundsException
     */
    public void set(int itemNum, Item item) {}

    public void setItemStateListener(ItemStateListener iListener) {}

    public int size() {
        return 0;
    }

}
