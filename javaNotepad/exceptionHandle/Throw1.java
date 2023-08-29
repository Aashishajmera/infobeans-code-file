import java.util.Scanner;

class SmallAgeException extends Exception {

  SmallAgeException(String msg) {
    super(msg);
  }
}

public class Throw1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");

    boolean flag = true;
    do {
      try {
        int age = sc.nextInt();
        flag = false;
        if (age <= 18) {
          throw new SmallAgeException("your age is less than 18 ");
        } else {
          System.out.println("your eligible for voFting: ");
        }
      } catch (Exception e) {
        if (e.getClass().getName().contains("InputMismatchException")) {
          System.out.println("Please re-enter age(integer) ");
          sc.nextLine();
          flag = true;
        } else if (e.getClass().getName().contains("SmallAgeException")) {
          System.out.println("Not eligible for voting Because your age is lessthan 18 ");
        }
      }
    } while (flag);
    System.out.println("End code: ");
  }
}
