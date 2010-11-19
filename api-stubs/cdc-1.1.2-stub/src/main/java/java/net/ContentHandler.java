package java.net;

public abstract class ContentHandler {
    public ContentHandler() {}

    public abstract Object getContent(URLConnection arg0) throws IOException;

    public Object getContent(URLConnection arg0, Class[] arg1) throws IOException {
        return null;
    }

}
