package java.io;

import java.net.MalformedURLException;
import java.net.URL;

public class File implements Serializable, Comparable {
    public final static String pathSeparator;
    public final static char pathSeparatorChar;
    public final static String separator;
    public final static char separatorChar;

	static {
		separator= "";
		separatorChar= 's';
		pathSeparator= "";
		pathSeparatorChar= 'p';
	}
	
	/**
	 * @throws IllegalArgumentException
	 * @throws IOException
	 * @throws SecurityException
	 */
    public static File createTempFile(String prefix, String suffix, File directory) throws IOException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws IOException
     * @throws SecurityException
     */
    public static File createTempFile(String prefix, String suffix) throws IOException {
        return null;
    }

    public static File[] listRoots() {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public File(String pathname) {}
   
    /**
     * @throws NullPointerException
     */
    public File(String parent, String child) {}
    
    /**
     * @throws NullPointerException
     */
    public File(File parent, String child) {}

    /**
     * @throws SecurityException
     */
    public boolean canRead() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean canWrite() {
        return false;
    }

    public int compareTo(File pathname) {
        return 0;
    }

    public int compareTo(Object o) {
        return 0;
    }

    /**
     * @throws SecurityException
     * @throws IOException
     */
    public boolean createNewFile() throws IOException {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean delete() {
        return false;
    }
    
    /**
     * @throws SecurityException
     */
    public void deleteOnExit() {}

    public boolean equals(Object arg0) {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean exists() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public File getAbsoluteFile() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public String getAbsolutePath() {
        return null;
    }

    /**
     * @throws IOException
     * @throws SecurityException
     */
    public File getCanonicalFile() throws IOException {
        return null;
    }

    /**
     * @throws IOException
     * @throws SecurityException
     */
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

    /**
     * @throws SecurityException
     */
    public boolean isDirectory() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean isFile() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean isHidden() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public long lastModified() {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public long length() {
        return 0;
    }

    /**
     * @throws SecurityException
     */
    public String[] list() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public String[] list(FilenameFilter filter) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public File[] listFiles() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public File[] listFiles(FilenameFilter filter) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public File[] listFiles(FileFilter filter) {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public boolean mkdir() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean mkdirs() {
        return false;
    }

    /**
     * @throws SecurityException
     * @throws NullPointerException
     */
    public boolean renameTo(File dest) {
        return false;
    }

    /**
     * @throws SecurityException
     * @throws IllegalArgumentException
     */
    public boolean setLastModified(long time) {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public boolean setReadOnly() {
        return false;
    }

    public String toString() {
        return null;
    }

    /**
     * @throws MalformedURLException
     */
    public URL toURL() throws MalformedURLException {
        return null;
    }

}
