package roy.mr.designpatterns.behavioral.strategy;

public class DataBaseLogging extends LoggingStrategy {
    @Override
    void log(String message) {
        System.out.println("db logging...");
        System.out.println(message);
    }
}
