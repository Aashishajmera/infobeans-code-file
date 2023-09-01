public class MemberInnerCls1 {

  private int a = 10;
  static int b = 20;
  int c = 30;

  // Inner class:
  class Inner {

    public void m1() {
      System.out.println("Addition of three variable: " + (a + b + c));
      a = 20;
      b = 30;
      c = 50;

      System.out.println("Update value: "+(a+b+c));
    }

  }

  public static void main(String[] args) {
    // create object of OuterClass:
    // MemberInnerCls1.Inner objI = new MemberInnerCls1().new Inner();

    // create object of OuterClass
    MemberInnerCls1 objO = new MemberInnerCls1();
    MemberInnerCls1.Inner objI = objO.new Inner();
    // call inner class method:
    objI.m1();
    System.out.println("Update value in main method: "+(objO.a+b+objO.c));
  }
}
