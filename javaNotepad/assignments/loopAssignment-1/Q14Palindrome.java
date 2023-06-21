// 14 WAP to input a number and check it palindrome or not

import java.util.Scanner;

public class Q14Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int temp = n, lastDigit = 0, reverse = 0;
        while(n != 0){
            lastDigit = n % 10;
            reverse = reverse*10+lastDigit;
            n = n/10;
        }
        if(temp == reverse){
            System.out.println(temp +" is palindrome number: ");
        }else{
            System.out.println(temp +" is not a palindrome number: ");
        }
    }
}
