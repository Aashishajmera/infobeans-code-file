import java.util.Scanner;

interface TestInter {
  void wish();

  default void m2() {
    System.out.println("this is m2 ");
    // m3();
  }

  static void m3() {
    System.out.println("This is static method: ");
  }

  private void m4() {
    System.out.println("this is private method: ");
  }
}

class LamdaExp2 implements TestInter {

  public static void main(String[] args) {
    TestInter obj = () -> {
      System.out.println("gm...");
    };
    obj.wish();
    obj.m2();
    TestInter.m3();
    // m4();
  }
}
