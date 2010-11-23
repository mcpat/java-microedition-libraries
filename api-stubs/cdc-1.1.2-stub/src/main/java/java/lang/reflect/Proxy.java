package java.lang.reflect;

import java.io.Serializable;

public class Proxy implements Serializable {
    /**
     * @throws IllegalArgumentException
     */
    public static InvocationHandler getInvocationHandler(Object proxy) throws IllegalArgumentException {
        return null;
    }

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public static Class getProxyClass(ClassLoader loader, Class[] interfaces) throws IllegalArgumentException {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public static boolean isProxyClass(Class cl) {
        return false;
    }

    /**
     * @throws IllegalArgumentException
     * @throws NullPointerException
     */
    public static Object newProxyInstance(ClassLoader loader, Class[] interfaces, InvocationHandler h) throws IllegalArgumentException {
        return null;
    }


    protected InvocationHandler h;

    protected Proxy(InvocationHandler h) {}

}
