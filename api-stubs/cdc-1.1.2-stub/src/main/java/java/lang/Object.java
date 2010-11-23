package java.lang;

public class Object {
    public Object() {}

    /**
     * @throws CloneNotSupportedException
     */
    protected Object clone() throws CloneNotSupportedException {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    protected void finalize() throws Throwable {}

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
     * @throws IllegalMonitorStateException 
     * @throws InterruptedException
     */
    public final void wait() throws InterruptedException {}

}
