package java.io;

public class InvalidClassException {
    public String classname;

    public InvalidClassException(String reason) {}
    public InvalidClassException(String cname, String reason) {}

    public String getMessage() {
        return null;
    }

}
