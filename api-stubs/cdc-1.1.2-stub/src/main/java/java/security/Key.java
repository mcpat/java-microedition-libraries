package java.security;

import java.io.Serializable;

public interface Key extends Serializable {
	long serialVersionUID= 6603384152749567654l;

    String getAlgorithm();

    byte[] getEncoded();

    String getFormat();

}
