package java.lang;
/**
 * @since CLDC 1.0 
 */

import java.io.InputStream;

public final class Class {

	/**
	 * @throws ClassNotFoundException
	 * @throws Error
	 */
	public static Class forName(String className) throws ClassNotFoundException {
		return null;
	}
	
	private Class() {}
	
	public String getName() {
		return null;
		
	}
	
	public InputStream getResourceAsStream(String name) {
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

	/**
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public Object newInstance() throws InstantiationException, IllegalAccessException {
		return null;
	}
	
	public String toString() {
		return null;
		
	}
}
