import java.util.Scanner;

public class Reverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int n = sc.nextInt();

    int rev = 0, rem;
    while (n != 0) {
      rem = n % 10;
      rev = (rev * 10) + rem;
      n /= 10;
    }
    System.out.println(rev);
  }
}
