class Test {

  // default constructor:
  public Test() {
    System.out.println("I am a default constructor of parent class: ");
  }

  // m1 method
  void m1() {
    System.out.println("I am a m1 method of parent class: ");
  }

  void m2(){
    System.out.println("I am m2 of parent class: ");
  }
}

public class Override extends Test {

  // m1 override method:
  void m1() {
    System.out.println("I am a m1 method of child class: ");
  }

  public static void main(String[] args) {
    Test test = new Override(); // upcast
    Override obj = (Override) test; // downcast
    obj.m2();
  }
}
