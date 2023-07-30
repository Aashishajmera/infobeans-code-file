import java.util.Scanner;

class AddSub{
	// create instance variable: 
	private int a , b;
	
	
	// create default constructor: 
	public AddSub(){
		
	}
	
	//create constructor:
	public AddSub(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	// setter method:
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	
	// getter method: 
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	
	// addition method: 
	public void add(){
		System.out.println("Addition is: "+(a+b));
	}
	
	// subtraction method: 
	public void sub(){
		System.out.println("Subtraction is: "+(a-b));
	}
	
	
}

class AddAndSub{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Press 1 to addition");
			System.out.println("Press 2 to subtraction");
			System.out.println("Press 3 to change the value of first number: ");
			System.out.println("Press 4 to change the value of second number: ");
			System.out.println("Press 5 to exit ");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println("Enter first number: ");
			int first = sc.nextInt();
			System.out.println("Enter second number: ");
			int second = sc.nextInt();
			
			AddSub obj = new AddSub(first, second);
			
			switch(choice){
				case 1:
				obj.add();
				break;
				case 2:
				obj.sub();
				break;
				case 3:
				obj.setA(first);
				break;
				case 4:
				obj.setB(second);
				break;
				case 5:
				System.exit(0);
				break;
				default:
				System.out.println("case not match: ");
			}
			
		}
		
	}
}