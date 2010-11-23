package java.lang.ref;

public class ReferenceQueue {
    public ReferenceQueue() {}

    public Reference poll() {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws InterruptedException
     */
    public Reference remove(long timeout) throws IllegalArgumentException, InterruptedException {
        return null;
    }

    /**
     * @throws InterruptedException
     */
    public Reference remove() throws InterruptedException {
        return null;
    }

}
