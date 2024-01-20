package roy.mr.designpatterns.structural.adapter;

import roy.mr.designpatterns.structural.adapter.newlogger.Message;
import roy.mr.designpatterns.structural.adapter.newlogger.NewLogger;
import roy.mr.designpatterns.structural.adapter.newlogger.NewLoggerImpl;
import roy.mr.designpatterns.structural.adapter.oldlogger.AppLogger;

public class NewLoggerAdapter implements AppLogger {
    NewLogger logger = new NewLoggerImpl();

    @Override
    public void log(String message) {
        logger.log(new Message(message));
    }
}
