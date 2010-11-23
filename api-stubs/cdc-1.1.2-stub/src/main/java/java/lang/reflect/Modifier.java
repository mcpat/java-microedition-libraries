package java.lang.reflect;

public class Modifier {
	public static final int ABSTRACT= 1024;
	public static final int FINAL= 16;
	public static final int INTERFACE= 512;
	public static final int NATIVE= 256;
	public static final int PRIVATE= 2;
	public static final int PROTECTED= 4;
	public static final int PUBLIC= 1;
	public static final int STATIC= 8;
	public static final int STRICT= 2048;
	public static final int SYNCHRONIZED= 32;
	public static final int TRANSIENT= 128;
	public static final int VOLATILE= 64;

    public static boolean isAbstract(int mod) {
        return false;
    }

    public static boolean isFinal(int mod) {
        return false;
    }

    public static boolean isInterface(int mod) {
        return false;
    }

    public static boolean isNative(int mod) {
        return false;
    }

    public static boolean isPrivate(int mod) {
        return false;
    }

    public static boolean isProtected(int mod) {
        return false;
    }

    public static boolean isPublic(int mod) {
        return false;
    }

    public static boolean isStatic(int mod) {
        return false;
    }

    public static boolean isStrict(int mod) {
        return false;
    }

    public static boolean isSynchronized(int mod) {
        return false;
    }

    public static boolean isTransient(int mod) {
        return false;
    }

    public static boolean isVolatile(int mod) {
        return false;
    }

    public static String toString(int mod) {
        return null;
    }

    public Modifier() {}

}
