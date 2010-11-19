package javax.microedition.midlet;

import javax.microedition.io.ConnectionNotFoundException;

public abstract class MIDlet {
    /**
     * @throws SecurityException
     */
	protected MIDlet() {}

	/**
	 * @since MIDP 2.0
	 */
    public final int checkPermission(String permission) {
        return 0;
    }

    /**
     * @throws MIDletStateChangeException
     */
    protected abstract void destroyApp(boolean unconditional) throws MIDletStateChangeException;

    /**
     * @throws NullPointerException
     */
    public final String getAppProperty(String key) {
        return null;
    }

    public final void notifyDestroyed() {}

    public final void notifyPaused() {}

    protected abstract void pauseApp();

    /**
     * @throws ConnectionNotFoundException
     * @since MIDP 2.0
     */
    public final boolean platformRequest(String URL) throws ConnectionNotFoundException {
        return false;
    }

    public final void resumeRequest() {}

    /**
     * @throws MIDletStateChangeException
     */
    protected abstract void startApp() throws MIDletStateChangeException;

}
