package java.lang;

public class InheritableThreadLocal extends ThreadLocal {
    public InheritableThreadLocal() {}

    protected Object childValue(Object parentValue) {
        return null;
    }

}
