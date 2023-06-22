// 9) WAP to print N even numbers.

import java.util.Scanner;

public class Q9EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even number: ");
        }
    }
}
