public class OuterClass {

   static int a = 22;

  //inner class:
  static class Inner {
    //   OuterClass objO = new OuterClass();

    public void m1() {

      System.out.println("Outer class static value: " + a);
      a = 33;
      System.out.println("Update value of static variable: " + a);
    }
  }

  public static void main(String[] args) {
    // create object of outerClass:
    // OuterClass objO = new OuterClass();

    // create object of innerClass:
    OuterClass.Inner objI = new OuterClass.Inner();
    objI.m1();
    System.out.println("Main method static variable value: " + a);
  }
}
