interface I1{
	void m1();
}

interface I2 extends I1{
	default void m1() {
		System.out.println("I am m1 of I2 ");
	}
}


//class A{
//	private A() {
//		
//	}
	
//	protected A() {
//		
//	}
	
//	default A() {
//		
//	}
//}

public class CunstructorMethod implements I1 {
	
	public void m1() {
		System.out.println("I am m1 of main cals");
	}
	
	public static void main(String[] args) {
		
	}
}
