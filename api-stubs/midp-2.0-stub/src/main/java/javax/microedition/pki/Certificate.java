package javax.microedition.pki;

/**
 * @since MIDP 2.0
 */
public interface Certificate {
    String getIssuer();

    long getNotAfter();

    long getNotBefore();

    String getSerialNumber();

    String getSigAlgName();

    String getSubject();

    String getType();

    String getVersion();

}
