package java.lang;

import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.ProtectionDomain;

public final class Class implements Serializable {
	/**
	 * @throws LinkageError 
	 * @throws ExceptionInInitializerError 
	 * @throws ClassNotFoundException 
	 */
    public static Class forName(String className) throws ClassNotFoundException {
        return null;
    }

    /**
     * @throws LinkageError 
     * @throws ExceptionInInitializerError 
     * @throws ClassNotFoundException
     */
    public static Class forName(String name, boolean initialize, ClassLoader loader) throws ClassNotFoundException {
        return null;
    }


    public boolean desiredAssertionStatus() {
        return false;
    }

    /**
     * @throws SecurityException
     */
    public Class[] getClasses() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public ClassLoader getClassLoader() {
        return null;
    }

    public Class getComponentType() {
        return null;
    }

    /**
     * @throws NoSuchMethodException
     * @throws SecurityException
     */
    public Constructor getConstructor(Class[] parameterTypes) throws NoSuchMethodException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Constructor[] getConstructors() throws SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Class[] getDeclaredClasses() throws SecurityException {
        return null;
    }

    /**
     * @throws NoSuchMethodException
     * @throws SecurityException
     */
    public Constructor getDeclaredConstructor(Class[] parameterTypes) throws NoSuchMethodException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Constructor[] getDeclaredConstructors() throws SecurityException {
        return null;
    }

    /**
     * @throws NoSuchFieldException 
     * @throws NullPointerException 
     * @throws SecurityException
     */
    public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Field[] getDeclaredFields() throws SecurityException {
        return null;
    }

    /**
     * @throws NoSuchFieldException 
     * @throws NullPointerException 
     * @throws SecurityException
     */
    public Method getDeclaredMethod(String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Method[] getDeclaredMethods() throws SecurityException {
        return null;
    }

    public Class getDeclaringClass() {
        return null;
    }

    /**
     * @throws NoSuchFieldException
     * @throws SecurityException
     * @throws NullPointerException
     */
    public Field getField(String name) throws NoSuchFieldException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Field[] getFields() throws SecurityException {
        return null;
    }

    public Class[] getInterfaces() {
        return null;
    }

    /**
     * @throws NoSuchFieldException
     * @throws SecurityException
     * @throws NullPointerException
     */
    public Method getMethod(String name, Class[] parameterTypes) throws NoSuchMethodException, SecurityException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public Method[] getMethods() throws SecurityException {
        return null;
    }

    public int getModifiers() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public Package getPackage() {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public ProtectionDomain getProtectionDomain() {
        return null;
    }

    public URL getResource(String name) {
        return null;
    }

    /**
     * @throws NullPointerException
     */
    public InputStream getResourceAsStream(String name) {
        return null;
    }

    public Object[] getSigners() {
        return null;
    }

    public Class getSuperclass() {
    	return null;
    }

    public boolean isArray() {
        return false;
    }

    /**
     * @throws NullPointerException
     */
    public boolean isAssignableFrom(Class cls) {
        return false;
    }

    public boolean isInstance(Object obj) {
        return false;
    }

    public boolean isInterface() {
        return false;
    }

    public boolean isPrimitive() {
        return false;
    }

    /**
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @throws ExceptionInInitializerError 
     * @throws SecurityException
     */
    public Object newInstance() throws InstantiationException, IllegalAccessException {
        return null;
    }

    public String toString() {
        return null;
    }

}
