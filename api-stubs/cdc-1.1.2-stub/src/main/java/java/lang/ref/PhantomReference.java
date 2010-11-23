package java.lang.ref;

public class PhantomReference extends Reference {
	/**
	 * @throws NullPointerException
	 */
    public PhantomReference(Object referent, ReferenceQueue q) {super(null);}

    public Object get() {
        return null;
    }

}
