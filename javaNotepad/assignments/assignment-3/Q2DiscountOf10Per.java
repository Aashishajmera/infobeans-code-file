// 2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.


import java.util.Scanner;
class Q2DiscountOf10Per{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a quantity of a product: ");
		int quantity = sc.nextInt();
		int oneUnit = 100;
		float totalCost = (float)(quantity * oneUnit);
		float discount = 0;
		
		if(quantity > 1000){
			discount = ( totalCost * 10 )/ 100 ;
			totalCost = totalCost - discount;
			System.out.println(totalCost);
		}else{
			System.out.println("Total cost is: "+totalCost);
		}
		
	}
}