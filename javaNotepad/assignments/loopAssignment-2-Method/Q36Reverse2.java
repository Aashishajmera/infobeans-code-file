// 36) WAP to reverse a number

import java.util.Scanner;

public class Q36Reverse2 {
    // create method:
    public int reverse(int n){
        int rem = 0, reverse = 0;
        while(n!=0){
            reverse = ((reverse * 10)+n%10);
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q36Reverse2 obj = new Q36Reverse2();
        int result = obj.reverse(n);
        System.out.println(result);

        
    }
}
