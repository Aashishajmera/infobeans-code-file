/* 15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
two integers
three float
all elements of array
one double and one integer */

import java.util.Scanner;
class Multi{
	public void multiply(int x, int y){
		System.out.println("Two integer value multiply is: "+(x*y));
	}
	
	public void multiply(float x, float y, float z){
		System.out.println("Three float value multiply is: "+(x*y*z));
	}
	
	public void multiply(int... x){
		int mul = 1; 
		for(int i = 0; i < x.length; i++){
			mul *= x[i];
		}
		System.out.println("multiply of array element is: "+mul);
	}
	
	public void multiply(int x){
		System.out.println("Integer value is: "+x);
	}
	
	public void multiply(double x){
		System.out.println("Double value is: "+x);
	}
}
class Q15Multiply{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Multi obj = new Multi();
		obj.multiply(45);
		obj.multiply(11, 22);
		obj.multiply(33.3f, 44.4f, 33.39f);
		obj.multiply(3445.78);
		
		//inter var - args 
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int x[] = new int[size];
		int i = 0;
		System.out.println("Enter "+size +" element:");
		for(; i < x.length; i++){
			x[i] = sc.nextInt();
		}
		
		obj.multiply(x);
	}
}