package java.lang;

import java.io.Serializable;

public abstract class Number implements Serializable {
    public Number() {}

    public byte byteValue() {
        return 0;
    }

    public abstract double doubleValue();

    public abstract float floatValue();

    public abstract int intValue();

    public abstract long longValue();

    public short shortValue() {
        return 0;
    }

}
