package java.security;

public class GuardedObject implements Serializable {
    public GuardedObject(Object arg0, Guard arg1) {}

    public Object getObject() throws SecurityException {
        return null;
    }

}
