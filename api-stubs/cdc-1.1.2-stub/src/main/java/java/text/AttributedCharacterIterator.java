package java.text;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public interface AttributedCharacterIterator extends CharacterIterator {
	public static class Attribute implements Serializable {
	    public final static Attribute INPUT_METHOD_SEGMENT;
	    public final static Attribute LANGUAGE;
	    public final static Attribute READING;

		static {
			INPUT_METHOD_SEGMENT= new Attribute("");
			LANGUAGE= new Attribute("");
			READING= new Attribute("");
		}
		
	    protected Attribute(String name) {}

	    public final boolean equals(Object obj) {
	        return false;
	    }

	    protected String getName() {
	        return null;
	    }

	    public final int hashCode() {
	        return 0;
	    }

	    /**
	     * @throws InvalidObjectException
	     */
	    protected Object readResolve() throws InvalidObjectException {
	        return null;
	    }

	    public String toString() {
	        return null;
	    }

	}
	
	
    Set getAllAttributeKeys();

    Object getAttribute(Attribute attribute);

    Map getAttributes();

    int getRunLimit();

    int getRunLimit(Attribute attribute);

    int getRunLimit(Set attributes);

    int getRunStart();

    int getRunStart(Attribute attribute);

    int getRunStart(Set attributes);

}
