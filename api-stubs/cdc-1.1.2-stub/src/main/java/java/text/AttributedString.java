package java.text;

import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

public class AttributedString {
    public AttributedString(String text) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public AttributedString(String text, Map attributes) {}
    public AttributedString(AttributedCharacterIterator text) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public AttributedString(AttributedCharacterIterator text, int beginIndex, int endIndex) {}
    
    /**
     * @throws IllegalArgumentException
     */
    public AttributedString(AttributedCharacterIterator text, int beginIndex, int endIndex, AttributedCharacterIterator.Attribute[] attributes) {}

    /**
     * @throws IllegalArgumentException
     */
    public void addAttribute(Attribute attribute, Object value) {}

    /**
     * @throws IllegalArgumentException
     */
    public void addAttribute(Attribute attribute, Object value, int beginIndex, int endIndex) {}

    /**
     * @throws IllegalArgumentException
     */
    public void addAttributes(Map attributes, int beginIndex, int endIndex) {}

    public AttributedCharacterIterator getIterator() {
        return null;
    }

    public AttributedCharacterIterator getIterator(Attribute[] attributes) {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     */
    public AttributedCharacterIterator getIterator(Attribute[] attributes, int beginIndex, int endIndex) {
        return null;
    }

}
