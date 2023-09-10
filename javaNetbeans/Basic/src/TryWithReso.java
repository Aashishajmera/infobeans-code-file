
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithReso {

    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
            System.out.println("Error.......");
            writer.println("Hello World");
            System.out.println("After error......");
        }
        System.out.println("Success......");

    }
}
