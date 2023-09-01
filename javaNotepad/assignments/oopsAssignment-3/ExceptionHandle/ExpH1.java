import java.util.Scanner;

public class ExpH1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    do {
      try {
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        flag = false;
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("Wrong input: ");
          sc.nextLine();
          flag = true;
        }
      }
    } while (flag);
  }
}
