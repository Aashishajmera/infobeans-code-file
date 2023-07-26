class Bill{
	private int pizza, puffs, colddrinks;
	
	// create default constructor:
	public Bill(){
		
	}
	
	//create constructor:
	public Bill(int p, int puff, int c){
		pizza = p;
		puffs = puff;
		colddrinks = c;
	}
	
	//create calculate bill
	public void calculate(){
		int add = pizza + puffs + colddrinks;
		System.out.println("Total bill is: "+add);
	}
}

class Q1GenerateBill{
	public static void main(String[] args){		
		Bill obj = new Bill(100, 20, 10);
		obj.calculate();
	}
}