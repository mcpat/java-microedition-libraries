package java.text;

public interface AttributedCharacterIterator extends CharacterIterator {
    Set getAllAttributeKeys();

    Object getAttribute(AttributedCharacterIterator$Attribute arg0);

    Map getAttributes();

    int getRunLimit();

    int getRunLimit(AttributedCharacterIterator$Attribute arg0);

    int getRunLimit(Set arg0);

    int getRunStart();

    int getRunStart(AttributedCharacterIterator$Attribute arg0);

    int getRunStart(Set arg0);

}
