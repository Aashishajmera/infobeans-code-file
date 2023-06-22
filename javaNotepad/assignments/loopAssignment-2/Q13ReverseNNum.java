// 13) WAP to print N natural numbers in reverse order

import java.util.Scanner;

public class Q13ReverseNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
