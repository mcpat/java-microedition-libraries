package java.io;

public class StreamTokenizer {
	public static final int	TT_EOF=	-1;
	public static final int	TT_EOL=	10;
	public static final int	TT_NUMBER= -2;
	public static final int	TT_WORD= -3;


    public double nval;
    public String sval;
    public int ttype;

    public StreamTokenizer(Reader r) {}

    public void commentChar(int ch) {}

    public void eolIsSignificant(boolean flag) {}

    public int lineno() {
        return 0;
    }

    public void lowerCaseMode(boolean fl) {}

    public int nextToken() throws IOException {
        return 0;
    }

    public void ordinaryChar(int ch) {}

    public void ordinaryChars(int low, int hi) {}

    public void parseNumbers() {}

    public void pushBack() {}

    public void quoteChar(int ch) {}

    public void resetSyntax() {}

    public void slashSlashComments(boolean flag) {}

    public void slashStarComments(boolean flag) {}

    public String toString() {
        return null;
    }

    public void whitespaceChars(int low, int hi) {}

    public void wordChars(int low, int hi) {}

}
