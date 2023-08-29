class A {

  class B {

    class C {

      class D {

         static void m1() {
          System.out.println("i am m1 of class D ");
        }
      }
    }
  }
}

public class Inner1 {

  public static void main(String[] args) {
    // A.B.C.D d = new A().new B().new C().new D();
    // d.m1();

    // new A().new B().new C().new D().m1();

    A.B.C.D.m1();

  }
}
