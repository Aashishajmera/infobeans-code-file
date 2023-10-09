class Parent {
	public Parent m2() {
		System.out.println("I am Parent: ");
		return new Parent();
	}
}

public class CoveriantOverRid extends Parent {
	public CoveriantOverRid m1() {
		System.out.println("I am child: ");
		return new CoveriantOverRid();

	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.m2());
		CoveriantOverRid coveriantOverRid = new CoveriantOverRid();
		System.out.println(coveriantOverRid.m1());
		
		Parent childParent = new CoveriantOverRid();
		System.out.println(childParent.m2());
	}
}
