import java.util.InputMismatchException;
import java.util.Scanner;

class UnderAgeException extends Exception {

  UnderAgeException() {
    super("you are under age: ");
  }

  UnderAgeException(String msg) {
    super(msg);
  }
}

class Voting {

  public void m1(Scanner sc) throws UnderAgeException{
    System.out.println("Enter age: ");
    // try {
      int age = sc.nextInt();

      if (age < 18) {
        throw new UnderAgeException("you are age is less then 18");
      } else {
        System.out.println("Your are eligible for voting: ");
      }
    // } catch (InputMismatchException e) {
    //   System.out.println("This is input missmatch: ");
    // }
    // catch(UnderAgeException e){
    //     System.out.println("your are small: ");
    // }
  }
}

public class Throws5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create object of voting class:
    Voting objV = new Voting();
    // objV.m1(sc);

    try {
      objV.m1(sc);
    } catch ( UnderAgeException e){
      System.out.println("Under age: ");
    }
    catch(InputMismatchException k){
        System.out.println("input miss match");
    }
  }
}
