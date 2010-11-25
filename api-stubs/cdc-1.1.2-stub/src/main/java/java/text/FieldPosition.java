package java.text;

import java.text.DateFormat.Field;

public class FieldPosition {
    public FieldPosition(int field) {}
    public FieldPosition(Field attribute) {}
    public FieldPosition(Field attribute, int fieldID) {}

    public boolean equals(Object obj) {
        return false;
    }

    public int getBeginIndex() {
        return 0;
    }

    public int getEndIndex() {
        return 0;
    }

    public int getField() {
        return 0;
    }

    public Field getFieldAttribute() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public void setBeginIndex(int bi) {}

    public void setEndIndex(int ei) {}

    public String toString() {
        return null;
    }

}
