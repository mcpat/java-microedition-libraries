package java.io;

public final class FileDescriptor {
    public final static FileDescriptor err;
    public final static FileDescriptor in;
    public final static FileDescriptor out;

    public FileDescriptor() {}

    public void sync() throws SyncFailedException {}

    public boolean valid() {
        return false;
    }

}
