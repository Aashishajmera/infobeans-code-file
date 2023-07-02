// 18) 1 2 2 4 8 32 …… n terms

import java.util.Scanner;

public class Q18Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int a = 1, b = 2, c = 1;
        for(int i = 1; i<=n; i++){ 
            a = b;
			System.out.println(c);
			b = c;
			c = a*b;
        }
    }
}
