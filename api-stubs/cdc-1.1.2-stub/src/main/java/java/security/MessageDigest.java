package java.security;

public abstract class MessageDigest extends MessageDigestSpi {
    public static MessageDigest getInstance(String arg0) throws NoSuchAlgorithmException {
        return null;
    }

    public static MessageDigest getInstance(String arg0, String arg1) throws NoSuchAlgorithmException, NoSuchProviderException {
        return null;
    }

    public static MessageDigest getInstance(String arg0, Provider arg1) throws NoSuchAlgorithmException {
        return null;
    }

    public static boolean isEqual(byte[] arg0, byte[] arg1) {
        return false;
    }


    protected MessageDigest(String arg0) {}

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    public byte[] digest() {
        return null;
    }

    public int digest(byte[] arg0, int arg1, int arg2) throws DigestException {
        return 0;
    }

    public byte[] digest(byte[] arg0) {
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

    public void update(byte arg0) {}

    public void update(byte[] arg0, int arg1, int arg2) {}

    public void update(byte[] arg0) {}

}
