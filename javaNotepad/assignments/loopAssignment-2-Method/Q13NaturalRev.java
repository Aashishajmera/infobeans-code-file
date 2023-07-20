// 13) WAP to print N natural numbers in reverse order

import java.util.Scanner;

public class Q13NaturalRev {
    // create methods 
    
    public void revNatural(int n){
        if(n > 0){
            System.out.println("reverse natural number is: ");
        }
        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        Q13NaturalRev obj = new Q13NaturalRev();
        obj.revNatural(n);
    }
}
