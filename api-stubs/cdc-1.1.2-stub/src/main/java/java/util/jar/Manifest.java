package java.util.jar;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public class Manifest implements Cloneable {
    public Manifest() {}
    
    /**
     * @throws IOException
     */
    public Manifest(InputStream is) throws IOException {}
    
    public Manifest(Manifest man) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    public Attributes getAttributes(String name) {
        return null;
    }

    public Map getEntries() {
        return null;
    }

    public Attributes getMainAttributes() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * @throws IOException
     */
    public void read(InputStream is) throws IOException {}

    /**
     * @throws IOException
     */
    public void write(OutputStream out) throws IOException {}

}
