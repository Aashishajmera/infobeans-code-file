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
	
	// only static with object create : 
	/* public static void staatic(){
		ankit ob = new ankit();
		System.out.println(ob.st);
		System.out.println(s);
	} */
	
	
	// static method:
	public static void staatic(ankit obb){
		// ankit ob = new ankit();
		System.out.println(obb.st);
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
		obj2.staatic(obj2);
		
	}
	
}

class aashish{
	// private String k = "private: ";
	static{
		System.out.println("I am aashish");
		System.out.println("main method: ");
		
	}
}