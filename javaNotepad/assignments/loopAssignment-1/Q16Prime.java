// 16. WAP to enter an integer number and check it is prime or not 

import java.util.Scanner;

public class Q16Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int count = 0;
        int i = 2;
        while (i <= num) {
            if (num % num == 0 && num % i == 0) {
                count++; 
                break;
            }
            i++;
        }
        if (count == 1 && num > 1) {   // count == 0  then while (i <= num/2)
            System.out.println("prime: ");
        } else {
            System.out.println("Not prime:");
        }
    }
}

// 1 is not a prime number: