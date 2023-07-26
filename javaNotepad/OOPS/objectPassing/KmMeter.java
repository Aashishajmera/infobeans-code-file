import java.util.Scanner;
class KmToMeter{
	
	// Instance private variable: 
	private int km, meter;
	
	
	// create a constructor 
	public KmToMeter(int km, int meter){
		this.km = km;
		this.meter = meter;
	}
	
	
	// create default constructor:
	public KmToMeter(){
		
	}
	
	
	// setter methods: 
	public void setKm(int km){
		this.km = km;
	}
	public void setMeter(int meter){
		this.meter = meter;
	}
	
	
	// getter methods: 
	public int getKm(){
		return km;
	}
	public int getMeter(){
		return meter;
	}
	
	
	// meter to km method:
	public KmToMeter convertMeter(KmToMeter obj2){
		KmToMeter temp = new KmToMeter();
		temp.km = this.km + obj2.km;
		temp.meter = this.meter + obj2.meter;
		
		while(temp.meter >= 1000){
			temp.km++;
			temp.meter -= 1000;
		}
		return temp;
	}
	
	
	// display the output: 
	public void display(){
		System.out.println(km +" km " +meter +" meter ");
	}
}

class KmMeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter km: ");
		int km1 = sc.nextInt();
		System.out.println("Enter meter: ");
		int meter1 = sc.nextInt();
		System.out.println("Enter km: ");
		int km2 = sc.nextInt();
		System.out.println("Enter meter: ");
		int meter2 = sc.nextInt();
		
		// create object: 
		KmToMeter obj1 = new KmToMeter(km1, meter1);
		KmToMeter obj2 = new KmToMeter(km2, meter2);
		
		// 
		
		// obj1.convertMeter(obj2);
		KmToMeter result = obj1.convertMeter(obj2);
		result.display();
		
	}
}