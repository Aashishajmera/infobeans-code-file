import java.util.Scanner;

public class UpperCase {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter something....");
    String s = sc.nextLine();

    System.out.println("Original Input is: " + s);

    String newStr = "";

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) <= 122 && s.charAt(i) >= 97) {
        newStr += (char) (s.charAt(i) - 32);
      } else {
        newStr += s.charAt(i);
      }
    }

    System.out.println(newStr);
  }
}
