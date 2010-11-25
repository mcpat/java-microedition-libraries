package java.util;

import java.io.Serializable;

public class Date implements Serializable, Cloneable, Comparable {
    public Date() {}
    public Date(long date) {}

    public boolean after(Date when) {
        return false;
    }

    public boolean before(Date when) {
        return false;
    }

    public Object clone() {
        return null;
    }

    public int compareTo(Date anotherDate) {
        return 0;
    }

    /**
     * @throws ClassCastException
     */
    public int compareTo(Object o) {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public long getTime() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public void setTime(long time) {}

    public String toString() {
        return null;
    }

}
