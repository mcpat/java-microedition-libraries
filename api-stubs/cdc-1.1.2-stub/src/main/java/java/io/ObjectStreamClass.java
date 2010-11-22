package java.io;

public class ObjectStreamClass implements Serializable {
    public final static ObjectStreamField[] NO_FIELDS;

	static {
		NO_FIELDS= new ObjectStreamField[0];
	}
	
    public static ObjectStreamClass lookup(Class cl) {
        return null;
    }


    ObjectStreamClass() {}

    public Class forClass() {
        return null;
    }

    public ObjectStreamField getField(String name) {
        return null;
    }

    public ObjectStreamField[] getFields() {
        return null;
    }

    public String getName() {
        return null;
    }

    public long getSerialVersionUID() {
        return 0;
    }

    public String toString() {
        return null;
    }

}
