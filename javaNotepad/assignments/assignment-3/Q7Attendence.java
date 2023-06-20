// 7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.

import java.util.Scanner;

public class Q7Attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        int held = sc.nextInt();
        System.out.println("Number of classes attended: ");
        int attended = sc.nextInt();

         int percent= (attended*100)/ held;
          
         if(percent > 75){
            System.out.println("yes you sit: "+percent);
         }else{
            System.out.println("your attendence is lessthan 75% so you can't sit in exam and your attendence is: "+percent+"%");
         }
        
        
    }
}
