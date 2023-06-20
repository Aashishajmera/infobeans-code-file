// 12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
// INPUT : 1234        OUTPUT : 4321
// INPUT : 5982        OUTPUT : 2895 

import java.util.Scanner;

public class Q12ReversedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int remember = 0;
        remember = num % 10;
        reverse = reverse + remember * 10;
        num = num / 10;

        System.out.println("The reverse number is: " + reverse);

    }
}
