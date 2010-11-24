package java.security;

public interface Principal {
    boolean equals(Object another);

    String getName();

    int hashCode();

    String toString();

}
