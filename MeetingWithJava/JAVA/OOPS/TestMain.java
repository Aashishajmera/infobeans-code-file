// package JAVA.OOPS;

// class Test {
//   public void m1() {
//     System.out.println("I am parent m1...");
//   }
// }

interface Test {
  default void m1() {
    System.out.println("I am parent m1...");
  }
}

public class TestMain implements Test {

  public void m1() {
    System.out.println("I am child m1...");
  }

  public static void main(String[] args) {
    TestMain obj = new TestMain();
    obj.m1();
  }
}
