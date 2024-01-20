package roy.mr.designpatterns.creational.singleton;

public class Logger {
    private static Logger theLogger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (theLogger == null) {
            theLogger = new Logger();
        }
        return theLogger;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
