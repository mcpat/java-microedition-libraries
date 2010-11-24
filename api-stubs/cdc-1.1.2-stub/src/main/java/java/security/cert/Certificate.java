package java.security.cert;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;

public abstract class Certificate implements Serializable {
	public static class CertificateRep implements Serializable {
	    protected CertificateRep(String type, byte[] data) {}

	    protected Object readResolve() throws ObjectStreamException {
	        return null;
	    }

	}
    protected Certificate(String type) {}

    public boolean equals(Object other) {
        return false;
    }

    /**
     * @throws CertificateEncodingException
     */
    public abstract byte[] getEncoded() throws CertificateEncodingException;

    public abstract PublicKey getPublicKey();

    public final String getType() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public abstract String toString();

    /**
     * @throws CertificateException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws NoSuchProviderException
     * @throws SignatureException
     */
    public abstract void verify(PublicKey key) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    /**
     * @throws CertificateException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws NoSuchProviderException
     * @throws SignatureException
     */
    public abstract void verify(PublicKey key, String sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;

    /**
     * @throws ObjectStreamException
     */
    protected Object writeReplace() throws ObjectStreamException {
        return null;
    }

}
