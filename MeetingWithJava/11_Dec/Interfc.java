interface I {
  default void m1() {
    System.out.println("I am m1 of interface");
  }

  void m2();
}

public class Interfc implements I {

  public static void main(String[] args) {
    I obj = () -> {
      System.out.println("I am m2 ");
    };
    obj.m2();
  }
}
