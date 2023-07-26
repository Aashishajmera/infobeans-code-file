class Test{
    public void m1(int x, int... y, float... z){
		System.out.println("");
    }
}

class DoubleVar{
    public static void main(String args[]){
		Test obj = new Test();
		obj.m1(23,45,3.9f);
	
    }
}