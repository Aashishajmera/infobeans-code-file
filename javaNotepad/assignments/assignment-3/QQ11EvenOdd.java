// 11. Find even odd using switch case 

import java.util.Scanner;

public class QQ11EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num1 = sc.nextInt();

        switch (num1 % 2) {
            case 0:
                System.out.println("Given number is even: ");
                break;
            default:
                System.out.println("Given number is Odd: ");

        }
    }
}
