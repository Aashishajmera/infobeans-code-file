// 17. WAP to calculate x^y (x to the power y)

import java.util.Scanner;

public class Q17Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int ans = 1; 
        int temp = num2;
        while(num2 != 0){
            ans *= num1;
            num2--; 
        }
        System.out.println(num1 +" to the power " +temp +" ans is: "+ans);
    }
}
