// 19) 1 + 1/2 + 1/3 + 1/4 + 1/5 ….. n terms(find out sum)

import java.util.Scanner;

public class Q19FindSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        float sum = 0;
        for(int i = 1; i<=n; i++){
            sum += 1.0f/i;
        }
       System.out.println("Sum is this: "+sum); 
    }
}
