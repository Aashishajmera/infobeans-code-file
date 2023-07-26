class A{
	static{
		System.out.println("class A - static block: ");
	}
}

class StaticBlockWithoutMain{
	/* public static void main(String[] args){
		System.out.println("Main method: ");
		C obj = new C();
	} */
	static{
		System.out.println("Main method static block: ");
	}
}

class C{
	static{
		System.out.println("class C - static block: ");
	}
	/* public C(){
		System.out.println("default constructor: ");
	} */
}