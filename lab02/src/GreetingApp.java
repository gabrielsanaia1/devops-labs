import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GreetingApp {
    public static void main(String[] args) throws IOException {
        Properties config = new Properties();
        try (FileInputStream input = new FileInputStream("lab02/app.properties")) {
            config.load(input);
        }

        String greeting = config.getProperty("greeting", "Hello");
        String target = config.getProperty("target", "DevOps");
        System.out.println(greeting + ", " + target + "! Welcome to Lab02.");
    }
}
