class ankit{
	
	/* public static void main(){
		System.out.println("ankit...");
	} */
	
	private String st = "Instance: ";
	static  String s = "static";
	
	// only instance 
	public void instacne(){
		System.out.println(st);
		System.out.println(s);
	}
	
	// only static 
	public static void staatic(){
		System.out.println(st);
		System.out.println(s);
	}
	
	
}

class sachin{
	
	public static void main(String[] args){
		System.out.println("I am sachin ");
		aashish obj = new aashish();
		ankit obj2 = new ankit();
		// sachin.main();
		obj2.instacne();
		obj2.staatic();
		
	}
	
}

class aashish{
	static{
		System.out.println("I am aashish");
	}
}