class A {

  class B {

    class C {

      class D {

        public void m1() {
          System.out.println("This is static m1");
        }
      }
    }
  }
}

public class inter7 {

  public static void main(String[] args) {
    // A.B.C.D.m1();
    A a = new A();
    A.B b = a.new B();
    A.B.C c = b.new C();
    A.B.C.D d = c.new D();
    // A.B.C.D d = new A().new B().new C().new D();

    d.m1();
  }
}
