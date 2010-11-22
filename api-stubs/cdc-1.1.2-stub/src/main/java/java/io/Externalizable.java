package java.io;

public interface Externalizable extends Serializable {
    /**
     * @throws IOException
     * @throws ClassNotFoundException
     */
    void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;

    /**
     * @throws IOException
     */
    void writeExternal(ObjectOutput out) throws IOException;

}
