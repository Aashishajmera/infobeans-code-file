// 8) WAP to print Fibonacci series.

import java.util.Scanner;

public class Q8Fibonacci {

    // create method: 
    public void fibonacci(int n){
        int a = 1, b = 0, c = 0; 
        for(int i = 0; i <= n; i++){
            a = b; 
            b = c; 
            System.out.println(c);
            c = a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: -Fibonacci series");
        int n = sc.nextInt();



    }
}
