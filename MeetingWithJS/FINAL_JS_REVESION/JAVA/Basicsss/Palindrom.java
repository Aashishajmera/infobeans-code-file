public class Palindrom {

  public boolean palindrom(int n) {
    int temp = n, lastDigit, rev = 0;
    while (n != 0) {
      lastDigit = n % 10;
      rev = rev * 10 + lastDigit;
      n /= 10;
    }

    return temp == rev;
  }

  public static void main(String... arg) {
    Palindrom p = new Palindrom();
    boolean flag = p.palindrom(121);
    if (flag) {
      System.out.println("Number is palindrom: ");
    } else {
      System.out.println("Number is not palindrom: ");
    }
  }
}
