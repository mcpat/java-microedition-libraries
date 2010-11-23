package java.lang;

public class ThreadGroup {
	/**
	 * @throws SecurityException
	 */
    public ThreadGroup(String name) {}
    
    /**
     * @throws NullPointerException 
     * @throws SecurityException
     */
    public ThreadGroup(ThreadGroup parent, String name) {}

    public int activeCount() {
        return 0;
    }

    public int activeGroupCount() {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public final void checkAccess() {}

    /**
     * @throws SecurityException
     * @throws IllegalThreadStateException	
     */
    public final void destroy() {}

    public int enumerate(Thread[] list) {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public int enumerate(Thread[] list, boolean recurse) {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public int enumerate(ThreadGroup[] list) {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public int enumerate(ThreadGroup[] list, boolean recurse) {
        return 0;
    }

    public final int getMaxPriority() {
        return 0;
    }

    public final String getName() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public final ThreadGroup getParent() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public final void interrupt() {}

    public final boolean isDaemon() {
        return false;
    }

    public boolean isDestroyed() {
        return false;
    }

    public void list() {}

    public final boolean parentOf(ThreadGroup g) {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public final void setDaemon(boolean daemon) {}

    /**
     * @throws SecurityException
     */
    public final void setMaxPriority(int pri) {}

    public String toString() {
        return null;
    }

    public void uncaughtException(Thread t, Throwable e) {}

}
