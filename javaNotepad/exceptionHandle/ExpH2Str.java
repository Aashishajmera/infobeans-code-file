import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpH2Str {

  public static void main(String args[]) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string:");
    String s1 = sc.nextLine();
    try {
      System.out.println("Enter search index value: ");
      int index = sc.nextInt();
      System.out.println("index value is: " + (s1.charAt(index)));
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Out of bound exception: ");
    } catch (InputMismatchException k) {
      System.out.println("please enter only digit: ;");
    }
  }
}
