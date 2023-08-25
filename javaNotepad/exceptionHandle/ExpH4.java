import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpH4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      System.out.println("Enter second number: ");
      int s = sc.nextInt();

      System.out.println("Divide is: " + (n / s));
    } catch (ArithmeticException e) {
      System.out.println("Denominator can't zero: ");
    } catch (InputMismatchException e) {
      System.out.println("please enter only integer value: ");
    }
  }
}
