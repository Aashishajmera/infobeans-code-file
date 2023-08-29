
class A {

    static public void m1() {
        System.out.println("A-m1()");
    }
}

class B extends A {

   static public void m1() {
        System.out.println("B-m1()");
    }

}

public class StaticMethod {

    public static void main(String args[]) {

        A obj = new B(); 
        obj.m1();
    }
}
