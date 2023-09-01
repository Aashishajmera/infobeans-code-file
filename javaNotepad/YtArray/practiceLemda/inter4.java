class Outer {

  static class Inner {

    public Inner() {
      System.out.println("inner class constructor: ");
    }

    {
      System.out.println("Initalizer called...");
    }

    static {
      System.out.println("Inner Block");
    }

    public void m1() {
      System.out.println("m1-called....");
    }
  }
}

public class inter4 {

  public static void main(String args[]) {
    Outer.Inner ref = new Outer.Inner();
    ref.m1();
    // Outer.Inner ref = new Outer().new Inner();
    // ref.m1();
  }
}
// class Outer {
//   class Inner {
//     {
//       System.out.println("Initalizer called...");
//     }
//     static {
//       System.out.println("Inner Block");
//     }
//     public static void m1() {
//       System.out.println("m1-called....");
//     }
//   }
// }
// class inter4 {
//   public static void main(String args[]) {
//     // Outer objO = new Outer();
//     // Outer.Inner objI = objO.new Inner();
//     // objI.m1();
//     Outer.Inner.m1();
//   }
// }
