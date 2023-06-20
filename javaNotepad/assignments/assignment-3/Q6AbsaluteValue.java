// 6. Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1

import java.util.Scanner;

public class Q6AbsaluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println(+num1);
        }else{
            System.out.println((-num1));
        }
    }
}
