package java.lang;

import java.io.File;
import java.io.IOException;

public class Runtime {
    public static Runtime getRuntime() {
        return null;
    }

    /**
     * @throws IllegalArgumentException 
     * @throws IllegalStateException 
     * @throws SecurityException
     */
    public void addShutdownHook(Thread hook) {}

    public int availableProcessors() {
        return 0;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String command) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String cmd, String[] envp) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String command, String[] envp, File dir) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String[] cmdarray) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String[] cmdarray, String[] envp) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException 
     * @throws IOException 
     * @throws NullPointerException 
     * @throws IllegalArgumentException
     */
    public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
        return null;
    }

    /**
     * @throws SecurityException
     */
    public void exit(int status) {}

    public long freeMemory() {
        return 0;
    }

    public void gc() {}

    /**
     * @throws SecurityException
     */
    public void halt(int status) {}

    /**
     * @throws SecurityException 
     * @throws UnsatisfiedLinkError
     */
    public void load(String filename) {}

    /**
     * @throws SecurityException 
     * @throws UnsatisfiedLinkError
     */
    public void loadLibrary(String libname) {}

    public long maxMemory() {
        return 0;
    }

    /**
     * @throws IllegalStateException 
     * @throws SecurityException
     */
    public boolean removeShutdownHook(Thread hook) {
        return false;
    }

    public void runFinalization() {}

    public long totalMemory() {
        return 0;
    }

    public void traceInstructions(boolean on) {}

    public void traceMethodCalls(boolean on) {}

}
