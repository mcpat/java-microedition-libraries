package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public abstract class Provider extends Properties {
    protected Provider(String name, double version, String info) {}

    /**
     * @throws SecurityException
     */
    public void clear() {}

    public Set entrySet() {
        return null;
    }

    public String getInfo() {
        return null;
    }

    public String getName() {
        return null;
    }

    public double getVersion() {
        return 0;
    }

    public Set keySet() {
        return null;
    }

    /**
     * @throws IOException
     */
    public void load(InputStream inStream) throws IOException {}

    /**
     * @throws SecurityException
     */
    public Object put(Object key, Object value) {
        return null;
    }

    public void putAll(Map t) {}

    /**
     * @throws SecurityException
     */
    public Object remove(Object key) {
        return null;
    }

    public String toString() {
        return null;
    }

    public Collection values() {
        return null;
    }

}
