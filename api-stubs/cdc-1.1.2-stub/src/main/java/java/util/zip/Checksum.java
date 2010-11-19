package java.util.zip;

public interface Checksum {
    long getValue();

    void reset();

    void update(int arg0);

    void update(byte[] arg0, int arg1, int arg2);

}
