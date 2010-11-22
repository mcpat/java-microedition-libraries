package java.util.zip;

public class ZipEntry implements ZipConstants, Cloneable {
    public final static int DEFLATED= 8;
    public final static int STORED= 0;

    /**
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public ZipEntry(String name) {}
    
    public ZipEntry(ZipEntry e) {}

    public Object clone() {
        return null;
    }

    public String getComment() {
        return null;
    }

    public long getCompressedSize() {
        return 0;
    }

    public long getCrc() {
        return 0;
    }

    public byte[] getExtra() {
        return null;
    }

    public int getMethod() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public long getSize() {
        return 0;
    }

    public long getTime() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isDirectory() {
        return false;
    }

    /**
     * @throws IllegalArgumentException
     */
    public void setComment(String comment) {}

    public void setCompressedSize(long csize) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setCrc(long crc) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setExtra(byte[] extra) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setMethod(int method) {}

    /**
     * @throws IllegalArgumentException
     */
    public void setSize(long size) {}

    public void setTime(long time) {}

    public String toString() {
        return null;
    }

}
