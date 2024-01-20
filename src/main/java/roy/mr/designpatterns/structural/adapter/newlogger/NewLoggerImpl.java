package roy.mr.designpatterns.structural.adapter.newlogger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewLoggerImpl implements NewLogger {
    @Override
    public void log(Message message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy@ HH:mm:ss")) + "] " + message.message());
    }
}
