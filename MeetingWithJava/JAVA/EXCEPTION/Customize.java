package JAVA.EXCEPTION;

class AgeException extends Exception {

  public AgeException() {
    super("Age is less then 18");
  }

  public AgeException(String s) {
    super(s);
  }
}

public class Customize {

  public static void main(String[] args) {
    try {
      if (4 <= 18) {
        throw new AgeException();
      } else {
        System.out.println("eligible...");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
