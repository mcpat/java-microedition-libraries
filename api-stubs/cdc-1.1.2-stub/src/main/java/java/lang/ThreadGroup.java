package java.lang;

public class ThreadGroup {
    public ThreadGroup(String arg0) {}
    public ThreadGroup(ThreadGroup arg0, String arg1) {}

    public int activeCount() {
        return 0;
    }

    public int activeGroupCount() {
        return 0;
    }

    public final void checkAccess() {}

    public final void destroy() {}

    public int enumerate(Thread[] arg0) {
        return 0;
    }

    public int enumerate(Thread[] arg0, boolean arg1) {
        return 0;
    }

    public int enumerate(ThreadGroup[] arg0) {
        return 0;
    }

    public int enumerate(ThreadGroup[] arg0, boolean arg1) {
        return 0;
    }

    public final int getMaxPriority() {
        return 0;
    }

    public final String getName() {
        return null;
    }

    public final ThreadGroup getParent() {
        return null;
    }

    public final void interrupt() {}

    public final boolean isDaemon() {
        return false;
    }

    public boolean isDestroyed() {
        return false;
    }

    public void list() {}

    public final boolean parentOf(ThreadGroup arg0) {
        return false;
    }

    public final void setDaemon(boolean arg0) {}

    public final void setMaxPriority(int arg0) {}

    public String toString() {
        return null;
    }

    public void uncaughtException(Thread arg0, Throwable arg1) {}

}
