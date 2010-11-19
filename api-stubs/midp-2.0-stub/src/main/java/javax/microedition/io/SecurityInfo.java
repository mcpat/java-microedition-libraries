package javax.microedition.io;

import javax.microedition.pki.Certificate;

/**
 * @since MIDP 2.0
 */
public interface SecurityInfo {
    String getCipherSuite();

    String getProtocolName();

    String getProtocolVersion();

    Certificate getServerCertificate();

}
