package javax.microedition.rms;

public class RecordStore {
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
     */
    public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) throws RecordStoreException, RecordStoreFullException, RecordStoreNotFoundException {
        return null;
    }

    /**
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     * @throws RecordStoreFullException
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
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
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

    public void removeRecordListener(RecordListener arg0) {}

    /**
     * @throws RecordStoreNotOpenException
     * @throws InvalidRecordIDException
     * @throws RecordStoreException
     * @throws RecordStoreFullException
     */
    public void setRecord(int recordId, byte[] newData, int offset, int numBytes) throws RecordStoreNotOpenException, InvalidRecordIDException, RecordStoreException, RecordStoreFullException {}

}
