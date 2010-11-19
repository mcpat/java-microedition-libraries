package java.util.zip;

public class ZipEntry implements ZipConstants, Cloneable {
    public final static int DEFLATED;
    public final static int STORED;

    public ZipEntry(String arg0) {}
    public ZipEntry(ZipEntry arg0) {}

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

    public void setComment(String arg0) {}

    public void setCompressedSize(long arg0) {}

    public void setCrc(long arg0) {}

    public void setExtra(byte[] arg0) {}

    public void setMethod(int arg0) {}

    public void setSize(long arg0) {}

    public void setTime(long arg0) {}

    public String toString() {
        return null;
    }

}
