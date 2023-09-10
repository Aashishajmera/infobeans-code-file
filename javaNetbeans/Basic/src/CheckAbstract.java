
import java.util.Scanner;

public class CheckAbstract {

    public static void m1(Scanner sc) throws Exception {
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("I am try block...");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        try {
            CheckAbstract.m1(sc);

        } catch (ArithmeticException e) {
            System.out.println("Something error...");
        } finally {
            System.out.println("I AM FINALLY BLOCK.");
        }

//        try {
//            int n = sc.nextInt();
//            System.out.println("I am try block ");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("I am finally block: ");
//        }
    }
}
