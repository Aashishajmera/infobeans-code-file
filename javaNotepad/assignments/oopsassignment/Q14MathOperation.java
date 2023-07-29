/* 14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
init - to input X and Y from user
add - to add X and Y and store in R
multiply - to multiply X and Y and store in R
power - to calculate X Y and store in R
display- to display Result R */
 
 
import java.util.Scanner;
class MathOperation{
	// data member
	private int  x, y, r;
	
	// create a method from input x and y 
	public MathOperation(Scanner sc){
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		this.x = x; 
		this.y = y;
	}
	
	public void add(){
		r = x + y;
		System.out.println("Addition is: " +r);
	}
	
	public void multiply(){
		r = x * y;
		System.out.println("Multiply is: "+r);
	}
	
	public void power(){
		int temp = x;
		for(int i = x; i <= y; i++){
			x *= temp;
		}
		System.out.println("Power is: "+x);
	}
	
	public void display(){
		add();
		multiply();
		power();
	}
	
	
	
}
class Q14MathOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		MathOperation obj = new MathOperation(sc);
		obj.display();
	}
}