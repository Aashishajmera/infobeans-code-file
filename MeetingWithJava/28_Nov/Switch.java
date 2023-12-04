import java.util.Scanner;

public class Switch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any positive value");
    // int n = sc.nextInt();
    String s = sc.nextLine();

    // Expression
    // long  float and double

    // int a = 2;
    // int b = 4;

    switch (s) {
      case "1","3" -> System.out.println("case 1");
      case "2" -> System.out.println("case 4");
      default -> Syst em.out.println("default case");
    }
  }
}
