package java.util.zip;

public interface Checksum {
    long getValue();

    void reset();

    void update(int b);

    void update(byte[] b, int off, int len);

}
