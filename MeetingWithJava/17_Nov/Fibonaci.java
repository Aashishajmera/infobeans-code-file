import java.util.Scanner;

public class Fibonaci {

  public static void main(String[] args) {
    // 0 1 1 2 3 5 8

        /*
         0 = 0
         0 + 1 = 1
         1 + 1 = 2
         1 + 2 = 3
         2 + 3 = 5 
         3 + 5 = 8
         */

    int a = -1, b = 1, sum = 0;

    System.out.println("Enter any number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      a = b; // 1 0 1
      b = sum; // 0 1 1
      System.out.println(sum); // 0 1 1
      sum = a + b; // 1 1 2
    }
  }
}
