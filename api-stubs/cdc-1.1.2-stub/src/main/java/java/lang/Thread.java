package java.lang;

public class Thread implements Runnable {
    public final static int MAX_PRIORITY;
    public final static int MIN_PRIORITY;
    public final static int NORM_PRIORITY;

    public static int activeCount() {
        return 0;
    }

    public static Thread currentThread() {
        return null;
    }

    public static void dumpStack() {}

    public static int enumerate(Thread[] arg0) {
        return 0;
    }

    public static boolean holdsLock(Object arg0) {
        return false;
    }

    public static boolean interrupted() {
        return false;
    }

    public static void sleep(long arg0) throws InterruptedException {}

    public static void sleep(long arg0, int arg1) throws InterruptedException {}

    public static void yield() {}


    public Thread() {}
    public Thread(Runnable arg0) {}
    public Thread(ThreadGroup arg0, Runnable arg1) {}
    public Thread(String arg0) {}
    public Thread(ThreadGroup arg0, String arg1) {}
    public Thread(Runnable arg0, String arg1) {}
    public Thread(ThreadGroup arg0, Runnable arg1, String arg2) {}
    public Thread(ThreadGroup arg0, Runnable arg1, String arg2, long arg3) {}

    public final void checkAccess() {}

    public void destroy() {}

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

    public final void join(long arg0) throws InterruptedException {}

    public final void join(long arg0, int arg1) throws InterruptedException {}

    public final void join() throws InterruptedException {}

    public void run() {}

    public void setContextClassLoader(ClassLoader arg0) {}

    public final void setDaemon(boolean arg0) {}

    public final void setName(String arg0) {}

    public final void setPriority(int arg0) {}

    public void start() {}

    public String toString() {
        return null;
    }

}
