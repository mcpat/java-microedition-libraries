package java.lang;

/**
 * @since CLDC 1.0
 */
public class Thread implements Runnable {
    public final static int MAX_PRIORITY= 10;
    public final static int MIN_PRIORITY= 1;
    public final static int NORM_PRIORITY= 5;
    
    public static int activeCount() {
        return -1;
    }
    
    public static Thread currentThread() {
        return null;
    }
    
    /**
     * @throws InterruptedException
     */
    public static void sleep(long millis) throws InterruptedException {}
    
    public static void yield() {}
    
    
    public Thread() {}
    
    public Thread(String name) {}
    
    public Thread(Runnable target) {}
    
    public Thread(Runnable target, String name) {}
    
    public final String getName() {
        return null;
    }
    
    public final int getPriority() {
        return -1;
    }
    
    public final boolean isAlive() {
        return false;
    }
    
    /**
     * @since CLDC 1.1
     */
    public void interrupt() {}
    
    /**
     * @throws InterruptedException
     */
    public final void join() throws InterruptedException {}
    
    public void run() {}
    
    /**
     * @throws IllegalArgumentException
     */
    public final void setPriority(int newPriority) {}
    
    /**
     * @throws IllegalThreadStateException
     */
    public void start() {}
    
    public String toString() {
        return null;
    }
}
