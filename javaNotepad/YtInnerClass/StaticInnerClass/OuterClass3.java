class OuterClass2 {

  int a = 22;

  //inner class:
  static class Inner {

    public void m1(OuterClass2 objO) {
      System.out.println("Outer class static value: " + objO.a);
      objO.a = 33;
      System.out.println("Update value of static variable: " + objO.a);
    }
  }
}

public class OuterClass3 {

  public static void main(String[] args) {
    // create object of OuterClass2
    OuterClass2 objO = new OuterClass2();

    // create object of innner class:
    OuterClass2.Inner objI = new OuterClass2.Inner();
    // OuterClass2.Inner objI = objO.new Inner();
    
    objI.m1(objO);
    System.out.println("Update value & main class: " + objO.a);
  }
}
