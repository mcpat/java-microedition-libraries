package java.lang;

import java.io.Serializable;

public final class Boolean implements Serializable {
    public final static Boolean FALSE;
    public final static Boolean TRUE;
    public final static Class TYPE;

	static {
		FALSE= new Boolean(false);
		TRUE= new Boolean(true);
		TYPE= new Object().getClass();
	}
	
    public static boolean getBoolean(String name) {
        return false;
    }

    public static String toString(boolean b) {
        return null;
    }

    public static Boolean valueOf(boolean b) {
        return null;
    }

    public static Boolean valueOf(String s) {
        return null;
    }


    public Boolean(boolean value) {}
    public Boolean(String s) {}

    public boolean booleanValue() {
        return false;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

}
