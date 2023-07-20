// 37) WAP to check whether entered number is palindrome or not

import java.util.Scanner;

public class Q37Palindrome2 {

    // create method:
    public void palindrome(int n) {
        int rem = 0, reverse = 0, temp = n;
        for (; n != 0; n = n / 10) {
            rem = n % 10;
            reverse = ((reverse * 10) + rem);
        }
        if(temp == reverse){
            System.out.println("Entered number is palindrome: ");
        }else{
            System.out.println("Not palindrome: ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        Q37Palindrome2 obj = new Q37Palindrome2();
        obj.palindrome(n);
    }
}
