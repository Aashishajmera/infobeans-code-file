// 11) WAP to print N odd numbers.

import java.util.Scanner;

public class Q11OddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if(n%2 != 0){
            System.out.println("Given number is odd: ");
        }
    }
}
