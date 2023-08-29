import java.util.Scanner;

interface I {
//   int s = 22;

  default void m1() {
    System.out.println("I----m1--called...." );
  }

  default void m2() {
    System.out.println("second m2");
  }
}

class Test implements I {

  public void m1() {
    I.super.m1();
    I.super.m2();
    System.out.println("Test-m1=--called....");
  }
}

class LamdaEx4 {

  public static void main(String[] args) {
    I obj = new Test();
    obj.m1();
    // obj.m2();;
  }
}
