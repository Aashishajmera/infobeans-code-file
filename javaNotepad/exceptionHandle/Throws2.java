import java.util.Scanner;

class NegativeValueException extends Exception {

  public NegativeValueException(String msg) {
    super(msg);
  }
}

class B {

  void input(Scanner sc) throws NegativeValueException {
    System.out.println("Enter positive number: ");
    int n = sc.nextInt();
    if (n < 0) {
      throw new NegativeValueException("This is error: ");
    }
  }
}

public class Throws2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    B obj = new B();
    try {
      obj.input(sc);
    } catch (NegativeValueException e) {
      System.out.println("Negative value exception: ");
    }

    // obj.input(sc);
  }
}
