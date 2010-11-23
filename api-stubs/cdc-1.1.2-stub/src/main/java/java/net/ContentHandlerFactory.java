package java.net;

public interface ContentHandlerFactory {
    ContentHandler createContentHandler(String mimetype);

}
