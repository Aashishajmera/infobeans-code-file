public class MakeInner2 {

 static void m1() {
    // innner class
    class Inner {

      void wish() {
        System.out.println("i am wish method of inner class ");
      }
    }

    /// create object of inner class:
    Inner objI = new Inner();
    objI.wish();
  }

  public static void main(String[] args) {
    m1();
  }
}
