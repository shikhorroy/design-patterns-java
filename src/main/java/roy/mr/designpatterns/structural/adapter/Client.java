package roy.mr.designpatterns.structural.adapter;

import roy.mr.designpatterns.structural.adapter.oldlogger.AppLogger;
import roy.mr.designpatterns.structural.adapter.oldlogger.AppLoggerImpl;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.process(new AppLoggerImpl());
        client.process(new NewLoggerAdapter());
    }

    void process(AppLogger logger) {
        System.out.println("I am working...");
        logger.log("work completed");
    }
}
