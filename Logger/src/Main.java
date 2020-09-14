import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger slf4jLogger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        slf4jLogger.trace("Hello World!");

        String name = "Ashik";
        slf4jLogger.debug("Hi, {}", name);
        slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
        slf4jLogger.warn("Dummy warning message.");
        slf4jLogger.error("Dummy error message.");
    }
}
