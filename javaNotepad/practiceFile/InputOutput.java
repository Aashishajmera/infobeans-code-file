import java.util.Scanner;
class InputOutput{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number between -128 to 127 ");
	byte num1 = sc.nextByte();
	System.out.println("Enter number is: " +num1);

	sc.nextLine();
	System.out.println("Enter a string value ");
	String sInput = sc.nextLine();
	System.out.println("Enter String value is: " +sInput);
	
	
	}
}