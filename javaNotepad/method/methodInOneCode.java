class mthd{
	public void m1(){
		System.out.println("m1 called: ");
		m3();
	}
	
	public void m2(){
		System.out.println("m2 called: ");
	}
	
	public void m3(){
		System.out.println("m3 called: ");
		m2();
	}
	
}


class methodInOneCode{
	public static void main(String[] args){
		mthd obj = new mthd();
		obj.m1();
	}
}