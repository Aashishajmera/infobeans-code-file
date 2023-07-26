class Test{
    public void m1(){
        System.out.println("Default version...");
    }
    public void m1(int x){
        System.out.println("Int version...");
    }
    public void m1(float x){
        System.out.println("Float version...");
    }
	public void m1(int x , float y){
		System.out.println("Int-Float version: ");
	}
	public void m1(float x, int y){
		System.out.println("Float-Int version: ");
	}
	public void m1(int... x){
		System.out.println("Var-args version only int: ");
	}
	public void m1(float y, int... x){
		System.out.println("Var-args version float-int: ");
	}
}

public class Q1 {
    public static void main(String[] args) {
        // create object
        Test obj = new Test();
        obj.m1();
        obj.m1(44);
        obj.m1(3.4f);
		obj.m1(34, 2.9f);
		obj.m1(3.4f, 34);
		obj.m1(34,5,67,89,887);
		obj.m1(33.8f, 23,56,7);
    }
}
