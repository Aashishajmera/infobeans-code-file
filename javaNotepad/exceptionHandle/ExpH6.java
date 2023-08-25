import java.util.InputMismatchException;
import java.util.Scanner;

class ExpH6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean flag = true, flag2 = true, flagD = true;
    int n = 0, s = 0;
    while (flagD) {
      try {
        if (flag) {
          System.out.println("Enter first number: ");
          n = sc.nextInt();
          flag = false;
          flagD = false;
        }
      } catch (InputMismatchException e) {
        System.out.println("please enter only integer: ");
        sc.nextLine();
        flagD = true;
        flag = true;
      }
    }
    flagD = true;
    while (flagD) {
      try {
        if (flag2) {
          System.out.println("Enter second Number: ");
          s = sc.nextInt();
          flag2 = false;
          flagD = false;
        }
        System.out.println("Divide is: " + (n / s));
      } catch (InputMismatchException err) {
        System.out.println("please Enter only integer: ");
        sc.nextLine();
        flagD = true;
        flag2 = true;
      } catch (ArithmeticException er) {
        System.out.println("Denominator can't be zero: ");
        sc.nextLine();
        flag2 = true;
        flagD = true;
      }
    }
  }
}