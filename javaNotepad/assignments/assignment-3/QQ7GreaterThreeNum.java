// 7. WAP to find greater among three number

import java.util.Scanner;

public class QQ7GreaterThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");        
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is greater than " +num2 +" and " +num3);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 +" is greater than " +num1 +" and " +num3);
        }else{
            System.out.println(num3 +" is greater than " +num1 +" and " +num2);
        }
    }
}
