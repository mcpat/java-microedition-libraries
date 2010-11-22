package java.io;

public final class FileDescriptor {
    public final static FileDescriptor err= new FileDescriptor();
    public final static FileDescriptor in= new FileDescriptor();
    public final static FileDescriptor out= new FileDescriptor();

    public FileDescriptor() {}

    /**
     * @throws SyncFailedException
     */
    public void sync() throws SyncFailedException {}

    public boolean valid() {
        return false;
    }

}
