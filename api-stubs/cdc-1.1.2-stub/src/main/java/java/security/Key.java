package java.security;

public interface Key extends Serializable {
    long serialVersionUID;

    String getAlgorithm();

    byte[] getEncoded();

    String getFormat();

}
