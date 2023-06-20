// 15. Write a java program to accept the cost price of a bike
// and display the road tax to be paid according to the 
// following criteria.
// Cost Price(In Rs)		Tax
//  > 100000			 15%
//  >50000 and <=100000	 10%
//  <=50000			 5%	

import java.util.Scanner;

public class Q15BikePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bike cost price: ");
        int price = sc.nextInt();
        int taxPrice = 0;
        int tax = 0;
        if (price > 100000) {
            tax = (price * 15) / 100;
            taxPrice = price + tax;
            System.out.println(taxPrice);
        } else if (price > 50000 && price <= 100000) {
            tax = (price * 10) / 100;
            taxPrice = price + tax;
            System.out.println(taxPrice);
        } else {
            tax = (price * 5) / 100;
            taxPrice = price + tax;
            System.out.println(taxPrice);
        }
    }
}
