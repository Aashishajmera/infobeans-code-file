interface Child1{
	default void m1() {
		System.out.println("M1 of i1");
	}
}
interface Child2{
	default void m1() {
		System.out.println("M1 of i2");
	}
}
public class MultipulInheri implements Child1,Child2{
	public void m1() {
		Child1.super.m1();
		Child2.super.m1();
		System.out.println("m1 of main class");
	}
	public static void main(String[] args) {
		Child1 child1 = new MultipulInheri();
		child1.m1();
	}
}
