package java.lang;

/**
 * @since CLDC 1.0
 */
public final class Boolean {
    public final static Boolean FALSE= new Boolean(false);
    public final static Boolean TRUE= new Boolean(true);
    
    public Boolean(boolean value) {}
    
    public boolean booleanValue() {
        return false;
    }
    
    public boolean equals(Object obj) {
        return false;
    }
    
    public int hashCode() {
        return -1;
    }
    
    public String toString() {
        return null;
    }
}
