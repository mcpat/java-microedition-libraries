package java.lang.reflect;

public interface InvocationHandler {
    /**
     * @throws UndeclaredThrowableException
     */
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
