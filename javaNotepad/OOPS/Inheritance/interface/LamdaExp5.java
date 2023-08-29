interface Local3 {
  void m1();

  default void m2() {
    System.out.println("this is m2 interface: ");
  }

  private void m3() {
    System.out.println("this is private m3 method: ");
  }
}

class LamdaExp5 implements Local3 {

  public void m1() {
    System.out.println("this is m1");
  }

  public void m2() {
    System.out.println("this is m2");
  }

  public static void main(String[] args) {
    // Local3 objL = new LamdaExp3();
    // objL.m1();
    // objL.m2();
    // Local3.super.m2();
    Local3 obj = () -> {
      System.out.println("main class m1 method: ");
    };
    obj.m1();
    obj.m2();
    // java.lang.Local3.m3();
  }
}
