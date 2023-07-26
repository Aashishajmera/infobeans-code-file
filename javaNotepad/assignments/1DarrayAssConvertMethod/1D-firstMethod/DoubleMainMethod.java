class TestMain{
	
]	public static void main(){
		
		System.out.println("first - main method...");
		
	}
}

class DoubleMainMethod{
	public static void main(String[] args){
		System.out.println("first main method...");
		// TestMain.main();
		TestMain obj = new TestMain();
		obj.main();
	}
	
	
}

