package JAVA.OOPS;

class Test {
  static {
    System.out.println("I am static block of parent class...");
  }

  public Test() {
    System.out.println("I am parent class constructor.....");
  }

  {
    System.out.println("I am parent class Initilizer block");
  }
}

public class StaticBlock extends Test {
  static {
    System.out.println("I am static block of child class...");
  }

  static {
    System.out.println("I am 2nd static block of child class...");
  }

  {
    System.out.println("I am child class Initilizer block");
  }

  public StaticBlock() {
    System.out.println("I am child class constructor.....");
  }

  public static void main(String[] args) {
    Test obj = new StaticBlock();
    // Test obj = new Test();
    // StaticBlock obj = new StaticBlock();

  }
}
