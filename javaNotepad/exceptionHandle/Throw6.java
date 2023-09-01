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

  public void m1(Scanner sc){
    boolean flag = true;
    System.out.println("Enter age: ");
  do{
      try {
      int age = sc.nextInt();

      if (age < 18) {
        flag = true;
        throw new UnderAgeException("you are age is less then 18");
      } else {
        flag = false;
        System.out.println("Your are eligible for voting: ");
      }
    } 
    
    catch ( Exception e){
       if(e.getClass().getName().contains("InputMismatchException")){
        sc.nextLine();
        System.out.println("wrong input: ");
        flag = true;
        
       }else if(e.getClass().getName().contains("UnderAgeException")){
        System.out.println("less then 18: ");
       }
    }
  }while(flag);

  }
}

public class Throw6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // create object of voting class:
    Voting objV = new Voting();
    objV.m1(sc);

  }
}
