import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter first number: ");
      int f = sc.nextInt();
      System.out.println("Enter second number: ");
      int s = sc.nextInt();
      int c = f/s;

    } catch (ArithmeticException e) {
        System.out.println("1");
        e.printStackTrace();
        System.out.println("2");
        System.out.println(e.getMessage());
        System.out.println("3");
        System.out.println(e.getClass()+"\n 4");
        System.out.println(e +"\n 5");
        System.out.println(e.toString());
    }
  }
}
