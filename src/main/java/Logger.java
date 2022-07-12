public class Logger {
    /*
     * A private static member variable of the type Logger
     * that will be the only instance of Logger ever created
     */
    private static Logger logger = null;
    private int currentLine = 0;

    /*
     * A private constructor, so that the singleton class can
     * never be created with the new keyword, like regular classes can
     */
    private Logger() {}

    /*
     * A static, public method, let's call it getInstance(),
     * that either returns the existing single instance of the class
     * or creates the single instance if it hasn't already been created and then returns it
     */
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        currentLine++;
        System.out.println(currentLine + "::" + msg);
    }

    public int getCurrentLine() {
        return currentLine;
    }

}
