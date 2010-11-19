package java.security;

public interface Principal {
    boolean equals(Object arg0);

    String getName();

    int hashCode();

    String toString();

}
