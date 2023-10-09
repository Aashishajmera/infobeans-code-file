class Shallow {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Shallow() {

	}

}

class Deep {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Deep() {

	}

}

public class ShallowAndDeep {
	public static void main(String[] args) {
		// create object of shallow copy:
		Shallow shallow = new Shallow();
		Shallow shallow2 = shallow;
		shallow.setA(10);
		shallow2.setA(20);
		System.out.println(shallow.getA());
		System.out.println(shallow2.getA());

		// create object of deep copy:
		Deep deep = new Deep();
		Deep deep2 = new Deep();
		deep2 = deep;

	}
}
