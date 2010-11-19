package java.util;

public class Timer {
    public Timer() {}

    public void cancel() {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void schedule(TimerTask task, long delay) {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void schedule(TimerTask task, Date time) {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void schedule(TimerTask task, long delay, long period) {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void schedule(TimerTask task, Date firstTime, long period) {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void scheduleAtFixedRate(TimerTask task, long delay, long period) {}

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException
     */
    public void scheduleAtFixedRate(TimerTask task, Date firstTime, long period) {}

}
