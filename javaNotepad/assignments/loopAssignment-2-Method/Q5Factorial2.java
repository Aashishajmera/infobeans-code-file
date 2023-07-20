// 5) WAP to find out the factorial of a number.

import java.util.Scanner;

public class Q5Factorial2 {

    // create method:
    private void factorial(int n) {
        int fact = 1;
        if (n >= 0) {
            for (int i = n; i >= 2; i--) {
                fact *= i;
            }
        }else{
            for(int i = n; i < 0; i++){
                fact *= i;
            }
        }
        System.out.println("Factorial is: " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: -factorial of a number.");
        int n = sc.nextInt();

        // create object:
        Q5Factorial2 obj = new Q5Factorial2();
        new Q5Factorial2().factorial(n);
    }
}
