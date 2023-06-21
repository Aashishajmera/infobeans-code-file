// 11. WAP to find out compound interest

import java.sql.Time;
import java.util.Scanner;

public class Q11CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate: "); 
        double rate = sc.nextDouble();
        System.out.println("Enter time in month: ");
        double year = sc.nextDouble();

        double ci = principal*(1+(rate/100))*(year/12);
        System.out.println("The compound interest is: "+ci);

    }
}
