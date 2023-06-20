// 29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.io.FileReader;
import java.util.Scanner;

public class QQ29InputChoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Enter your choice (+, >, =)");
        char choice = sc.next().charAt(0);

        if (choice == '+') {
            System.out.println("Addition is: " + (firstNum + secondNum));
        } else if (choice == '>') {
            if (firstNum > secondNum) {
                System.out.println(firstNum + " is greaterthan");
            } else {
                System.out.println(secondNum + " is greaterthan");
            }
        } else if (choice == '=') {
            if (firstNum == secondNum) {
                System.out.println("yes both are equal: ");
            }else{
                System.out.println("Not equal: ");
            }
        } else {
            System.out.println("Invalid input: ");
        }
    }
}