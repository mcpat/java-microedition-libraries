package java.io;

public interface Externalizable extends Serializable {
    void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException;

    void writeExternal(ObjectOutput arg0) throws IOException;

}
