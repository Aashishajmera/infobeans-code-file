// 3) WAP to find out the sum of N natural number.

import java.util.Scanner;

public class Q3FindNatural{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int n= sc.nextInt();
        int i = 1;
        int sum = 0;
        while(n!=0){
            sum = sum + i;
            n--; i++;

        }
        System.out.println(sum);
    }
}