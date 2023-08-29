import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeValueException extends Exception {

  NegativeValueException(String msg) {
    super(msg);
  }

}

class NewCll{
    public void Nega(Scanner sc) throws NegativeValueException{
        System.out.println("Entr n");
        int n = sc.nextInt();
       if(n < 0){
        throw new NegativeValueException("negative value is not allow: ");
       }
    }
}

public class Throws1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // NegativeValueException objjjj = new NegativeValueException("This is exception: ");




    NewCll obj = new NewCll();

    try{
        obj.Nega(sc);
    }catch(NegativeValueException e){
        System.out.println("hiiii");
    }

  }
}
