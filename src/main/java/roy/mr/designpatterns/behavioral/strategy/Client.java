package roy.mr.designpatterns.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        LogManager logManager = new LogManager();

        logManager.setLoggingStrategy(new ConsoleLogging());
        logManager.performLog("hello, I am good");

        logManager.setLoggingStrategy(new FileLogging());
        logManager.performLog("I love files!");

        logManager.setLoggingStrategy(new DataBaseLogging());
        logManager.performLog("database is awesome");
    }
}
