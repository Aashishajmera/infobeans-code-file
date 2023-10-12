class A {
	public void m1() {
		System.out.println("m1 of A");
	}
}

public class Inheri extends A {
	public void m1() {
		System.out.println("m1 of main class");
	}

	public static void main(String[] args) {
		A objA = new Inheri();
		objA.m1();
		
		Inheri objInheri = (Inheri) objA;
		objInheri.m1();
	}
}
