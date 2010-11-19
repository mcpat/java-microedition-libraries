package java.util;

public class SimpleTimeZone extends TimeZone {
    public final static int STANDARD_TIME;
    public final static int UTC_TIME;
    public final static int WALL_TIME;

    public SimpleTimeZone(int arg0, String arg1) {}
    public SimpleTimeZone(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {}
    public SimpleTimeZone(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {}
    public SimpleTimeZone(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object arg0) {
        return false;
    }

    public int getDSTSavings() {
        return 0;
    }

    public int getOffset(long arg0) {
        return 0;
    }

    public int getOffset(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return 0;
    }

    public int getRawOffset() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean hasSameRules(TimeZone arg0) {
        return false;
    }

    public boolean inDaylightTime(Date arg0) {
        return false;
    }

    public void setDSTSavings(int arg0) {}

    public void setEndRule(int arg0, int arg1, int arg2, int arg3) {}

    public void setEndRule(int arg0, int arg1, int arg2) {}

    public void setEndRule(int arg0, int arg1, int arg2, int arg3, boolean arg4) {}

    public void setRawOffset(int arg0) {}

    public void setStartRule(int arg0, int arg1, int arg2, int arg3) {}

    public void setStartRule(int arg0, int arg1, int arg2) {}

    public void setStartRule(int arg0, int arg1, int arg2, int arg3, boolean arg4) {}

    public void setStartYear(int arg0) {}

    public String toString() {
        return null;
    }

    public boolean useDaylightTime() {
        return false;
    }

}
