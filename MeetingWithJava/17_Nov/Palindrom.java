import java.util.Scanner;

public class Palindrom {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number for check the palindrom");
    int n = sc.nextInt();

    // 345 == 543    121 == 121

    int rev = 0, rem, temp = n;

    for (; n != 0; n /= 10) {
        rem = n % 10;
        rev = (rev * 10) + rem;
    }

    if (temp == rev) {
      System.out.println("palindrom");
    } else {
      System.out.println("not palindrom");
    }
  }
}
