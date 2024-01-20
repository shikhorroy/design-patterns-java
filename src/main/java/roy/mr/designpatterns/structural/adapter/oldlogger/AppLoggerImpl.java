package roy.mr.designpatterns.structural.adapter.oldlogger;

public class AppLoggerImpl implements AppLogger {
    @Override
    public void log(String message) {
        System.out.println("Log [" + message + "]");
    }
}
