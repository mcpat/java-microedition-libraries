package java.lang.ref;

public class WeakReference extends Reference {
    public WeakReference(Object referent) {super(null);}
    /**
     * @throws NullPointerException
     */
    public WeakReference(Object referent, ReferenceQueue q) {super(null);}

}
