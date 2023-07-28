import java.util.Scanner;
class Bill{
	int unit;
	// default constructor: 
	public Bill(){
		
	}
	
	// create constructor:
	public Bill(int u){
		unit = u;
	}
	
	// Bill method: 
	public void countBill(){
		int result; 
		if(unit <= 100){
			result = unit*10;
		}else if(unit > 100 && unit <= 200){
			result = unit*15;
		}else if(unit <= 300 && unit > 200){
			result = unit*20;
		}else if(unit > 300){
			result = unit*25;
		}
		System.out.println(unit +" unit amount is: "+result);
	}
}

class Q1Bill{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit: ");
		int unit = sc.nextInt();
		
		// create object:
		Bill obj = new Bill(unit);
		obj.countBill();
	}
}