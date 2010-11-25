package java.util;

import java.io.Serializable;

public class Random implements Serializable {
    public Random() {}
    public Random(long seed) {}

    protected int next(int bits) {
        return 0;
    }

    public boolean nextBoolean() {
        return false;
    }

    public void nextBytes(byte[] bytes) {}

    public double nextDouble() {
        return 0;
    }

    public float nextFloat() {
        return 0;
    }

    public double nextGaussian() {
        return 0;
    }

    public int nextInt() {
        return 0;
    }

    /**
     * @throws IllegalArgumentException
     */
    public int nextInt(int n) {
        return 0;
    }

    public long nextLong() {
        return 0;
    }

    public void setSeed(long seed) {}

}
