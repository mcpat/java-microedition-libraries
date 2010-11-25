package java.text;

public interface CharacterIterator extends Cloneable {
    char DONE= 65535;

    Object clone();

    char current();

    char first();

    int getBeginIndex();

    int getEndIndex();

    int getIndex();

    char last();

    char next();

    char previous();

    char setIndex(int arg0);

}
