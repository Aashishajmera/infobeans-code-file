// package JAVA_REVISE.EXCEPTION_HANDLING;

class CustomeExc extends Exception {

  public CustomeExc(String msg) {
    super(msg);
  }

  public CustomeExc() {
    super();
  }
}

public class CustomizeException {

  public static void main(String[] args) {
    int age = 12;

    try {
      if (age < 18) {
        throw new CustomeExc();
      }
    } catch (Exception e) {
        e.printStackTrace();
        // System.out.println(e);
    }
  }
}
