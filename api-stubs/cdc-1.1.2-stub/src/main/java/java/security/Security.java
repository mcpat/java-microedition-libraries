package java.security;

import java.util.Map;
import java.util.Set;

public final class Security {
	/**
     * @throws SecurityException
     */
	public static int addProvider(Provider provider) {
        return 0;
    }

    public static Set getAlgorithms(String serviceName) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public static String getProperty(String key) {
        return null;
    }

    public static Provider getProvider(String name) {
        return null;
    }

    public static Provider[] getProviders() {
        return null;
    }

    /**
     * @throws InvalidParameterException
     */
    public static Provider[] getProviders(String filter) {
        return null;
    }

    /**
     * @throws InvalidParameterException
     */
    public static Provider[] getProviders(Map filter) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public static int insertProviderAt(Provider provider, int position) {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public static void removeProvider(String name) {}

    /**
     * @throws SecurityException
     */
    public static void setProperty(String key, String datum) {}


}
