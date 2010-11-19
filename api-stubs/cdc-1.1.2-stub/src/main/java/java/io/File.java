package java.io;

public class File implements Serializable, Comparable {
    public final static String pathSeparator;
    public final static char pathSeparatorChar;
    public final static String separator;
    public final static char separatorChar;

    public static File createTempFile(String arg0, String arg1, File arg2) throws IOException {
        return null;
    }

    public static File createTempFile(String arg0, String arg1) throws IOException {
        return null;
    }

    public static File[] listRoots() {
        return null;
    }


    public File(String arg0) {}
    public File(String arg0, String arg1) {}
    public File(File arg0, String arg1) {}

    public boolean canRead() {
        return false;
    }

    public boolean canWrite() {
        return false;
    }

    public int compareTo(File arg0) {
        return 0;
    }

    public int compareTo(Object arg0) {
        return 0;
    }

    public boolean createNewFile() throws IOException {
        return false;
    }

    public boolean delete() {
        return false;
    }

    public void deleteOnExit() {}

    public boolean equals(Object arg0) {
        return false;
    }

    public boolean exists() {
        return false;
    }

    public File getAbsoluteFile() {
        return null;
    }

    public String getAbsolutePath() {
        return null;
    }

    public File getCanonicalFile() throws IOException {
        return null;
    }

    public String getCanonicalPath() throws IOException {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getParent() {
        return null;
    }

    public File getParentFile() {
        return null;
    }

    public String getPath() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isAbsolute() {
        return false;
    }

    public boolean isDirectory() {
        return false;
    }

    public boolean isFile() {
        return false;
    }

    public boolean isHidden() {
        return false;
    }

    public long lastModified() {
        return 0;
    }

    public long length() {
        return 0;
    }

    public String[] list() {
        return null;
    }

    public String[] list(FilenameFilter arg0) {
        return null;
    }

    public File[] listFiles() {
        return null;
    }

    public File[] listFiles(FilenameFilter arg0) {
        return null;
    }

    public File[] listFiles(FileFilter arg0) {
        return null;
    }

    public boolean mkdir() {
        return false;
    }

    public boolean mkdirs() {
        return false;
    }

    public boolean renameTo(File arg0) {
        return false;
    }

    public boolean setLastModified(long arg0) {
        return false;
    }

    public boolean setReadOnly() {
        return false;
    }

    public String toString() {
        return null;
    }

    public URL toURL() throws MalformedURLException {
        return null;
    }

}
