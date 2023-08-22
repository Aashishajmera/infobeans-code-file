class A {
    public void m1() {
        System.out.println("A - m1");
    }
}

// CLASS - B --------------------------------------------
class B extends A {
    // public void m1() {
    //     System.out.println("B - m1");
    // }
}

// CLASS - C ----------------------------------------------
class C extends A {
    public void m1() {
        System.out.println("C - m1");
    }
}

class PCHC2 {
    public static void main(String[] args) {
        A obj = new C();
        obj.m1();
        A obj1 = new B();
        obj1.m1();
    }
}