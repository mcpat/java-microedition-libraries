package java.util;

public abstract class TimerTask implements Runnable {
    protected TimerTask() {}

    public boolean cancel() {
        return false;
    }

    public abstract void run();

    public long scheduledExecutionTime() {
        return 0;
    }

}
