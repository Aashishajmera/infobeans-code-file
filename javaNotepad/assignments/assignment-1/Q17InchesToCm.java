// 17. Program to convert person height from inches to cm

import java.util.Scanner;

public class Q17InchesToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in Inches: ");
        double height = sc.nextDouble();
        double inches = 2.54;

        double heightCm = height * inches;
        System.out.println("Your height in cm: "+heightCm +" cm");
    }
}
