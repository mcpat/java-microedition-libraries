package java.io;

public interface ObjectInputValidation {
	/**
	 * @throws InvalidObjectException
	 */
    void validateObject() throws InvalidObjectException;

}
