import java.util.Scanner;

public class StaticBlck {
  static {
      Scanner sc = new Scanner(System.in);

    System.out.println("I am static block: ");
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Enter second number: ");
    int n2 = sc.nextInt();

    System.out.println("Addition is: " + (n + n2));
  }

  public static void main(String[] args) {
    System.out.println("I am main method: ");
  }
}
