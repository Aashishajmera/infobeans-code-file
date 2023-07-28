import java.util.Scanner;
class Arm{
	private int a ;
	
	// create default constructor:
	public Arm(){
		
	}
	
	
	// create constructor: 
	public Arm(int a){
		this.a = a;
	}
	
	
	// Armstrong number: 
	public void arm(){
		int rem = 0, arm = 0;
		for(int i = a; i != 0;){
			rem = i % 10 ;
			arm += (rem*rem*rem);
			i = i/10;
		}
		if(a == arm){
			System.out.println(a +" is armstrong: ");
		}else{
			System.out.println("Not armstrong: ");
		}
	}
}

class Q2Armstrong2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		Arm obj = new Arm(n);
		obj.arm();
	}
}