package java.util;

import java.io.Serializable;

public class BitSet implements Cloneable, Serializable {
    public BitSet() {}
    
    /**
     * @throws NegativeArraySizeException
     */
    public BitSet(int nbits) {}

    public void and(BitSet set) {}

    public void andNot(BitSet set) {}

    public int cardinality() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void clear(int bitIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void clear(int fromIndex, int toIndex) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public void flip(int bitIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void flip(int fromIndex, int toIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public boolean get(int bitIndex) {
        return false;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public BitSet get(int fromIndex, int toIndex) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean intersects(BitSet set) {
        return false;
    }

    public boolean isEmpty() {
        return false;
    }

    public int length() {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public int nextClearBit(int fromIndex) {
        return 0;
    }

    /**
     * @throws IndexOutOfBoundsException
     */
    public int nextSetBit(int fromIndex) {
        return 0;
    }

    public void or(BitSet set) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void set(int bitIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void set(int bitIndex, boolean value) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void set(int fromIndex, int toIndex) {}

    /**
     * @throws IndexOutOfBoundsException
     */
    public void set(int fromIndex, int toIndex, boolean value) {}

    public int size() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public void xor(BitSet set) {}

}
