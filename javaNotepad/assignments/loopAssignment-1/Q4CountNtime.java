// 4. WAP to print the series 1 2 3 4 5 ...................n

import java.util.Scanner;

public class Q4CountNtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any n positive number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
