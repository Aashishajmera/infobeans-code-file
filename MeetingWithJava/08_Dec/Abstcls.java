class A {

  int number;
  String name;

  public A(int number, String name) {
    this.number = number;
    this.name = name;
    System.out.println("Parameterized construcor called...");
  }

  // default constructor
  public A() {
    System.out.println("Default constructor called of parent class....");
  }
  
}

public class Abstcls extends A {

  public static void main(String[] args) {
    A obj = new A(101, "Aashish");
  }
}
