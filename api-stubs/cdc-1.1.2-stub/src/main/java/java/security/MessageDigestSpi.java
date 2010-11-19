package java.security;

public abstract class MessageDigestSpi {
    public MessageDigestSpi() {}

    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    protected abstract byte[] engineDigest();

    protected int engineDigest(byte[] arg0, int arg1, int arg2) throws DigestException {
        return 0;
    }

    protected int engineGetDigestLength() {
        return 0;
    }

    protected abstract void engineReset();

    protected abstract void engineUpdate(byte arg0);

    protected abstract void engineUpdate(byte[] arg0, int arg1, int arg2);

}
