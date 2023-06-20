// 25. Write a Java program to calculate profit or loss. 

import java.util.Scanner;

public class QQ25ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase price: ");
        int purchasePrice = sc.nextInt();
        System.out.println("Enter selling price: ");
        int sellingPrice = sc.nextInt();

        int profit = sellingPrice - purchasePrice;
        int loss = purchasePrice - sellingPrice;

        if (loss > 0) {
            System.out.println("loss of " + loss);
        } else {
            System.out.println("profit is: " + profit);
        }

    }
}
