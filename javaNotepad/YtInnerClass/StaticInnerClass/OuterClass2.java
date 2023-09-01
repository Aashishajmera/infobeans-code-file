public class OuterClass2 {

    int a = 22;

  //inner class:
  static class Inner {

    public void m1(OuterClass2 objO) {

      System.out.println("Outer class static value: " + objO.a);
      objO.a = 33;
      System.out.println("Update value of static variable: " +objO.a);
    }
  }

  public static void main(String[] args) {
    // create object of outerClass:
    OuterClass2 objO = new OuterClass2();

    // create object of innerClass:
    // OuterClass2.Inner objI = new OuterClass2.Inner();

    //If there is an inner class in this class, then there is no need to create an object of the inner 
    //class with the help of the outer class. 
    Inner objI = new Inner();
    objI.m1(objO);
    System.out.println("Main method static variable value: " + objO.a);
  }
}
