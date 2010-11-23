package java.lang;

public class Thread implements Runnable {
	public static final int MAX_PRIORITY= 10;
	public static final int MIN_PRIORITY= 1;
	public static final int NORM_PRIORITY= 5;

    public static int activeCount() {
        return 0;
    }

    public static Thread currentThread() {
        return null;
    }

    public static void dumpStack() {}

    /**
     * @throws SecurityException
     */
    public static int enumerate(Thread[] tarray) {
        return 0;
    }

    /**
     * @throws NullPointerException
     */
    public static boolean holdsLock(Object obj) {
        return false;
    }

    public static boolean interrupted() {
        return false;
    }

    /**
     * @throws InterruptedException
     */
    public static void sleep(long arg0) throws InterruptedException {}

    /**
     * @throws InterruptedException
     * @throws IllegalArgumentException
     */
    public static void sleep(long arg0, int arg1) throws InterruptedException {}

    public static void yield() {}


    public Thread() {}
    public Thread(Runnable target) {}
    
    /**
     * @throws SecurityException
     */
    public Thread(ThreadGroup group, Runnable target) {}
    public Thread(String name) {}
    
    /**
     * @throws SecurityException
     */
    public Thread(ThreadGroup group, String name) {}
    public Thread(Runnable target, String name) {}
    
    /**
     * @throws SecurityException
     */
    public Thread(ThreadGroup group, Runnable target, String name) {}

    /**
     * @throws SecurityException
     */
    public Thread(ThreadGroup group, Runnable target, String name, long stackSize) {}

    /**
     * @throws SecurityException
     */
    public final void checkAccess() {}

    public void destroy() {}

    /**
     * @throws SecurityException
     */
    public ClassLoader getContextClassLoader() {
        return null;
    }

    public final String getName() {
        return null;
    }

    public final int getPriority() {
        return 0;
    }

    public final ThreadGroup getThreadGroup() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public void interrupt() {}

    public final boolean isAlive() {
        return false;
    }

    public final boolean isDaemon() {
        return false;
    }

    public boolean isInterrupted() {
        return false;
    }

    /**
     * @throws InterruptedException
     */
    public final void join(long millis) throws InterruptedException {}

    /**
     * @throws InterruptedException
     * @throws IllegalArgumentException
     */
    public final void join(long millis, int nanos) throws InterruptedException {}

    /**
     * @throws InterruptedException
     */
    public final void join() throws InterruptedException {}

    public void run() {}

    /**
     * @throws SecurityException
     */
    public void setContextClassLoader(ClassLoader cl) {}

    /**
     * @throws IllegalThreadStateException 
     * @throws SecurityException
     */
    public final void setDaemon(boolean on) {}

    /**
     * @throws SecurityException
     */
    public final void setName(String name) {}

    /**
     * @throws IllegalArgumentException 
     * @throws SecurityException
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
