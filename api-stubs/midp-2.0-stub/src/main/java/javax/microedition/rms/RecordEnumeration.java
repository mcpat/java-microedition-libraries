package javax.microedition.rms;

/**
 * @since MIDP 1.0 
 */
public interface RecordEnumeration {
    void destroy();

    boolean hasNextElement();

    boolean hasPreviousElement();

    boolean isKeptUpdated();

    void keepUpdated(boolean arg0);

    /**
     * @throws InvalidRecordIDException
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     */
    byte[] nextRecord() throws InvalidRecordIDException, RecordStoreNotOpenException, RecordStoreException;

    /**
     * @throws InvalidRecordIDException
     */
    int nextRecordId() throws InvalidRecordIDException;

    int numRecords();

    /**
     * @throws InvalidRecordIDException
     * @throws RecordStoreNotOpenException
     * @throws RecordStoreException
     */
    byte[] previousRecord() throws InvalidRecordIDException, RecordStoreNotOpenException, RecordStoreException;

    /**
     * @throws InvalidRecordIDException
     */
    int previousRecordId() throws InvalidRecordIDException;

    void rebuild();

    void reset();

}
