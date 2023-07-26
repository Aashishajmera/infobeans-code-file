import java.util.Scanner;
class Factorial{
	private int n;
	
	// default constructor: 
	public Factorial(){
		
	}
	
	// create constructor:
	public Factorial(int n){
		this.n = n;
	}
	
	// check factorial: 
	public void factorial(){
		int mul = 1;
		if(n >= 0){
			while(n != 1){
			mul *= n;
			n--;
			}
			System.out.println("factorial is: "+mul);
		}else{
			
			while(n != -1){
			mul *= n;
			n++;
		}
		System.out.println("factorial is: "+mul);
		}
		
	}
}

class Q4Factorial2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number: ");
		int n = sc.nextInt();
		// create object:
		Factorial obj = new Factorial(n);
		obj.factorial();
	}
}