// 9. WAP to check wheater number is positive or negative

import java.util.Scanner;

public class QQ9PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        if(num1 >= 0){
            System.out.println(num1 +" is positive: ");
        }else{
            System.out.println(num1 +" is negative: ");
        }
    }
}
