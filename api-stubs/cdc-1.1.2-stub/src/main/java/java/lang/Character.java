package java.lang;

import java.io.Serializable;

public final class Character implements Serializable, Comparable {
	public static class Subset {
	    protected Subset(String name) {}

	    public final boolean equals(Object obj) {
	        return false;
	    }

	    public final int hashCode() {
	        return 0;
	    }

	    public final String toString() {
	        return null;
	    }

	}
	
	public final static class UnicodeBlock extends Character.Subset {
	    public final static UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
	    public final static UnicodeBlock ARABIC;
	    public final static UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
	    public final static UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
	    public final static UnicodeBlock ARMENIAN;
	    public final static UnicodeBlock ARROWS;
	    public final static UnicodeBlock BASIC_LATIN;
	    public final static UnicodeBlock BENGALI;
	    public final static UnicodeBlock BLOCK_ELEMENTS;
	    public final static UnicodeBlock BOPOMOFO;
	    public final static UnicodeBlock BOPOMOFO_EXTENDED;
	    public final static UnicodeBlock BOX_DRAWING;
	    public final static UnicodeBlock BRAILLE_PATTERNS;
	    public final static UnicodeBlock CHEROKEE;
	    public final static UnicodeBlock CJK_COMPATIBILITY;
	    public final static UnicodeBlock CJK_COMPATIBILITY_FORMS;
	    public final static UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
	    public final static UnicodeBlock CJK_RADICALS_SUPPLEMENT;
	    public final static UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
	    public final static UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
	    public final static UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
	    public final static UnicodeBlock COMBINING_DIACRITICAL_MARKS;
	    public final static UnicodeBlock COMBINING_HALF_MARKS;
	    public final static UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
	    public final static UnicodeBlock CONTROL_PICTURES;
	    public final static UnicodeBlock CURRENCY_SYMBOLS;
	    public final static UnicodeBlock CYRILLIC;
	    public final static UnicodeBlock DEVANAGARI;
	    public final static UnicodeBlock DINGBATS;
	    public final static UnicodeBlock ENCLOSED_ALPHANUMERICS;
	    public final static UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
	    public final static UnicodeBlock ETHIOPIC;
	    public final static UnicodeBlock GENERAL_PUNCTUATION;
	    public final static UnicodeBlock GEOMETRIC_SHAPES;
	    public final static UnicodeBlock GEORGIAN;
	    public final static UnicodeBlock GREEK;
	    public final static UnicodeBlock GREEK_EXTENDED;
	    public final static UnicodeBlock GUJARATI;
	    public final static UnicodeBlock GURMUKHI;
	    public final static UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
	    public final static UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
	    public final static UnicodeBlock HANGUL_JAMO;
	    public final static UnicodeBlock HANGUL_SYLLABLES;
	    public final static UnicodeBlock HEBREW;
	    public final static UnicodeBlock HIRAGANA;
	    public final static UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
	    public final static UnicodeBlock IPA_EXTENSIONS;
	    public final static UnicodeBlock KANBUN;
	    public final static UnicodeBlock KANGXI_RADICALS;
	    public final static UnicodeBlock KANNADA;
	    public final static UnicodeBlock KATAKANA;
	    public final static UnicodeBlock KHMER;
	    public final static UnicodeBlock LAO;
	    public final static UnicodeBlock LATIN_1_SUPPLEMENT;
	    public final static UnicodeBlock LATIN_EXTENDED_A;
	    public final static UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
	    public final static UnicodeBlock LATIN_EXTENDED_B;
	    public final static UnicodeBlock LETTERLIKE_SYMBOLS;
	    public final static UnicodeBlock MALAYALAM;
	    public final static UnicodeBlock MATHEMATICAL_OPERATORS;
	    public final static UnicodeBlock MISCELLANEOUS_SYMBOLS;
	    public final static UnicodeBlock MISCELLANEOUS_TECHNICAL;
	    public final static UnicodeBlock MONGOLIAN;
	    public final static UnicodeBlock MYANMAR;
	    public final static UnicodeBlock NUMBER_FORMS;
	    public final static UnicodeBlock OGHAM;
	    public final static UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
	    public final static UnicodeBlock ORIYA;
	    public final static UnicodeBlock PRIVATE_USE_AREA;
	    public final static UnicodeBlock RUNIC;
	    public final static UnicodeBlock SINHALA;
	    public final static UnicodeBlock SMALL_FORM_VARIANTS;
	    public final static UnicodeBlock SPACING_MODIFIER_LETTERS;
	    public final static UnicodeBlock SPECIALS;
	    public final static UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
	    public final static UnicodeBlock SURROGATES_AREA;
	    public final static UnicodeBlock SYRIAC;
	    public final static UnicodeBlock TAMIL;
	    public final static UnicodeBlock TELUGU;
	    public final static UnicodeBlock THAANA;
	    public final static UnicodeBlock THAI;
	    public final static UnicodeBlock TIBETAN;
	    public final static UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
	    public final static UnicodeBlock YI_RADICALS;
	    public final static UnicodeBlock YI_SYLLABLES;
	    
		static {
			ALPHABETIC_PRESENTATION_FORMS= new UnicodeBlock(null);
			ARABIC= new UnicodeBlock(null);
		    ARABIC_PRESENTATION_FORMS_A= new UnicodeBlock(null);
		    ARABIC_PRESENTATION_FORMS_B= new UnicodeBlock(null);
		    ARMENIAN= new UnicodeBlock(null);
		    ARROWS= new UnicodeBlock(null);
		    BASIC_LATIN= new UnicodeBlock(null);
		    BENGALI= new UnicodeBlock(null);
		    BLOCK_ELEMENTS= new UnicodeBlock(null);
		    BOPOMOFO= new UnicodeBlock(null);
		    BOPOMOFO_EXTENDED= new UnicodeBlock(null);
		    BOX_DRAWING= new UnicodeBlock(null);
		    BRAILLE_PATTERNS= new UnicodeBlock(null);
		    CHEROKEE= new UnicodeBlock(null);
		    CJK_COMPATIBILITY= new UnicodeBlock(null);
		    CJK_COMPATIBILITY_FORMS= new UnicodeBlock(null);
		    CJK_COMPATIBILITY_IDEOGRAPHS= new UnicodeBlock(null);
		    CJK_RADICALS_SUPPLEMENT= new UnicodeBlock(null);
		    CJK_SYMBOLS_AND_PUNCTUATION= new UnicodeBlock(null);
		    CJK_UNIFIED_IDEOGRAPHS= new UnicodeBlock(null);
		    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A= new UnicodeBlock(null);
		    COMBINING_DIACRITICAL_MARKS= new UnicodeBlock(null);
		    COMBINING_HALF_MARKS= new UnicodeBlock(null);
		    COMBINING_MARKS_FOR_SYMBOLS= new UnicodeBlock(null);
		    CONTROL_PICTURES= new UnicodeBlock(null);
		    CURRENCY_SYMBOLS= new UnicodeBlock(null);
		    CYRILLIC= new UnicodeBlock(null);
		    DEVANAGARI= new UnicodeBlock(null);
		    DINGBATS= new UnicodeBlock(null);
		    ENCLOSED_ALPHANUMERICS = new UnicodeBlock(null);
		    ENCLOSED_CJK_LETTERS_AND_MONTHS= new UnicodeBlock(null);
		    ETHIOPIC= new UnicodeBlock(null);
		    GENERAL_PUNCTUATION= new UnicodeBlock(null);
		    GEOMETRIC_SHAPES= new UnicodeBlock(null);
		    GEORGIAN= new UnicodeBlock(null);
		    GREEK= new UnicodeBlock(null);
		    GREEK_EXTENDED= new UnicodeBlock(null);
		    GUJARATI= new UnicodeBlock(null);
		    GURMUKHI= new UnicodeBlock(null);
		    HALFWIDTH_AND_FULLWIDTH_FORMS= new UnicodeBlock(null);
		    HANGUL_COMPATIBILITY_JAMO= new UnicodeBlock(null);
		    HANGUL_JAMO= new UnicodeBlock(null);
		    HANGUL_SYLLABLES= new UnicodeBlock(null);
		    HEBREW= new UnicodeBlock(null);
		    HIRAGANA= new UnicodeBlock(null);
		    IDEOGRAPHIC_DESCRIPTION_CHARACTERS= new UnicodeBlock(null);
		    IPA_EXTENSIONS= new UnicodeBlock(null);
		    KANBUN= new UnicodeBlock(null);
		    KANGXI_RADICALS= new UnicodeBlock(null);
		    KANNADA= new UnicodeBlock(null);
		    KATAKANA= new UnicodeBlock(null);
		    KHMER= new UnicodeBlock(null);
		    LAO= new UnicodeBlock(null);
		    LATIN_1_SUPPLEMENT= new UnicodeBlock(null);
		    LATIN_EXTENDED_A= new UnicodeBlock(null);
		    LATIN_EXTENDED_ADDITIONAL= new UnicodeBlock(null);
		    LATIN_EXTENDED_B= new UnicodeBlock(null);
		    LETTERLIKE_SYMBOLS= new UnicodeBlock(null);
		    MALAYALAM= new UnicodeBlock(null);
		    MATHEMATICAL_OPERATORS= new UnicodeBlock(null);
		    MISCELLANEOUS_SYMBOLS= new UnicodeBlock(null);
		    MISCELLANEOUS_TECHNICAL= new UnicodeBlock(null);
		    MONGOLIAN= new UnicodeBlock(null);
		    MYANMAR= new UnicodeBlock(null);
		    NUMBER_FORMS= new UnicodeBlock(null);
		    OGHAM= new UnicodeBlock(null);
		    OPTICAL_CHARACTER_RECOGNITION= new UnicodeBlock(null);
		    ORIYA= new UnicodeBlock(null);
		    PRIVATE_USE_AREA= new UnicodeBlock(null);
		    RUNIC= new UnicodeBlock(null);
		    SINHALA= new UnicodeBlock(null);
		    SMALL_FORM_VARIANTS= new UnicodeBlock(null);
		    SPACING_MODIFIER_LETTERS= new UnicodeBlock(null);
		    SPECIALS= new UnicodeBlock(null);
		    SUPERSCRIPTS_AND_SUBSCRIPTS= new UnicodeBlock(null);
		    SURROGATES_AREA= new UnicodeBlock(null);
		    SYRIAC= new UnicodeBlock(null);
		    TAMIL= new UnicodeBlock(null);
		    TELUGU= new UnicodeBlock(null);
		    THAANA= new UnicodeBlock(null);
		    THAI= new UnicodeBlock(null);
		    TIBETAN= new UnicodeBlock(null);
		    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS= new UnicodeBlock(null);
		    YI_RADICALS= new UnicodeBlock(null);
		    YI_SYLLABLES= new UnicodeBlock(null);
			
		}
		
		private UnicodeBlock(String name) {
			super(name);
		}


	    public static UnicodeBlock of(char c) {
	        return null;
	    }


	}
	
	public static final byte COMBINING_SPACING_MARK= 8;
	public static final byte CONNECTOR_PUNCTUATION=	23;
	public static final byte CONTROL= 15;
	public static final byte CURRENCY_SYMBOL= 26;
	public static final byte DASH_PUNCTUATION= 20;
	public static final byte DECIMAL_DIGIT_NUMBER= 9;
	public static final byte DIRECTIONALITY_ARABIC_NUMBER= 6;
	public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL= 9;
	public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR= 7;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER= 3;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR= 4;
	public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR= 5;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT= 0;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING= 14;
	public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE= 15;
	public static final byte DIRECTIONALITY_NONSPACING_MARK= 8;
	public static final byte DIRECTIONALITY_OTHER_NEUTRALS= 13;
	public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR= 10; 
	public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT= 18;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT= 1;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC= 2;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING= 16;
	public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE= 17;
	public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR= 11;
	public static final byte DIRECTIONALITY_UNDEFINED= -1;
	public static final byte DIRECTIONALITY_WHITESPACE= 12;
	public static final byte ENCLOSING_MARK= 7;
	public static final byte END_PUNCTUATION= 22;
	public static final byte FINAL_QUOTE_PUNCTUATION= 30;
	public static final byte FORMAT= 16;
	public static final byte INITIAL_QUOTE_PUNCTUATION= 29;
	public static final byte LETTER_NUMBER= 10;
	public static final byte LINE_SEPARATOR= 13;
	public static final byte LOWERCASE_LETTER= 2;
	public static final byte MATH_SYMBOL= 25;
	public static final int	MAX_RADIX= 36;
	public static final char MAX_VALUE= 65535;
	public static final int	MIN_RADIX= 2;
	public static final char MIN_VALUE= 0;
	public static final byte MODIFIER_LETTER= 4;
	public static final byte MODIFIER_SYMBOL= 27;
	public static final byte NON_SPACING_MARK= 6;
	public static final byte OTHER_LETTER= 5;
	public static final byte OTHER_NUMBER= 11;
	public static final byte OTHER_PUNCTUATION= 24;
	public static final byte OTHER_SYMBOL= 28;
	public static final byte PARAGRAPH_SEPARATOR= 14;
	public static final byte PRIVATE_USE= 18;
	public static final byte SPACE_SEPARATOR= 12;
	public static final byte START_PUNCTUATION= 21;
	public static final byte SURROGATE= 19;
	public static final byte TITLECASE_LETTER= 3;
	public static final Class TYPE;
	public static final byte UNASSIGNED= 0;
	public static final byte UPPERCASE_LETTER= 1;

	static {
	    TYPE= Class.class;
	}

    public static int digit(char ch, int radix) {
        return 0;
    }

    public static char forDigit(int digit, int radix) {
        return 0;
    }

    public static byte getDirectionality(char ch) {
        return 0;
    }

    public static int getNumericValue(char ch) {
        return 0;
    }

    public static int getType(char ch) {
        return 0;
    }

    public static boolean isDefined(char ch) {
        return false;
    }

    public static boolean isDigit(char ch) {
        return false;
    }

    public static boolean isIdentifierIgnorable(char ch) {
        return false;
    }

    public static boolean isISOControl(char ch) {
        return false;
    }

    public static boolean isJavaIdentifierPart(char ch) {
        return false;
    }

    public static boolean isJavaIdentifierStart(char ch) {
        return false;
    }

    public static boolean isLetter(char ch) {
        return false;
    }

    public static boolean isLetterOrDigit(char ch) {
        return false;
    }

    public static boolean isLowerCase(char ch) {
        return false;
    }

    public static boolean isMirrored(char ch) {
        return false;
    }

    public static boolean isSpaceChar(char ch) {
        return false;
    }

    public static boolean isTitleCase(char ch) {
        return false;
    }

    public static boolean isUnicodeIdentifierPart(char ch) {
        return false;
    }

    public static boolean isUnicodeIdentifierStart(char ch) {
        return false;
    }

    public static boolean isUpperCase(char ch) {
        return false;
    }

    public static boolean isWhitespace(char ch) {
        return false;
    }

    public static char toLowerCase(char ch) {
        return 0;
    }

    public static String toString(char c) {
        return null;
    }

    public static char toTitleCase(char ch) {
        return 0;
    }

    public static char toUpperCase(char ch) {
        return 0;
    }


    public Character(char value) {}

    public char charValue() {
        return 0;
    }

    public int compareTo(Character anotherCharacter) {
        return 0;
    }

    /**
     * @throws ClassCastException 
     */
    public int compareTo(Object o) {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

}
