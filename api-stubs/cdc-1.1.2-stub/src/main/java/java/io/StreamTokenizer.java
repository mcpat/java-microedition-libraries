package java.io;

public class StreamTokenizer {
    public final static int TT_EOF;
    public final static int TT_EOL;
    public final static int TT_NUMBER;
    public final static int TT_WORD;

    public double nval;
    public String sval;
    public int ttype;

    public StreamTokenizer(Reader arg0) {}

    public void commentChar(int arg0) {}

    public void eolIsSignificant(boolean arg0) {}

    public int lineno() {
        return 0;
    }

    public void lowerCaseMode(boolean arg0) {}

    public int nextToken() throws IOException {
        return 0;
    }

    public void ordinaryChar(int arg0) {}

    public void ordinaryChars(int arg0, int arg1) {}

    public void parseNumbers() {}

    public void pushBack() {}

    public void quoteChar(int arg0) {}

    public void resetSyntax() {}

    public void slashSlashComments(boolean arg0) {}

    public void slashStarComments(boolean arg0) {}

    public String toString() {
        return null;
    }

    public void whitespaceChars(int arg0, int arg1) {}

    public void wordChars(int arg0, int arg1) {}

}
