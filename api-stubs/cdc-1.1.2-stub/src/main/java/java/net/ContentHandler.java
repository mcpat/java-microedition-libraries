package java.net;

import java.io.IOException;

public abstract class ContentHandler {
    public ContentHandler() {}

    /**
     * @throws IOException
     */
    public abstract Object getContent(URLConnection urlc) throws IOException;

    /**
     * @throws IOException
     */
    public Object getContent(URLConnection urlc, Class[] classes) throws IOException {
        return null;
    }

}
