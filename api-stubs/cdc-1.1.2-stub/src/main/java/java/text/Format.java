package java.text;

public abstract class Format implements Serializable, Cloneable {
    public Format() {}

    public Object clone() {
        return null;
    }

    public final String format(Object arg0) {
        return null;
    }

    public abstract StringBuffer format(Object arg0, StringBuffer arg1, FieldPosition arg2);

    public AttributedCharacterIterator formatToCharacterIterator(Object arg0) {
        return null;
    }

    public abstract Object parseObject(String arg0, ParsePosition arg1);

    public Object parseObject(String arg0) throws ParseException {
        return null;
    }

}
