package java.security;

import java.io.Serializable;
import java.net.URL;
import java.security.cert.Certificate;

public class CodeSource implements Serializable {
    public CodeSource(URL url, Certificate[] certs) {}

    public boolean equals(Object obj) {
        return false;
    }

    public final Certificate[] getCertificates() {
        return null;
    }

    public final URL getLocation() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean implies(CodeSource codesource) {
        return false;
    }

    public String toString() {
        return null;
    }

}
