// 8. WAP to check wheather number is even or odd

import java.util.Scanner;

public class QQ8EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("given number is even: ");
        }else{
            System.out.println("given number is odd: ");
        }
    }
}