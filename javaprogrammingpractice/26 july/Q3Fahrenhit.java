import java.util.Scanner;
class Fahrenhit {
	private float  fahrenhit ;
	
	// default constructor:
	public Fahrenhit (){
		
	}
	
	// create constructor: 
	public Fahrenhit(float f){
		this.fahrenhit = f;
	}
	
	// conver fahrenhit to celsius:
	public void convert(){
		float celsius = (fahrenhit - 32)* 5/9;
		System.out.println("celsius is: "+celsius);
	}
}

class Q3Fahrenhit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fahrenhit: ");
		float f = sc.nextFloat();
		// create object: 
		Fahrenhit obj = new Fahrenhit(f);
		obj.convert();
	}
}