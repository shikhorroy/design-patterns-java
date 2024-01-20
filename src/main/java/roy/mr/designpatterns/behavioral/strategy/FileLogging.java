package roy.mr.designpatterns.behavioral.strategy;

public class FileLogging extends LoggingStrategy {
    @Override
    void log(String message) {
        System.out.println("file logging...");
        System.out.println(message);
    }
}
