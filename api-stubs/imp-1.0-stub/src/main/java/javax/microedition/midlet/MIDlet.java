package javax.microedition.midlet;

public abstract class MIDlet {
    protected MIDlet() {}

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

    public final void resumeRequest() {}

    /**
     * @throws MIDletStateChangeException
     */
    protected abstract void startApp() throws MIDletStateChangeException;

}
