package roy.mr.designpatterns.behavioral.strategy;

public class ConsoleLogging extends LoggingStrategy {
    @Override
    void log(String message) {
        System.out.println("console logging...");
        System.out.println(message);
    }
}
