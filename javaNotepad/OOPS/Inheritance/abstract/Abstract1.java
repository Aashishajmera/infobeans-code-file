abstract class A {
    private int a;

    // default constructor:
    public A() {
        
    }

    // parameterized constructor:
    public A(int a) {
        this.a = a;
    }

    public void set(int a) {
        this.a = a;
    }

    // m1 method:
    public void m1() {
        System.out.println("A value is: " + a);
    }

    // abstract method:
    abstract public void wish();
}

class B extends A {
    public void wish() {
        System.out.println("GM...");
    }

    // default constructor:
    // public B(){

    // }

    // parameterized constructor:
    public B(){
    super(22);
    }
}

class Abstract1 {
    public static void main(String[] args) {

        // create object:
        B obj = new B();
        obj.set(33);
        obj.m1();
        // obj.wish();
    }
}