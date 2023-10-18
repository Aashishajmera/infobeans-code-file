package jdbc1;

import java.util.Scanner;

public class Validation {

    public static boolean checkMobileNumber(String number){
        boolean flag = false;
        if(number.length() <= 10){
            for(int i = 1; i <= 10; i++){
                if(number.charAt(i) > 47 && number.charAt(i) < 58){
                    
                }else{
                    flag = false;
                    return flag;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number: ");
        int number = sc.nextInt();
        
        boolean flag = Validation.checkMobileNumber(number);
    }
}
