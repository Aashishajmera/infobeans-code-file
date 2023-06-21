// 5 WAP to print the series 1 3 5 7 9....................n terms 

import java.util.Scanner;

public class Q5Odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}