/* 5) Create an Object having two properties and four behaviours
(add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties private. */

import java.util.Scanner;
class Calculator{
	private float a, b;
	
	//create default constructor:
	public Calculator(){
		
	}
	
	//create constructor: 
	public Calculator(float a, float b){
		this.a = a; 
		this.b = b;
	}
	
	// create input method:
	public void input(float a, float b){
		this.a = a; 
		this.b = b;
	}
	
	// create setter method:
	public void setA(float a){
		this.a = a;
	}
	public void setB(float b){
		this.b = b;
	}
	
	// create getter method:
	public float getA(){
		return a;
	}
	public float getB(){
		return b;
	}
	
	// addition
	public void add(){
		System.out.println("Addition is: "+(a+b));
	}
	
	// subtraction
	public void sub(){
		System.out.println("Subtraction is: "+(a-b));
	}
	
	//multiply 
	public void mul(){
		System.out.println("Multiply is: "+(a*b));
	}
	
	// divide
	public void div(){
		System.out.println("Divide is: "+(a/b));
	}
	
	
}

class Q5Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float a = sc.nextFloat();
		System.out.println("Enter second number:");
		float b = sc.nextFloat();
		
		// create object:
		Calculator obj = new Calculator();
		
		while(true){
			System.out.println("Enter your choice 1-addition, 2-subtraction, 3-multiply, 4-divide 5-exit");
			int choice = sc.nextInt();
		switch(choice){
			case 1:
			obj.input(a,b);
			obj.add();
			break;
			
			case 2:
			obj.input(a,b);
			obj.sub();
			break;
			
			case 3:
			obj.input(a,b);
			obj.mul();
			break;
			
			case 4:
			obj.input(a,b);
			obj.div();
			break;
			
			case 5:
			System.exit(11);
			
			default:
			System.out.println("choice not match: ");
			
			}
		}
	}
}