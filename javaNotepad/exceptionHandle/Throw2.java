import java.util.InputMismatchException;
import java.util.Scanner;

class WholeNumberExection extends Exception {

  WholeNumberExection(String msg) {
    super(msg);
  }

  WholeNumberExection() {}
}

public class Throw2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a whole number: ");
    boolean flag = true;
    do {
      try {
        int n = sc.nextInt();
        flag = false;
        if (n < 0) {
          throw new WholeNumberExection("Not a whole number: ");
        } else { 
          System.out.println("Entered number is whole number: ");
        }
      } catch (WholeNumberExection e) {
        e.printStackTrace();
      } catch (InputMismatchException e) {
        System.out.println("please re-enter number(only integer)");
        sc.nextLine();
        flag = true;
      }
    } while (flag);
    System.out.println("Code end...");
  }
}
