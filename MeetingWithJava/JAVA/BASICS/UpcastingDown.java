package JAVA.BASICS;

class Test {

  //   public void m1() {
  //     System.out.println("I am parente m1");
  //   }

  public void m2() {
    System.out.println("I am parente m2");
  }
}

public class UpcastingDown extends Test {

  // override m1
  public void m1() {
    System.out.println("I am child m1");
  }

  public static void main(String[] args) {
    Test obj = new UpcastingDown();   // upcasting
    UpcastingDown obj2 =(UpcastingDown) obj;   // downcasting

    // Test obj = new Test(); // upcasting
    // UpcastingDown obj2 = (UpcastingDown) obj; // downcasting   =====> CALSS CAST EXCEPTION

    obj2.m2();
  }
}
