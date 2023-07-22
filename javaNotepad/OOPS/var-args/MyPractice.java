class Test{
	// create method:
	
	/* public void m1(){
		System.out.println("m1 without perameter: ");
	}
	
	public void add(int... x){
		int sum = 0;
		System.out.println("m1 with var-argument's: ");
		for(int i = 0; i < x.length; i++){
			sum += x[i];
			System.out.println(x[i]);
		}
		System.out.println("The sum is: "+sum);
	} */
	
	public void m1(int... x){
		System.out.println("int var-argument: "+x);
	}
	
	
	public void m1(long... x){
		System.out.println("long var-argument: " +x);
	}
	
	public void m1(long x){
		System.out.println("long " +x);
	}

}


class MyPractice{
	
	public static void main(String[] args){
		Test obj = new Test();
		obj.m1(99);
		obj.m1(3,5);
		obj.m1(43l, 34L);
	}
}