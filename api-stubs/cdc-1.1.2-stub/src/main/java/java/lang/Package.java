package java.lang;

import java.net.URL;
import java.util.jar.Manifest;

public class Package {
	public static Package getPackage(String name) {
        return null;
    }

    public static Package[] getPackages() {
        return null;
    }

    Package(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, URL arg7) {}
    Package(String arg0, Manifest arg1, URL arg2, Package arg3) {}

    public String getImplementationTitle() {
        return null;
    }

    public String getImplementationVendor() {
        return null;
    }

    public String getImplementationVersion() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getSpecificationTitle() {
        return null;
    }

    public String getSpecificationVendor() {
        return null;
    }

    public String getSpecificationVersion() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws NumberFormatException
     */
    public boolean isCompatibleWith(String desired) throws NumberFormatException {
        return false;
    }

    public boolean isSealed() {
        return false;
    }

    public boolean isSealed(URL url) {
        return false;
    }

    public String toString() {
        return null;
    }

}
