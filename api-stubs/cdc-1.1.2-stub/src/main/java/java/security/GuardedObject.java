package java.security;

import java.io.Serializable;

public class GuardedObject implements Serializable {
    public GuardedObject(Object object, Guard guard) {}

    /**
     * @throws SecurityException
     */
    public Object getObject() throws SecurityException {
        return null;
    }

}
