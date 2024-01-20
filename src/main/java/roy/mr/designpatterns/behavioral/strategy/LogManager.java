package roy.mr.designpatterns.behavioral.strategy;

public class LogManager {
    private LoggingStrategy loggingStrategy;

    public void setLoggingStrategy(LoggingStrategy loggingStrategy) {
        this.loggingStrategy = loggingStrategy;
    }

    public void performLog(String message) {
        loggingStrategy.log(message);
    }
}
