// 15. WAP to check given year is a leap year or not 

import java.util.Scanner;

public class QQ15LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year: ");
        } else {
            System.out.println(year + " is not a leap year: ");
        }
    }
}
