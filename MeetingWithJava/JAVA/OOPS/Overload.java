package JAVA.OOPS;

public class Overload {

  protected void m1() {
    System.out.println("I am default m1");
  }

  //   public void m1(int a) {
  //     System.out.println("I am have one value : " + a);
  //   }

  //   public void m1(int a) {
  //     System.out.println("I am have one value : " + a);
  //   }

  public void m1(byte a) {
    System.out.println("I am byte parameter method: " + a);
  }

  //   public void m1(long a) {
  //     System.out.println("I am long parameter method: " + a);
  //   }

  public void m1(float a) {
    System.out.println("I am have one value of float : " + a);
  }

  public void m1(double a) {
    System.out.println("I am have one value of double : " + a);
  }

  public static void main(String[] args) {
    Overload obj = new Overload();
    obj.m1(9980.7);
  }

  public static void main(int a){
    System.out.println("I am main method");
  }

}


// package JAVA.OOPS;
// class InnerOverload {
//   public void m1() {
//     System.out.println("I am m1 of parent class");
//   }
// }
// public class Overload extends InnerOverload{
//   // overload method
//   public void m1() {
//     System.out.println("I am m1 method of child class");
//   }
//   public static void main(String[] args) {
//     // Upcasting
//     InnerOverload obj = new Overload();
//     obj.m1();
//   }
// }