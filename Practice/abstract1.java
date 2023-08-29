//---------------------------------------------------------------------ABSTRACT-CLASS---------------------------------------------------------------

abstract class Demo {

  // instance variable:
  private int a;

  // perameterized constructor:
  public Demo(int a) {
    this.a = a;
  }

  // default constructor:
  // public Demo() {} 

  // abstract method:
  public abstract void m1();

  public void m2() {
    System.out.println("this is abstract m2 " + a);
  }
}

//---------------------------------------------------------------------CHILD-CLASS---------------------------------------------------------------
class abstract1 extends Demo {

  // default constructor:
  // public abstract1() {}

  // perameterized construct:
  public abstract1(int a) {
    super(a);
  }

  public void m1() {
    System.out.println("This is over ride m1");
  }

  public static void main(String[] args) {
    Demo obj = new abstract1(55);
    
    obj.m1();
    obj.m2();
  }
}





// //---------------------------------------------------------------------ABSTRACT-CLASS---------------------------------------------------------------

// abstract class Demo {

//   // instance variable:
//   private int a;

//   // perameterized constructor:
//   public Demo(int a) {
//     this.a = a;
//   }

//   // default constructor:
//   public Demo() {}

//   // abstract method:
//   public abstract void m1();

//   public void m2() {
//     System.out.println("this is abstract m2 " + a);
//   }
// }

// //---------------------------------------------------------------------CHILD-CLASS---------------------------------------------------------------
// class B extends Demo {

//   // default constructor:
//   public B() {}

//   // perameterized construct:
//   public B(int a) {
//     super(a);
//   }

//   public void m1() {
//     System.out.println("This is over ride m1");
//   }
// }

// //---------------------------------------------------------------------MAIN-CLASS---------------------------------------------------------------

// class abstract1 {

//   public static void main(String[] args) {
//     Demo objB = new B(77);
//     objB.m1();
//     objB.m2();
//   }
// }
