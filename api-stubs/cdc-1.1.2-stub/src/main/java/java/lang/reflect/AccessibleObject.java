package java.lang.reflect;

public class AccessibleObject {
    /**
     * @throws SecurityException
     */
    public static void setAccessible(AccessibleObject[] array, boolean flag) throws SecurityException {}


    protected AccessibleObject() {}

    public boolean isAccessible() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public void setAccessible(boolean flag) throws SecurityException {}

}
