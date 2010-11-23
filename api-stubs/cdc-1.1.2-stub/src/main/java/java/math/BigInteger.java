package java.math;

import java.util.Random;

public class BigInteger extends Number implements Comparable {
    public final static BigInteger ONE;
    public final static BigInteger ZERO;

	static {
		ONE= new BigInteger("");
		ZERO= new BigInteger("");
	}
	
    public static BigInteger valueOf(long val) {
        return null;
    }

    /**
     * @throws NumberFormatException
     */
    public BigInteger(byte[] val) {}

    /**
     * @throws NumberFormatException
     */
    public BigInteger(int signum, byte[] magnitude) {}
   
    /**
     * @throws NumberFormatException
     */
    public BigInteger(String val, int radix) {}

    /**
     * @throws NumberFormatException
     */
    public BigInteger(String val) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public BigInteger(int numBits, Random rnd) {}
    
    /**
     * @throws ArithmeticException
     */
    public BigInteger(int bitLength, int certainty, Random rnd) {}

    public BigInteger abs() {
        return null;
    }

    public BigInteger add(BigInteger val) {
        return null;
    }

    public BigInteger and(BigInteger val) {
        return null;
    }

    public BigInteger andNot(BigInteger val) {
        return null;
    }

    public int bitCount() {
        return 0;
    }

    public int bitLength() {
        return 0;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger clearBit(int n) {
        return null;
    }

    public int compareTo(BigInteger val) {
        return 0;
    }

    /**
     * @throws ClassCastException
     */
    public int compareTo(Object o) {
        return 0;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger divide(BigInteger val) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger[] divideAndRemainder(BigInteger val) {
        return null;
    }

    public double doubleValue() {
        return 0;
    }

    public boolean equals(Object x) {
        return false;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger flipBit(int n) {
        return null;
    }

    public float floatValue() {
        return 0;
    }

    public BigInteger gcd(BigInteger val) {
        return null;
    }

    public int getLowestSetBit() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public int intValue() {
        return 0;
    }

    public boolean isProbablePrime(int certainty) {
        return false;
    }

    public long longValue() {
        return 0;
    }

    public BigInteger max(BigInteger val) {
        return null;
    }

    public BigInteger min(BigInteger val) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger mod(BigInteger m) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger modInverse(BigInteger m) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger modPow(BigInteger exponent, BigInteger m) {
        return null;
    }

    public BigInteger multiply(BigInteger val) {
        return null;
    }

    public BigInteger negate() {
        return null;
    }

    public BigInteger not() {
        return null;
    }

    public BigInteger or(BigInteger val) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger pow(int exponent) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public BigInteger remainder(BigInteger val) {
        return null;
    }

    public BigInteger setBit(int n) {
        return null;
    }

    public BigInteger shiftLeft(int n) {
        return null;
    }

    public BigInteger shiftRight(int n) {
        return null;
    }

    public int signum() {
        return 0;
    }

    public BigInteger subtract(BigInteger val) {
        return null;
    }

    /**
     * @throws ArithmeticException
     */
    public boolean testBit(int n) {
        return false;
    }

    public byte[] toByteArray() {
        return null;
    }

    public String toString(int radix) {
        return null;
    }

    public String toString() {
        return null;
    }

    public BigInteger xor(BigInteger val) {
        return null;
    }

}
