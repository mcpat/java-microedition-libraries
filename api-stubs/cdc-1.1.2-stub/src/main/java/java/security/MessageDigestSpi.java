package java.security;

public abstract class MessageDigestSpi {
    public MessageDigestSpi() {}

    /**
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    protected abstract byte[] engineDigest();

    /**
     * @throws DigestException
     */
    protected int engineDigest(byte[] buf, int offset, int len) throws DigestException {
        return 0;
    }

    protected int engineGetDigestLength() {
        return 0;
    }

    protected abstract void engineReset();

    protected abstract void engineUpdate(byte input);

    protected abstract void engineUpdate(byte[] input, int offset, int len);

}
