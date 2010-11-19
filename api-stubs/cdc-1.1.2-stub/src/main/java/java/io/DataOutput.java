package java.io;

public interface DataOutput {
    void write(int arg0) throws IOException;

    void write(byte[] arg0) throws IOException;

    void write(byte[] arg0, int arg1, int arg2) throws IOException;

    void writeBoolean(boolean arg0) throws IOException;

    void writeByte(int arg0) throws IOException;

    void writeBytes(String arg0) throws IOException;

    void writeChar(int arg0) throws IOException;

    void writeChars(String arg0) throws IOException;

    void writeDouble(double arg0) throws IOException;

    void writeFloat(float arg0) throws IOException;

    void writeInt(int arg0) throws IOException;

    void writeLong(long arg0) throws IOException;

    void writeShort(int arg0) throws IOException;

    void writeUTF(String arg0) throws IOException;

}
