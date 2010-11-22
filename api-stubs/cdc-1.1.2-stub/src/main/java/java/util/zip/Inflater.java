package java.util.zip;

public class Inflater {
    public Inflater(boolean nowrap) {}
    public Inflater() {}

    public void end() {}

    protected void finalize() {}

    public boolean finished() {
        return false;
    }

    public int getAdler() {
        return 0;
    }

    public int getRemaining() {
        return 0;
    }

    public int getTotalIn() {
        return 0;
    }

    public int getTotalOut() {
        return 0;
    }

    /**
     * @throws DataFormatException
     */
    public int inflate(byte[] b) throws DataFormatException {
        return 0;
    }
    
    /**
     * @throws DataFormatException
     */
    public int inflate(byte[] b, int off, int len) throws DataFormatException {
        return 0;
    }

    public boolean needsDictionary() {
        return false;
    }

    public boolean needsInput() {
        return false;
    }

    public void reset() {}

    public void setDictionary(byte[] b) {}
    
    public void setDictionary(byte[] b, int off, int len) {}

    public void setInput(byte[] b) {}
    
    public void setInput(byte[] b, int off, int len) {}

}
