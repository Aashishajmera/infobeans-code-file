// 7) WAP to check whether entered number is prime or not.

import java.util.Scanner;

public class Q7Prime2 {
    // create methods:
    // public void prime(int n){
    // boolean flag = true;
    // for(int i = 2; i <= n/2; i++){
    // if(n%i == 0){
    // flag = false;
    // break;
    // }
    // }

    // if(flag && 1 < n){
    // System.out.println("prime: ");

    // }else{
    // System.out.println("Not prime: ");
    // }
    // }

    // return statement
    public boolean prime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag && 1 < n) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q7Prime2 obj = new Q7Prime2();
        boolean x = obj.prime(n);

        if (x) {
            System.out.println("Prime: ");
        } else {
            System.out.println("Not prime: ");
        }

        // boolean flag = true;
        // for(int i = 2; i <= n/2; i++){
        // if(n%i == 0){
        // flag = false;
        // break;
        // }
        // }
        // if(flag && n > 1){
        // System.out.println("prime: ");
        // }else{
        // System.out.println("Not Prime: ");
        // }

        // int i = 2;
        // for(; i <= n/2; i++){
        // if(n%i == 0){
        // break;
        // }
        // }

        // if(i>n/2 && n > 1){
        // System.out.println("prime: ");
        // }else{
        // System.out.println("Not Prime: ");
        // }

    }
}
