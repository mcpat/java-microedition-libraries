package java.util.jar;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Attributes implements Map, Cloneable {
    public static class Name {
        public final static Name CLASS_PATH= new Name("Class-Path");
        public final static Name CONTENT_TYPE= new Name("Content-Type");
        public final static Name EXTENSION_INSTALLATION= new Name("Extension-Installation");
        public final static Name EXTENSION_LIST= new Name("Extension-List");
        public final static Name EXTENSION_NAME= new Name("Extension-Name");
        public final static Name IMPLEMENTATION_TITLE= new Name("Implementation-Title");
        public final static Name IMPLEMENTATION_URL= new Name("Implementation-Vendor-URL");
        public final static Name IMPLEMENTATION_VENDOR= new Name("Implementation-Vendor");
        public final static Name IMPLEMENTATION_VENDOR_ID= new Name("Implementation-Vendor-Id");
        public final static Name IMPLEMENTATION_VERSION= new Name("Implementation-Version");
        public final static Name MAIN_CLASS= new Name("Main-Class");
        public final static Name MANIFEST_VERSION= new Name("Manifest-Version");
        public final static Name SEALED= new Name("Sealed");
        public final static Name SIGNATURE_VERSION= new Name("Signature-Version");
        public final static Name SPECIFICATION_TITLE= new Name("Specification-Title");
        public final static Name SPECIFICATION_VENDOR= new Name("Specification-Vendor");
        public final static Name SPECIFICATION_VERSION= new Name("Specification-Version");

        /**
         * @throws IllegalArgumentException
         * @throws NullPointerException
         */
        public Name(String name) {}

        public boolean equals(Object o) {
            return false;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return null;
        }
    }
    
    protected Map map;

    public Attributes() {}
    public Attributes(int size) {}
    public Attributes(Attributes attr) {}

    public void clear() {}

    public Object clone() {
        return null;
    }

    public boolean containsKey(Object name) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Set entrySet() {
        return null;
    }

    public boolean equals(Object o) {
        return false;
    }

    public Object get(Object name) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public String getValue(String name) {
        return null;
    }

    public String getValue(Name name) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Set keySet() {
        return null;
    }

    /**
     * @throws ClassCastException
     */
    public Object put(Object name, Object value) {
        return null;
    }

    /**
     * @throws ClassCastException
     */
    public void putAll(Map attr) {}

    /**
     * @throws IllegalArgumentException
     */
    public String putValue(String name, String value) {
        return null;
    }

    public Object remove(Object name) {
        return null;
    }

    public int size() {
        return 0;
    }

    public Collection values() {
        return null;
    }

}
