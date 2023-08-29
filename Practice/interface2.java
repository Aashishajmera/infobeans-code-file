interface DemoInt {
  int a = 4;

  void m1(int a, int b);

  default void m2() {
    System.out.println("I am interface m2");
  }
}

public class interface2 {

  public static void main(String[] args) {
    // lamda expression :
    DemoInt obj2 = (a, b) -> {
      System.out.println("Addition " + (a + b));
    };
    int a = 3, b = 5;
    obj2.m1(a, b);
    obj2.m2();
  }
}
