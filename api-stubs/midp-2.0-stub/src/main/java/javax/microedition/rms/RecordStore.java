package javax.microedition.rms;

/**
 * @since MIDP 1.0
 */
public class RecordStore {
	public static final int AUTHMODE_ANY= 1;
	public static final int AUTHMODE_PRIVATE= 0;

	/**
	 * @throws RecordStoreException
	 * @throws RecordStoreNotFoundException
	 */
    public static void deleteRecordStore(String recordStoreName) throws RecordStoreException, RecordStoreNotFoundException {}

    public static String[] listRecordStores() {
        return null;
    }

    /**
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     * @throws RecordStoreNotFoundException
     * @throws IllegalArgumentException
     */
    public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) throws RecordStoreException, RecordStoreFullException, RecordStoreNotFoundException {
        return null;
    }

    /**
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     * @throws RecordStoreNotFoundException
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary, int authmode, boolean writable) throws RecordStoreException, RecordStoreFullException, RecordStoreNotFoundException {
        return null;
    }

    /**
     * @throws RecordStoreException
     * @throws RecordStoreNotFoundException
     * @throws SecurityException
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public static RecordStore openRecordStore(String recordStoreName, String vendorName, String suiteName) throws RecordStoreException, RecordStoreNotFoundException {
        return null;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     * @throws SecurityException
     */
    public int addRecord(byte[] data, int offset, int numBytes) throws RecordStoreNotOpenException, RecordStoreException, RecordStoreFullException {
        return 0;
    }

    public void addRecordListener(RecordListener listener) {}

    /**
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     */
    public void closeRecordStore() throws RecordStoreNotOpenException, RecordStoreException {}

    /**
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     * @throws SecurityException
     */
    public void deleteRecord(int recordId) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException {}

    /**
     * @throws RecordStoreNotOpenException
     */
    public RecordEnumeration enumerateRecords(RecordFilter filter, RecordComparator comparator, boolean keepUpdated) throws RecordStoreNotOpenException {
        return null;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public long getLastModified() throws RecordStoreNotOpenException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public String getName() throws RecordStoreNotOpenException {
        return null;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     */
    public int getNextRecordID() throws RecordStoreNotOpenException, RecordStoreException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public int getNumRecords() throws RecordStoreNotOpenException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
     * @throws IndexOutOfBoundsException
     */
    public int getRecord(int recordId, byte[] buffer, int offset) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
     */
    public byte[] getRecord(int recordId) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException {
        return null;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
     */
    public int getRecordSize(int recordId) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public int getSize() throws RecordStoreNotOpenException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public int getSizeAvailable() throws RecordStoreNotOpenException {
        return 0;
    }

    /**
     * @throws RecordStoreNotOpenException
     */
    public int getVersion() throws RecordStoreNotOpenException {
        return 0;
    }

    public void removeRecordListener(RecordListener listener) {}

    /**
     * @throws RecordStoreException
     * @throws SecurityException
     * @throws IllegalArgumentException
     * @since MIDP 2.0
     */
    public void setMode(int authmode, boolean writable) throws RecordStoreException {}

    /**
     * @throws RecordStoreNotOpenException
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     * @throws SecurityException
     */
    public void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException, RecordStoreFullException {}

}
