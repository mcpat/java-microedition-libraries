package java.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Properties extends Hashtable {
    protected Properties defaults;

    public Properties() {}
    public Properties(Properties defaults) {}

    public String getProperty(String key) {
        return null;
    }

    public String getProperty(String key, String defaultValue) {
        return null;
    }

    public void list(PrintStream out) {}

    public void list(PrintWriter out) {}

    /**
     * @throws IOException
     * @throws IllegalArgumentException
     */
    public void load(InputStream inStream) throws IOException {}

    public Enumeration propertyNames() {
        return null;
    }

    /**
     * @deprecated {@link #store(OutputStream, String)}
     * @throws ClassCastException
     */
    public void save(OutputStream out, String header) {}

    public Object setProperty(String key, String value) {
        return null;
    }

    /**
     * @throws IOException
     * @throws ClassCastException
     * @throws NullPointerException
     */
    public void store(OutputStream out, String header) throws IOException {}

}
