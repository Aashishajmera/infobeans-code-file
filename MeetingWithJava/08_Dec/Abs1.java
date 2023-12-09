abstract class Test {
  public abstract void m1();
}

public class Abs1 extends Test {

  public void m1(){
    System.out.println("This is override method");
  }

  public static void main(String[] args) {
    Test test = new Abs1();
    test.m1();
  }
}
