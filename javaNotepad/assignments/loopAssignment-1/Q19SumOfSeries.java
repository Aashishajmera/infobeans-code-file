// 19. WAP to calculate the sum of series 1/1! + 2/2! + 3/3!.......n\n! 

import java.util.Scanner;

public class Q19SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        float n = sc.nextFloat();
        float squre = 0;
        float ans = 1;
        for(int i = 1; i<=n; i++){
           for(int j=i; j<=i; j++){
                ans *= i;
                squre += j/ans;
           }
        }
        System.out.println(squre);
    }
}
