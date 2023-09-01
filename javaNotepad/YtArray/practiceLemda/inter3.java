class Outer {
  static {
    System.out.println("Outer Block");
  }

  class Inner {
    {
      System.out.println("Initalizer Block called...");
    }

    public void m1() {
      System.out.println("Inner -m1()");
    }
  }

  public void m2() {
    System.out.println("Outer - m2");
  }
}

public class inter3 extends Outer {
  public static void main(String[] args) {
    Outer objO = new Outer();
    Outer.Inner objI = objO.new Inner();
    objI.m1();
    
  }
}




// class Outer {
//   static {
//     System.out.println("Outer Block");
//   }

//   class Inner {
//     {
//       System.out.println("Initalizer Block called...");
//     }

//     public void m1() {
//       System.out.println("Inner -m1()");
//     }
//   }

//   public void m2() {
//     System.out.println("Outer - m2");
//   }
// }

// class Child extends Outer {}

// public class inter3 {

//   public static void main(String args[]) {
//     Child child = new Child();
//     Child.Inner ref = child.new Inner();
//     child.m2();
//     ref.m1();
//   }
// }



