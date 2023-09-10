
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Success...");

        }

    }
}
