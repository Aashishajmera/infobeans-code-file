class Distance{
	private int km, meter;
	
	// create constructor: 
	public Distance(int km, int meter){
		this.km = km;
		this.meter = meter;
	}
	
	// create default constructor
	public Distance(){
		
	}
	
	// method to add distance: 
	public void addDistance(Distance obj1, Distance obj2){
		this.km = obj1.km + obj2.km;
		this.meter = obj1.meter + obj2.meter;
		
		while(this.meter >= 1000){
			this.km++;
			this.meter -= 1000;
		}
	}
	
	// display the ans: 
	public void display(){
		System.out.println(km +" km " +meter +" meter ");
	}
}

class DistanceKmToMeter{
	public static void main(String[] args){
		// create object: 
		Distance obj1 = new Distance(5, 800);
		Distance obj2 = new Distance(8, 900);
		
		// add obj1 and obj2 properties in obj3:
		Distance obj3 = new Distance();
		obj3.addDistance(obj1, obj2);
		obj3.display();
	}
}