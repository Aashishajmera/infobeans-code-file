interface first {
  public abstract void m1();

  default String m2() {
    return "This is m2";
  }
}

public class inter1 implements first {

  public void m1() {
    // first.super.m2();
    System.out.println("this is m1 method override: ");
  }

  public static void main(String[] args) {
    first obj = new inter1();
    obj.m1();
    String r = obj.m2();
    System.out.println(r);
  }
}
