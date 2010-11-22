package java.io;

public class ObjectStreamField implements Comparable {
    public ObjectStreamField(String name, Class type) {}
    public ObjectStreamField(String name, Class type, boolean unshared) {}

    public int compareTo(Object obj) {
        return 0;
    }

    public String getName() {
        return null;
    }

    public int getOffset() {
        return 0;
    }

    public Class getType() {
        return null;
    }

    public char getTypeCode() {
        return 0;
    }

    public String getTypeString() {
        return null;
    }

    public boolean isPrimitive() {
        return false;
    }

    protected void setOffset(int offset) {}

    public String toString() {
        return null;
    }

}
