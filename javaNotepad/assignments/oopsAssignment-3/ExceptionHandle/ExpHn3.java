import java.util.Scanner;

class NotPrimeNumberException extends Exception {

  NotPrimeNumberException(String msg) {
    super(msg);
  }
}

class NegativeNumberException extends Exception{
  NegativeNumberException(String msg){
    super(msg);
  }
}

public class ExpHn3 {

  public void checkPrime(Scanner sc) {
    boolean flag = true;
    try {
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      if(n < 0){
        throw new NegativeNumberException("This is negative: ");
      }
      for(int i = 2; i < n/2; i++){
        if(n%i == 0){
          flag = false;
          break;
        }
      }
      if(flag && n > 1){
        System.out.println("prime ");
      }else{
        throw new NotPrimeNumberException("Hiii......");
      }
    } catch (Exception e) {
      if(e.getClass().getName().contains("InputMismatchException")){
        System.out.println("Wrong input: ");
      }else if(e.getClass().getName().contains("NotPrimeNumberException")){
        System.out.println("Not prime number: ");
      }else if(e.getClass().getName().contains("NegativeNumberException")){
        System.out.println("Negative number not allow: ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // create object of ExpHn3:
    ExpHn3 obj = new ExpHn3();
    obj.checkPrime(sc);
  }
}
