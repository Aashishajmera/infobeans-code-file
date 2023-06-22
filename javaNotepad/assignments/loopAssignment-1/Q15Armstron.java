// 15 WAP to to input 3 digit number and check it is armstron or not

import java.util.Scanner;

public class Q15Armstron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:  ");
        int n = sc.nextInt();
        int lastDigit = 0, temp = n, sum =0;
        while(n!=0){
            lastDigit = n % 10;
            sum += lastDigit *lastDigit*lastDigit;
            // reverse = reverse*10 + lastDigit;
            n = n/10;
        }if(sum == temp){
            System.out.println(temp +" is armstron number: ");
        }else{
            System.out.println(temp +" is not a armstron number: ");
        }
    }
}
