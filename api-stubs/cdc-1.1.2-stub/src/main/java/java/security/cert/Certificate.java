package java.security.cert;

public abstract class Certificate implements Serializable {
    protected Certificate(String arg0) {}

    public boolean equals(Object arg0) {
        return false;
    }

    public abstract byte[] getEncoded() throws CertificateEncodingException;

    public abstract PublicKey getPublicKey();

    public final String getType() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public abstract String toString();

    public abstract void verify(PublicKey arg0) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    public abstract void verify(PublicKey arg0, String arg1) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    protected Object writeReplace() throws ObjectStreamException {
        return null;
    }

}
