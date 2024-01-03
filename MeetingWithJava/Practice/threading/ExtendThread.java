public class ExtendThread extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("run: ");
    }
  }

  public static void main(String[] args) {
    System.out.println("I am main -method: ");
    ExtendThread f1Obj = new ExtendThread();
    f1Obj.start();
    for (int i = 1; i <= 5; i++) {
      System.out.println("main");
    }
  }
}
