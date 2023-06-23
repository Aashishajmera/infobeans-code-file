// 20) 0 7 14 21 28 35 …..

import java.util.Scanner;

public class Q20Table7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int n = sc.nextInt();
        int val = 7, mul = 0;
        for(int i = 0; i < n; i++){
            mul = (val * i);
            System.out.println(mul);
        }
    }
}
