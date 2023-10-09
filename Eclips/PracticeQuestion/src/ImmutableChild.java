class Mutable {
	private int a;

	public Mutable() {

	}

	public Mutable(int a) {
		this.a = a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

final class Immutable extends Mutable {
	private int b;

	public Immutable(int b) {
		this.b = b;
	}

//	public void setA() {
//		
//	}

	public void getValue() {
		System.out.println(super.getA());
	}

	public int getB() {
		return b;
	}

}

public final class ImmutableChild {
	public static void main(String[] args) {
		Immutable immutable = new Immutable(10);
		System.out.println(immutable.getB());
//		immutable.getValueA();
		Mutable mutable = new Mutable(20);
		System.out.println(mutable.getA());
		mutable.setA(30);
		immutable.getValue();
//		System.out.println(mutable.getA());

	}
}
