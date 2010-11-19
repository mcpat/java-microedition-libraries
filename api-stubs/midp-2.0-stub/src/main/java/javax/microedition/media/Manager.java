package javax.microedition.media;

import java.io.IOException;
import java.io.InputStream;

public final class Manager {
    public final static String TONE_DEVICE_LOCATOR= "device://tone";

    /**
     * @throws MediaException
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws SecurityException
     */
    public static Player createPlayer(InputStream stream, String type) throws MediaException, IOException {
        return null;
    }

    /**
     * @throws MediaException
     * @throws IOException
     * @throws IllegalArgumentException
     * @throws SecurityException
     */
    public static Player createPlayer(String locator) throws MediaException, IOException {
        return null;
    }

    public static String[] getSupportedContentTypes(String protocol) {
        return null;
    }

    public static String[] getSupportedProtocols(String content_type) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws MediaException
     */
    public static void playTone(int note, int duration, int volume) throws MediaException {}


}
