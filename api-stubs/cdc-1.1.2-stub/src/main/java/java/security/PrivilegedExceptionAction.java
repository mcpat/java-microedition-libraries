package java.security;

public interface PrivilegedExceptionAction {
    /**
     * @throws Exception
     */
	Object run() throws Exception;

}
