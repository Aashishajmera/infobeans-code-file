// 7 WAP to print the series 1 4 9 16 25................n terms 

import java.util.Scanner;

public class Q7Squre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}
