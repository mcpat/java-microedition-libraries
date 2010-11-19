package java.lang.ref;

public abstract class Reference {
    Reference(Object arg0) {}
    Reference(Object arg0, ReferenceQueue arg1) {}

    public void clear() {}

    public boolean enqueue() {
        return false;
    }

    public Object get() {
        return null;
    }

    public boolean isEnqueued() {
        return false;
    }

}
