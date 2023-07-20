// 10) WAP to print Even numbers upto N.

import java.util.Scanner;

public class Q10EvenN2 {

    // create method
    public void evenN(int n){
        if(n >= 2){
            System.out.print("Even number is: ");
        }
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q10EvenN2 obj = new Q10EvenN2();
        obj.evenN(n);
    }
}
