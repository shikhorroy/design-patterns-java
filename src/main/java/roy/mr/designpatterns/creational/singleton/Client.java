package roy.mr.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("hello world");

        logger.log(String.valueOf(logger.equals(Logger.getInstance())));
        logger.log(String.valueOf(logger.equals(Logger.getInstance())));
    }
}
