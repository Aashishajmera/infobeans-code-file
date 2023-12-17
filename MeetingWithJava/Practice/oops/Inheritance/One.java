class Test {

  // public void m1(int... i){
  //     System.out.println("I am parent");
  // }
  public void m1(int i) {
    System.out.println("I am child");
  }
}

public class One extends Test {

  // public void m1 (int i){
  //     System.out.println("I am child");
  //   }

  public void m1(int... i) {
    System.out.println("I am parent");
  }

  public static void main(String[] args) {
    Test t = new One();
    t.m1(2);
  }
}
