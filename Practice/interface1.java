interface DemoInt {
  int a = 4;

  void m1();

  default void m2() {
    System.out.println("I am interface m2");
  }
}

public class interface1 {

  public static void main(String[] args) {

    // Anonymous inner class of interface:
    DemoInt obj = new DemoInt() {
      public void m1() {
        System.out.println("this is m1: ");
      }
    };
    obj.m1();
    obj.m2();


    // lamda expression :
    DemoInt obj2 = () -> {
        System.out.println("I am lamda m1");
    };
    obj2.m1();
    obj2.m2();;


  }
}
