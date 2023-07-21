// 34) WAP to check whether entered number is perfect or not

import java.util.Scanner;

class Perfect{
    public void perfect(int n){
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(n%i == 0){
                ans += i;
            }
        }
        if(ans == n){
            System.out.println(n +" is perfect number: ");
        }else{
            System.out.println("not perfect: ");
        }
    }
}


public class Q34Perfect2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();

        // create object:
        Perfect obj = new Perfect();
        obj.perfect(n);
    }
}
