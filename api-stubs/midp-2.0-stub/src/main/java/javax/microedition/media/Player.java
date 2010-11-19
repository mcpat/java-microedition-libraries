package javax.microedition.media;

public interface Player extends Controllable {
	public static final int CLOSED= 0;
	public static final int PREFETCHED= 300;
	public static final int REALIZED= 200;
	public static final int STARTED= 400;
	public static final long TIME_UNKNOWN= -1l;
	public static final int UNREALIZED= 100;

	/**
	 * @throws IllegalStateException
	 */
    void addPlayerListener(PlayerListener playerListener);

    void close();

    /**
     * @throws IllegalStateException
     */
    void deallocate();

    /**
     * @throws IllegalStateException
     */
    String getContentType();

    /**
     * @throws IllegalStateException
     */
    long getDuration();

    /**
     * @throws IllegalStateException
     */
    long getMediaTime();

    int getState();

    /**
     * @throws MediaException
     * @throws IllegalStateException
     * @throws SecurityException
     */
    void prefetch() throws MediaException;

    /**
     * @throws MediaException
     * @throws IllegalStateException
     * @throws SecurityException
     */
    void realize() throws MediaException;

    /**
     * @throws IllegalStateException
     */
    void removePlayerListener(PlayerListener playerListener);

    /**
     * @throws IllegalArgumentException
     * @throws IllegalStateException
     */
    void setLoopCount(int count);

    /**
     * @throws MediaException
     * @throws IllegalStateException
     */
    long setMediaTime(long now) throws MediaException;

    /**
     * @throws MediaException
     * @throws IllegalStateException
     * @throws SecurityException
     */
    void start() throws MediaException;

    /**
     * @throws MediaException
     * @throws IllegalStateException
     */
    void stop() throws MediaException;

}
