package java.lang.reflect;

public interface Member {
    int DECLARED;
    int PUBLIC;

    Class getDeclaringClass();

    int getModifiers();

    String getName();

}
