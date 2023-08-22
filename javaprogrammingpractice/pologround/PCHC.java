class A{
    public void m1(){
        System.out.println("A-m1");
    }
    public void m2(){
        System.out.println("A-m2");
    }
}

class B extends A{
    public void m1(){
        System.out.println("B-m1");
    }
    public void p1(){
        System.out.println("B-p1");
    }
}

class  PCHC{
	public static void main(String[] args) {
        A obj = new B();
        obj.m1();
        obj.m2();
        // obj.p1();
    }
}