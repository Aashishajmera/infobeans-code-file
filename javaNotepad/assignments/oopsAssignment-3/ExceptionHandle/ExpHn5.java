import java.util.InputMismatchException;
import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}


public class ExpHn5 {

    static void checkVot(Scanner sc){
        System.out.println("Enter your age: ");
        try{
             int age = sc.nextInt();
             if(age < 18){
                throw new AgeException("age is less than 18");
            }else{
                System.out.println("You are eligible for voting: ");
            }
        }catch(InputMismatchException e1){
            System.out.println("Wrong input: ");
        }
        catch(AgeException e){
            System.out.println("Under age: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
    // create constructor: 
    ExpHn5 obj = new ExpHn5();
    obj.checkVot(sc);

    //InputMismatchException
    //InputMismatchException
    }
}
