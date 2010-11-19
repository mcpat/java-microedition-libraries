package java.lang;

public class InheritableThreadLocal extends ThreadLocal {
    public InheritableThreadLocal() {}

    protected Object childValue(Object arg0) {
        return null;
    }

}
