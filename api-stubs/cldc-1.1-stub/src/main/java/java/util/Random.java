package java.util;

/**
 * @since CLDC 1.0
 */
public class Random {
    public Random() {}
    public Random(long seed) {}

    protected int next(int bits) {
        return 0;
    }

    /**
     * @since CLDC 1.1
     */
    public double nextDouble() {
        return 0;
    }

    /**
     * @since CLDC 1.1
     */
    public float nextFloat() {
        return 0;
    }

    public int nextInt() {
        return 0;
    }

    public int nextInt(int n) {
        return 0;
    }

    public long nextLong() {
        return 0;
    }

    public void setSeed(long seed) {}

}
