package java.security;

public abstract class MessageDigest extends MessageDigestSpi {
    /**
     * @throws NoSuchAlgorithmException
     */
    public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException {
        return null;
    }

    /**
     * @throws NoSuchAlgorithmException 
     * @throws NoSuchProviderException 
     * @throws IllegalArgumentException
     */
    public static MessageDigest getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
        return null;
    }

    /**
     * @throws NoSuchAlgorithmException
     * @throws IllegalArgumentException
     */
    public static MessageDigest getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
        return null;
    }

    public static boolean isEqual(byte[] digesta, byte[] digestb) {
        return false;
    }


    protected MessageDigest(String algorithm) {}

    /**
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    public byte[] digest() {
        return null;
    }

    /**
     * @throws DigestException
     */
    public int digest(byte[] buf, int offset, int len) throws DigestException {
        return 0;
    }

    public byte[] digest(byte[] input) {
        return null;
    }

    public final String getAlgorithm() {
        return null;
    }

    public final int getDigestLength() {
        return 0;
    }

    public final Provider getProvider() {
        return null;
    }

    public void reset() {}

    public String toString() {
        return null;
    }

    public void update(byte input) {}

    public void update(byte[] input, int offset, int len) {}

    public void update(byte[] input) {}

}
