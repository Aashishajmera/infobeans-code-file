// import Arithmetic.Subtraction;

class Arithmetic {

  class Addition {

    private int a, b;

    // default constructor:
    public Addition() {}

    public Addition(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public void add() {
      System.out.println("Addition is: " + (a + b));
    }
  }

  class Subtraction {

    private int a, b;

    public Subtraction(int a, int b) {
      this.a = a;
      this.b = b;
    }

    public void sub() {
      System.out.println("Subtraction is: " + (a - b));
    }
  }
}

public class inter5 {

  public static void main(String[] args) {
    Arithmetic objA = new Arithmetic();
    // Arithmetic.Addition objAdd = objA.new Addition(33, 88);
    // Arithmetic.Subtraction objSbb = objA.new Subtraction(20, 10);
    // objAdd.add();
    // objSbb.sub();

    // first way
    new Arithmetic().new Addition(33, 4).add();

    // second way
    objA.new Addition(22, 4).add();

    // third way
    Arithmetic.Addition objAdd = new Arithmetic().new Addition(33, 4);
    objAdd.add();

    Arithmetic.Subtraction objSbb = new Arithmetic().new Subtraction(22, 11);
    objSbb.sub();
  }
}
