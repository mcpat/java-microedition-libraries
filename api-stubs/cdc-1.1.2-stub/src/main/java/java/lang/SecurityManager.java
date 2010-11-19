package java.lang;

public class SecurityManager {
    public SecurityManager() {}

    public void checkAccept(String arg0, int arg1) {}

    public void checkAccess(Thread arg0) {}

    public void checkAccess(ThreadGroup arg0) {}

    public void checkAwtEventQueueAccess() {}

    public void checkConnect(String arg0, int arg1) {}

    public void checkConnect(String arg0, int arg1, Object arg2) {}

    public void checkCreateClassLoader() {}

    public void checkDelete(String arg0) {}

    public void checkExec(String arg0) {}

    public void checkExit(int arg0) {}

    public void checkLink(String arg0) {}

    public void checkListen(int arg0) {}

    public void checkMemberAccess(Class arg0, int arg1) {}

    public void checkMulticast(InetAddress arg0) {}

    public void checkMulticast(InetAddress arg0, byte arg1) {}

    public void checkPackageAccess(String arg0) {}

    public void checkPackageDefinition(String arg0) {}

    public void checkPermission(Permission arg0) {}

    public void checkPermission(Permission arg0, Object arg1) {}

    public void checkPrintJobAccess() {}

    public void checkPropertiesAccess() {}

    public void checkPropertyAccess(String arg0) {}

    public void checkRead(FileDescriptor arg0) {}

    public void checkRead(String arg0) {}

    public void checkRead(String arg0, Object arg1) {}

    public void checkSecurityAccess(String arg0) {}

    public void checkSetFactory() {}

    public void checkSystemClipboardAccess() {}

    public boolean checkTopLevelWindow(Object arg0) {
        return false;
    }

    public void checkWrite(FileDescriptor arg0) {}

    public void checkWrite(String arg0) {}

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
