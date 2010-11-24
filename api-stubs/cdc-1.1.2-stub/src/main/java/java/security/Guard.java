package java.security;

public interface Guard {
	/**
	 * @throws SecurityException
	 */
    void checkGuard(Object object) throws SecurityException;

}
