// 52) WAP to find out all the Armstrong numbers between two entered numbers

import java.util.Scanner;

class Armstrong{
    public void arm(int a, int b){
        int rem = 0;
        for(int i = a; i <= b; i++){
            int arm = 0;
           for(int j = i; j != 0; j = j/10){
                rem = j%10;
                arm += (rem*rem*rem);
           }
           if(arm == i){
            System.out.println("Arm strong number is: " +i);
           }
        }
    }
}


public class Q52Armstrong2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int f = sc.nextInt();
       System.out.println("Enter second number: ");
       int s = sc.nextInt();

       // create object:
       Armstrong obj = new Armstrong();
       obj.arm(f, s);
    }
}
