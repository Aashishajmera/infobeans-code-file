// 38) WAP to check whether entered number is Armstrong or not

import java.util.Scanner;

public class Q38Armstrong2 {

    // create method:
    public void armstron(int n) {
        int rem = 0, ans = 0, temp = n;
        // for (int i = n; i >= 1; i = i / 10) {
        //     rem = i % 10;
        //     ans += (rem * rem * rem);
        // }
        while(n != 0){
            rem = n % 10;
            ans += (rem*rem*rem);
            n = n / 10;
        }
        if(temp == ans){
            System.out.println("Entered number is armstong: ");
        }else{
            System.out.println("Not armstong: ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        // create object:
        Q38Armstrong2 obj = new Q38Armstrong2();
        obj.armstron(n);
    }
}
