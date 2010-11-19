package java.lang.reflect;

public class Proxy implements Serializable {
    public static InvocationHandler getInvocationHandler(Object arg0) throws IllegalArgumentException {
        return null;
    }

    public static Class getProxyClass(ClassLoader arg0, Class[] arg1) throws IllegalArgumentException {
        return null;
    }

    public static boolean isProxyClass(Class arg0) {
        return false;
    }

    public static Object newProxyInstance(ClassLoader arg0, Class[] arg1, InvocationHandler arg2) throws IllegalArgumentException {
        return null;
    }


    protected InvocationHandler h;

    protected Proxy(InvocationHandler arg0) {}

}
