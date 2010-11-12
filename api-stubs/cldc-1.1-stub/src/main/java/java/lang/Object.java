package java.lang;

/**
 * @since CLDC 1.0
 */
public class Object {
    public Object() {}

    public boolean equals(Object obj) {
        return false;
    }

    public final Class getClass() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws IllegalMonitorStateException
     */
    public final void notify() {}

    /**
     * @throws IllegalMonitorStateException
     */
    public final void notifyAll() {}

    public String toString() {
        return null;
    }

    /**
	 * @throws IllegalArgumentException  
	 * @throws IllegalMonitorStateException  
	 * @throws InterruptedException  
     */
    public final void wait(long timeout) throws InterruptedException {}

    /**
     * @throws IllegalArgumentException  
     * @throws IllegalMonitorStateException  
     * @throws InterruptedException  
     */
    public final void wait(long timeout, int nanos) throws InterruptedException {}

    /**
     * @throws InterruptedException
     * @throws IllegalMonitorStateException  
     */
    public final void wait() throws InterruptedException {}

}
