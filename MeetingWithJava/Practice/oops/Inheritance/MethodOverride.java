// package Practice.oops.Inheritance;

class Test {

  // This is a m1 method:
  public void m1() {
    System.out.println("I am m1 of parent class: ");
  }

  //   This is a constructor:
  Test() {
    System.out.println("I am parent constructor: ");
  }

  //   This is a static block:
  static {
    System.out.println("I am a static block of parent class: ");
  }

  //   This is a initializer block:
  {
    System.out.println("I am a initilizer block of parent class: ");
  }
}

public class MethodOverride extends Test {
  // static block
  static {
    System.out.println("I am a static block of child class: ");
  }

  // override method
  public void m1() {
    System.out.println("I am m1 of child class: ");
  }

  //   default constructor
  MethodOverride() {
    System.out.println("I am a child constructor: ");
  }

  //   initilizer block
  {
    System.out.println("I am initilizer block of child class: ");
  }

  public static void main(String[] args) {
    // Test test = new Test();
    // MethodOverride methodOverride = new MethodOverride();
    Test test = new MethodOverride();
  }
}
