// Q5) WAP to check if two given integer value in range of 18 and 100 print eligible for voting else not eligible: 
import java.util.Scanner;
class Range{
	public void range(int age){
		if(age >= 18 && age <= 100){
			System.out.println("Eligible for vote: ");
		}else{
			System.out.println("Not eligible for vot: ");
		}
	}
}
class Q5Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age  = sc.nextInt();
		
		// create object: 
		Range obj = new Range();
		obj.range(age);
		
	}
}