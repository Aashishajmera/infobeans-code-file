class A {
    public void m1() {
        System.out.println("Class A - m1");
    }
}

class B extends A{
    public void m1() {
        System.out.println("class B - m1");
    }
    // B objA = new B();
}

class ExtendsClass extends B{

    public void m1() {
        System.out.println("class main - m1");
    }

    public static void main(String[] args) {

        // create object of Main class:
        A objE = new B();

        objE.m1();
       
    }
}