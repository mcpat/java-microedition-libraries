package java.lang;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

public class SecurityManager {
	/**
	 * @throws SecurityException
	 */
    public SecurityManager() {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkAccept(String host, int port) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkAccess(Thread t) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkAccess(ThreadGroup g) {}

    /**
     * @throws SecurityException
     */
    public void checkAwtEventQueueAccess() {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkConnect(String host, int port) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkConnect(String host, int port, Object context) {}

    /**
     * @throws SecurityException
     */
    public void checkCreateClassLoader() {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkDelete(String file) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkExec(String cmd) {}

    /**
     * @throws SecurityException
     */
    public void checkExit(int status) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkLink(String lib) {}

    /**
     * @throws SecurityException 
     */
    public void checkListen(int port) {}

    /**
     * @throws SecurityException
     * @throws NullPointerException
     */
    public void checkMemberAccess(Class clazz, int which) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkMulticast(InetAddress maddr) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkMulticast(InetAddress maddr, byte ttl) {}

    /**
     * @throws SecurityException
     * @throws NullPointerException
     */
    public void checkPackageAccess(String pkg) {}

    /**
     * @throws SecurityException
     */
    public void checkPackageDefinition(String pkg) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkPermission(Permission perm) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkPermission(Permission perm, Object context) {}

    /**
     * @throws SecurityException
     */
    public void checkPrintJobAccess() {}

    /**
     * @throws SecurityException 
     */
    public void checkPropertiesAccess() {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public void checkPropertyAccess(String key) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkRead(FileDescriptor fd) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkRead(String file) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkRead(String file, Object context) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public void checkSecurityAccess(String target) {}

    /**
     * @throws SecurityException
     */
    public void checkSetFactory() {}

    /**
     * @throws SecurityException
     */
    public void checkSystemClipboardAccess() {}

    /**
     * @throws NullPointerException
     */
    public boolean checkTopLevelWindow(Object window) {
        return false;
    }

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkWrite(FileDescriptor fd) {}

    /**
     * @throws SecurityException 
     * @throws NullPointerException
     */
    public void checkWrite(String file) {}

    protected Class[] getClassContext() {
        return null;
    }

    public Object getSecurityContext() {
        return null;
    }

    public ThreadGroup getThreadGroup() {
        return null;
    }

}
