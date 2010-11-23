package java.lang.ref;

public class SoftReference extends Reference {
    public SoftReference(Object referent) {super(null);}
    /**
     * @throws NullPointerException
     */
    public SoftReference(Object referent, ReferenceQueue q) {super(null);}

    public Object get() {
        return null;
    }

}
