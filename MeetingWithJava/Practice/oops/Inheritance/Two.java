class Test {

  public void m1(int i) {
    System.out.println("I am parent");
  }
}

public class Two extends Test {

  public void Two(int... i) {
    System.out.println("I am child");
  }

  public static void main(String[] args) {
    Two obj = new Two();
    obj.m1(2);
  }
}
