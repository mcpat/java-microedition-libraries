package javax.microedition.rms;

/**
 * @since MIDP 1.0
 */
public interface RecordFilter {
    boolean matches(byte[] candidate);

}
