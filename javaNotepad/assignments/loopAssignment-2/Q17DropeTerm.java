// 17) 1 2 4 7 11 16 …… n terms

import java.util.Scanner;

public class Q17DropeTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int p = 0;
        for(int i = 1; i <= n; i++){
            // int j = 0;
            // p = (i-j);
            // j+=2;
           System.out.println(p);
        }
    }
}