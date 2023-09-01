import java.util.Scanner;

class UnderAgeException extends Exception{
    UnderAgeException(){
        super("you are under age: ");
    }

    UnderAgeException(String msg){
        super(msg);
    }

}

class Voting {
    public void m1(Scanner sc){
        System.out.println("Enter age: ");
        int age = sc.nextInt();
       try {
         if(age < 18){
             throw new UnderAgeException("you are age is less then 18");
         }else{
             System.out.println("Your are eligible for voting: ");
         }
       } catch (UnderAgeException e) {
        // e.printStackTrace();
        System.out.println("Hiii.");
    }
    }
}




public class Throws3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // create object of voting class: 
        Voting objV = new Voting();
        objV.m1(sc);
    }
}
