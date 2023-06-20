// 28. Write a C program to input electricity unit charges and calculate total electricity bill
//  according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units
//  Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit 
// An additional surcharge of 20% is added to the bill. 

import java.util.Scanner;

public class QQ28Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity unit: ");
        int unit = sc.nextInt();
        float prUnit = 0;
        float additionalCharge = 0;
        float amount = 0;

        if (unit <= 50) {
            prUnit = 0.50f;
            amount = unit * prUnit;
            System.out.println("Your bill amount is: " + amount + " Rs");

        } else if (unit > 50 && unit <= 150) {
            prUnit = 0.75f;
            amount = unit * prUnit;
            System.out.println("Your bill amount is: " + amount + " Rs");

        } else if (unit > 150 && unit <= 250) {
            prUnit = 1.20f;
            amount = unit * prUnit;
            System.out.println("Your bill amount is: " + amount + " Rs");

        } else if (unit > 250) {
            prUnit = 1.50f;
            additionalCharge = (prUnit * 20) / 100;
            amount = ((prUnit * unit) + additionalCharge);
            System.out.println("Your bill amount is: " + amount + " Rs");

        }
    }
}
