package java.util;

public abstract class TimeZone implements Serializable, Cloneable {
    public final static int LONG;
    public final static int SHORT;

    public static String[] getAvailableIDs(int arg0) {
        return null;
    }

    public static String[] getAvailableIDs() {
        return null;
    }

    public static TimeZone getDefault() {
        return null;
    }

    public static TimeZone getTimeZone(String arg0) {
        return null;
    }

    public static void setDefault(TimeZone arg0) {}


    public TimeZone() {}

    public Object clone() {
        return null;
    }

    public final String getDisplayName() {
        return null;
    }

    public final String getDisplayName(Locale arg0) {
        return null;
    }

    public final String getDisplayName(boolean arg0, int arg1) {
        return null;
    }

    public String getDisplayName(boolean arg0, int arg1, Locale arg2) {
        return null;
    }

    public int getDSTSavings() {
        return 0;
    }

    public String getID() {
        return null;
    }

    public abstract int getOffset(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    public int getOffset(long arg0) {
        return 0;
    }

    public abstract int getRawOffset();

    public boolean hasSameRules(TimeZone arg0) {
        return false;
    }

    public abstract boolean inDaylightTime(Date arg0);

    public void setID(String arg0) {}

    public abstract void setRawOffset(int arg0);

    public abstract boolean useDaylightTime();

}
