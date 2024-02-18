// package JAVA.OOPS;

interface InnerInterfacePractice {
  default void m1() {
    System.out.println("I am interface m1 method");
  }

  public void m2();
}

public class InterfacePractice {

  public void m1() {
    System.out.println("I am child m1");
  }

  public static void main(String[] args) {
    // INTERFACE
    InnerInterfacePractice obj = () -> {
      System.out.println("Hii");
    };
    obj.m2();
    obj.m1();
    // ANONYMOUS INNERCLASS
    // InnerInterfacePractice obj = new InnerInterfacePractice() {
    //   public void m1() {
    //     System.out.println("I am child m1");
    //   }
             
    //   public void m2() {
    //     System.out.println("I am m2");
    //   }
    // };
    // obj.m1();
  }
}
