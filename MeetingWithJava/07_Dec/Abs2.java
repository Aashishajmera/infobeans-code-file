class A {

  int number;
  String name;

  public A(int number, String name) {
    this.number = number;
    this.name = name;
  }

  public A() {
    System.out.println("default constructor called....");
  }
}

class B extends A {

  public B(int number, String name) {
    super(number, name);
  }

  public static void m1() {
    //   A obja = new A(101, "Aashish");
    A obja = new B(101, "Aashish");
  }
}

public class Abs2 {

  public static void main(String[] args) {
    System.out.println("This is a main method: ");
  }
}
