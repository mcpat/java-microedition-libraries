package java.io;

public class InvalidClassException extends ObjectStreamException {
    public String classname;

    public InvalidClassException(String reason) {}
    public InvalidClassException(String cname, String reason) {}

    public String getMessage() {
        return null;
    }

}
