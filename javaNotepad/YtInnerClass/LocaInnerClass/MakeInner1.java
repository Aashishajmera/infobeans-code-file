class Outer {

  private int a = 10;

  void m1() {
    class Inner {

      void Show() {
        System.out.println("i am show method of local inner class: "+a);
      }
    }
    Inner objI;

    // create object of inner class:
    objI = new Inner();
    objI.Show();
  }
}

public class MakeInner1 {

  public static void main(String[] args) {
    // create object of outer class:
    Outer objO = new Outer();
    objO.m1();
  }
}
