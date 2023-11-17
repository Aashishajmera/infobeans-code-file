import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = sc.nextInt();

    int factorial = 1;

    // for (int i = n; i >= 2; i--) {
    //   factorial *= i; // factorial = factorial * i
    // }
    // System.out.println(factorial);


    int i = n;
        while (i != 0) {
            factorial = factorial * i;
            i--;
        }
        System.out.println(factorial);
  }
}
